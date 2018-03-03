/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;
import java.net.*;
import java.io.*;

/**
 *
 * @author Josue Rodriguez
 */
public class Conectar {
    
    ServerSocket server;
    Socket socket;
    private final int puerto = 500;//puerto que abriremos en la maquina
    DataOutputStream salida;//envia la informacion (datos)
    BufferedReader entrada;//recibe la informacion (lo guarda)
    
    public void iniciar(){
        try {
            server = new ServerSocket(puerto);
            socket = new Socket();
            socket = server.accept();//Creando la conexion, esperar a que se mande una peticion de otro programa
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensaje = entrada.readLine();//Esta linea es la que guarda el mensaje
            System.out.println(mensaje);//Imprimir opcional
            salida = new DataOutputStream(socket.getOutputStream());//Este envia la info
            salida.writeUTF("Ciao");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
