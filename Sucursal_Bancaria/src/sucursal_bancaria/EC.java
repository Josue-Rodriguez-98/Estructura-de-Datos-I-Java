/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;

import java.util.Date;

/**
 *
 * @author Josue Rodriguez
 */
public class EC {
    
    String codigo;
    String descripcion;
    String mes;
    String año;
    double pago_contado;
    double pago_minimo;
    Date fecha_maxima;
    String fecha_pago_realizado;
    String no_tarjeta;

    public EC() {
    }

    public EC(String codigo, String descripcion, String mes, String año, double pago_contado, double pago_minimo, Date fecha_maxima, String fecha_pago_realizado, String no_tarjeta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.mes = mes;
        this.año = año;
        this.pago_contado = pago_contado;
        this.pago_minimo = pago_minimo;
        this.fecha_maxima = fecha_maxima;
        this.fecha_pago_realizado = fecha_pago_realizado;
        this.no_tarjeta = no_tarjeta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getPago_contado() {
        return pago_contado;
    }

    public void setPago_contado(double pago_contado) {
        this.pago_contado = pago_contado;
    }

    public double getPago_minimo() {
        return pago_minimo;
    }

    public void setPago_minimo(double pago_minimo) {
        this.pago_minimo = pago_minimo;
    }

    public Date getFecha_maxima() {
        return fecha_maxima;
    }

    public void setFecha_maxima(Date fecha_maxima) {
        this.fecha_maxima = fecha_maxima;
    }

    public String getFecha_pago_realizado() {
        return fecha_pago_realizado;
    }

    public void setFecha_pago_realizado(String fecha_pago_realizado) {
        this.fecha_pago_realizado = fecha_pago_realizado;
    }

    public String getNo_tarjeta() {
        return no_tarjeta;
    }

    public void setNo_tarjeta(String no_tarjeta) {
        this.no_tarjeta = no_tarjeta;
    }

    @Override
    public String toString() {
        return "EC{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", mes=" + mes + ", a\u00f1o=" + año + ", pago_contado=" + pago_contado + ", pago_minimo=" + pago_minimo + ", fecha_maxima=" + fecha_maxima + ", fecha_pago_realizado=" + fecha_pago_realizado + ", no_tarjeta=" + no_tarjeta + '}';
    }
    
    
    
}
