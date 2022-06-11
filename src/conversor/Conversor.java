/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversor;
import javax.swing.*;
/**
 *
 * @author familia garcia reyes
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float numero, resultado;
        int pp = 1;
        do{
        String[] opciones={"Moneda", "Temperatura"};
        String respuesta=(String) JOptionPane.showInputDialog(null, "seleccione opcion", "conversor", JOptionPane.QUESTION_MESSAGE, null, opciones,0);
        if(respuesta=="Moneda"){
            String[] op1={
                "De Pesos(MX) a Dolar(US)","De Pesos(MX) a Euro(EU)",
                "De Pesos(MX) a Libras(UK)","De Pesos(MX) a Yen(JP)",
                "De Pesos(MX) a Won(KS)","De Dolar(US) a Pesos(MX)",
                "De Euro(EU) a Pesos(MX)","De Libras(UK) a Pesos(MX)"
            };
            String moneda=(String) JOptionPane.showInputDialog(null,"seleccione la opcion", "Elija moneda a convertir",JOptionPane.QUESTION_MESSAGE,null,op1,0);
            switch(moneda){
                case "De Pesos(MX) a Dolar(US)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(MX) a Dolar(US)"));
                    resultado=(float) (numero * 0.051);
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Pesos(MX) a Euro(EU)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(MX) a Euro(EU)"));
                    resultado=(float) (numero * 0.048);
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Pesos(MX) a Libras(UK)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(MX) a Libras(UK)"));
                    resultado=(float) (numero * 0.041);
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Pesos(MX) a Yen(JP)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(MX) a Yen(JP)"));
                    resultado=(float) (numero * 6.79);
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Pesos(MX) a Won(KS)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Pesos(MX) a Won(KS)"));
                    resultado=(float) (numero * 64.50);
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
            }
        }else if(respuesta=="Temperatura"){
            String[] op2={
                "De Celsius(C) a Fahrenheit(F)","De Celsius(C) a Kelvin(K)",
                "De Fahrenheit(F) a Celsius(C)","De Fahrenheit(F) a Kelvin(K)",
                "De Kelvin(K) a Celsius(c)","De Kelvin(K) a Fahrenheit(F)"
            };
            String temperatura=(String) JOptionPane.showInputDialog(null,"seleccione la opcion", "Elija moneda a convertir",JOptionPane.QUESTION_MESSAGE,null,op2,0);
            switch(temperatura){
                case "De Celsius(C) a Fahrenheit(F)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Celsius(C) a Fahrenheit(F)"));
                    resultado=(float) (numero * 33.8);
                    JOptionPane.showMessageDialog(null, resultado);
                    int p=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Celsius(C) a Kelvin(K)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Celsius(C) a Kelvin(K)"));
                    resultado=(float) (numero * 274.15);
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Fahrenheit(F) a Celsius(C)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Fahrenheit(F) a Celsius(C)"));
                    resultado=(float) (numero * (-17.2222222));
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Fahrenheit(F) a Kelvin(K)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Fahrenheit(F) a Kelvin(K)"));
                    resultado=(float) (numero * 255.927778);
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Kelvin(K) a Celsius(c)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Kelvin(K) a Celsius(c)"));
                    resultado=(float) (numero * (-272.15));
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                case "De Kelvin(K) a Fahrenheit(F)":
                    numero=Float.valueOf(JOptionPane.showInputDialog(null, "De Kelvin(K) a Fahrenheit(F)"));
                    resultado=(float) (numero * (-457.87));
                    JOptionPane.showMessageDialog(null, resultado);
                    pp=JOptionPane.showConfirmDialog(null, "deseas terminar");
                    break;
                }
            }
        }while(pp==1);
    }
}
