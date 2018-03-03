/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Josue Rodriguez
 */
public class Cuenta_Bancaria implements Serializable {
    
    private String num_cuenta;
    private String descripcion;
    private double saldo;
    private Date fecha_creacion;
    private String cod_cliente;
    private static final long SerialVersionUID = 666L;
    

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public Cuenta_Bancaria() {
    }

    public Cuenta_Bancaria(String num_cuenta, String descripcion, double saldo, Date fecha_creacion, String cod_cliente) {
        this.num_cuenta = num_cuenta;
        this.descripcion = descripcion;
        this.saldo = saldo;
        this.fecha_creacion = fecha_creacion;
        this.cod_cliente = cod_cliente;
    }

    @Override
    public String toString() {
        return num_cuenta;
    }
    
    
}
