/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal_bancaria;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Josue Rodriguez
 */
public class Fecha_Hora implements Runnable{
    
    JLabel label1, label2;
    Date f;

    public Fecha_Hora(JLabel label1, JLabel label2) {
        this.label1 = label1;
        this.label2 = label2;
    }
    
    

    @Override
    public void run() {
        while(true){
            f = new Date();
            DateFormat f1 = new SimpleDateFormat("dd/MM/yy");
            DateFormat f2 = new SimpleDateFormat("hh:mm:ss");
            label1.setText(f1.format(f));
            label2.setText(f2.format(f));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}
