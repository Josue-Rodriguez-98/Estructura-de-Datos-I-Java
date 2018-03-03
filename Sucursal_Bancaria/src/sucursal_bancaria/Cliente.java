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
public class Cliente extends Usuario{
    
    private String codigo_cliente;
    private String nombre;
    private String identidad;
    private String telefono_fijo;
    private String telefono_celular;
    private String trabajo;
    private String direccion;
    private ArrayList<Cuenta_Bancaria> cuentas = new ArrayList();
    private ArrayList<Tarjeta> tarjetas = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(String codigo_cliente, String nombre, String identidad, String telefono_fijo, String telefono_celular, String trabajo, String username, String password, String direccion) {
        super(username, password);
        this.codigo_cliente = codigo_cliente;
        this.nombre = nombre;
        this.identidad = identidad;
        this.telefono_fijo = telefono_fijo;
        this.telefono_celular = telefono_celular;
        this.trabajo = trabajo;
        this.direccion=direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    
    public ArrayList<Cuenta_Bancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta_Bancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    @Override
    public String toString() {
        return nombre;
    }     
    
    
}
