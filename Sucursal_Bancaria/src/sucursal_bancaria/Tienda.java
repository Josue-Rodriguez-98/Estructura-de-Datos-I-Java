/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;

import java.util.ArrayList;

/**
 *
 * @author Josue Rodriguez
 */
public class Tienda {
    
    String rtn;
    String nombre;
    ArrayList<Productos>productos = new ArrayList();

    public Tienda(String rtn, String nombre) {
        this.rtn = rtn;
        this.nombre = nombre;
    }

    public Tienda() {
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
