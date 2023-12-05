/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16.pkg05;

import javax.swing.JOptionPane;

/**
 *
 * @author maria.emsilva35
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String numeroString = JOptionPane.showInputDialog("Digite um número:");
    int numero = Integer.parseInt(numeroString);
    String resultado = "";
    for (int i = 1; i <= 10; i++) {
        resultado += numero + " x " + i + " = " + (numero * i) + "\n";}
    JOptionPane.showMessageDialog(null, resultado);
    }
}
   
