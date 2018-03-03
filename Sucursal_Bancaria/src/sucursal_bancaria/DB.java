/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Josue Rodriguez
 */
public class DB {
    
    private String base_datos;
    private Connection dbcon;
    public Statement query;
    
    public DB(String base_datos){
        this.base_datos=base_datos;
    }

    public DB() {
    }
    
    public void setBase_datos(String base_datos) {
        this.base_datos = base_datos;
    }        
    
   public void conectar(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            dbcon = DriverManager.getConnection(BaseDeDatos, "PROYECTO", "proyecto");
            query = dbcon.createStatement();
            /*if(dbcon!=null){
                System.out.println("STATUS: CONNECTED");
            }else{
                System.out.println("CONNECTION FAILED");
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
   public void desconectar() {
        try {
            query.close();
            dbcon.close();
            /*if(dbcon!=null){
                System.out.println("STATUS: DISCONNECTED");
            }else{
                System.out.println("DISCONNECTION FAILED");
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
   public void commit(){
       try{
           dbcon.commit();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
    
}
