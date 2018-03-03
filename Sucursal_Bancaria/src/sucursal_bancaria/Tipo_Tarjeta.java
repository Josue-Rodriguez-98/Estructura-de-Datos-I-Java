/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Josue Rodriguez
 */
public class Tipo_Tarjeta{
    
    String codigo;
    String descripcion;
    double limite_maximo;
    ArrayList<String> beneficios = new ArrayList();
    
    public Tipo_Tarjeta() {
    }

    public Tipo_Tarjeta(String codigo, String descripcion, double limite_maximo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.limite_maximo = limite_maximo;
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

    public double getLimite_maximo() {
        return limite_maximo;
    }

    public void setLimite_maximo(double limite_maximo) {
        this.limite_maximo = limite_maximo;
    }

    public ArrayList<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(ArrayList<String> beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
}
