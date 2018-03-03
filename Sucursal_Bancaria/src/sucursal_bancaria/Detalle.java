/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;

/**
 *
 * @author Josue Rodriguez
 */
public class Detalle {
    
    String codigo;
    String descripcion;
    String fecha;
    double monto;

    public Detalle() {
    }

    public Detalle(String codigo, String descripcion, String fecha,double monto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Detalle{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", monto=" + monto + '}';
    }
    
    
    
}
