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
public class Tarjeta{
    
    String numero;
    String nombre;
    String descripcion;
    double limite;
    double saldo_actual;
    double saldo_disponible;
    String codigo_seguridad;
    double tasa_interes_mensual;
    Date fecha_corte;
    Date fecha_emision;
    String codigo_cliente;
    Tipo_Tarjeta tipo;
    
    public Tarjeta() {
    }

    public Tarjeta(String numero, String nombre, String descripcion, double limite, double saldo_actual, double saldo_disponible, String codigo_seguridad, double tasa_interes_mensual, Date fecha_corte, Date fecha_emision, String codigo_cliente, Tipo_Tarjeta tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.limite = limite;
        this.saldo_actual = saldo_actual;
        this.saldo_disponible = saldo_disponible;
        this.codigo_seguridad = codigo_seguridad;
        this.tasa_interes_mensual = tasa_interes_mensual;
        this.fecha_corte = fecha_corte;
        this.fecha_emision = fecha_emision;
        this.codigo_cliente = codigo_cliente;
        this.tipo = tipo;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public double getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(double saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }

    public String getCodigo_seguridad() {
        return codigo_seguridad;
    }

    public void setCodigo_seguridad(String codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }

    public double getTasa_interes_mensual() {
        return tasa_interes_mensual;
    }

    public void setTasa_interes_mensual(double tasa_interes_mensual) {
        this.tasa_interes_mensual = tasa_interes_mensual;
    }

    public Date getFecha_corte() {
        return fecha_corte;
    }

    public void setFecha_corte(Date fecha_corte) {
        this.fecha_corte = fecha_corte;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public Tipo_Tarjeta getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Tarjeta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        //return "Tarjeta{" + "numero=" + numero + ", nombre=" + nombre + ", descripcion=" + descripcion + ", limite=" + limite + ", saldo_actual=" + saldo_actual + ", saldo_disponible=" + saldo_disponible + ", codigo_seguridad=" + codigo_seguridad + ", tasa_interes_mensual=" + tasa_interes_mensual + ", fecha_corte=" + fecha_corte + ", codigo_cliente=" + codigo_cliente + ", tipo=" + tipo + '}';
        return descripcion;
    }
    
    
    
}
