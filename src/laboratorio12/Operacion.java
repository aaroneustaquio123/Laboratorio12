/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio12;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Operacion {
    private float valor1;
    private float valor2;
    private CajaValida caja1;
    private CajaValida caja2;
    private CajaValida resultado;

    public Operacion(CajaValida caja1, CajaValida caja2, CajaValida resultado) {
        this.caja1 = caja1;
        this.caja2 = caja2;
        this.resultado = resultado;
    }

    
    public Operacion(float valor1 , float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public Operacion(){}


    
    
    public void mostrarResultadoDiv() {
        JTextField caja = resultado.getTxtCaja();
        JLabel labelError = resultado.getLblError();
        
        valor1 = caja1.getNumero();
        valor2 = caja2.getNumero();
        if (valor1 == 0 && valor2 == 0){
            String text = "No se puede dividir cero entre cero";
            labelError.setText(text);
            caja.setText(" ");
            JOptionPane.showMessageDialog(null, text, "", JOptionPane.ERROR_MESSAGE);
        }
        else if(valor2==0){
           String text ="No se puede entre cero";
           labelError.setText(text);
           caja.setText(" ");
           JOptionPane.showMessageDialog(null, text, "", JOptionPane.ERROR_MESSAGE);
        }else {
             float div = div();
             caja.setText(div + " ");
        }
            
        
    }
    public void mostrarResultadoSuma() {
        JTextField caja = resultado.getTxtCaja();
        JLabel labelError = resultado.getLblError();
        
        valor1 = caja1.getNumero();
        valor2 = caja2.getNumero();
       
             float suma = suma();
             caja.setText(suma + " ");
        }
            
    public void mostrarResultadoResta() {
        JTextField caja = resultado.getTxtCaja();
        JLabel labelError = resultado.getLblError();
        
        valor1 = caja1.getNumero();
        valor2 = caja2.getNumero();
       
             float resta = resta();
             caja.setText(resta + " ");
        }   
      
    public void mostrarResultadoMulti() {
        JTextField caja = resultado.getTxtCaja();
        JLabel labelError = resultado.getLblError();
        
        valor1 = caja1.getNumero();
        valor2 = caja2.getNumero();
       
             float Multi = Multi();
             caja.setText(Multi + " ");
        }
    
    public float suma(){ 
           return valor1 + valor2;
    } 
        public float div(){ 
           return valor1 / valor2;
    } 
    public float resta(){ 
           return valor1 - valor2;
    } 
    public float Multi(){ 
           return valor1 * valor2;
    } 
}
