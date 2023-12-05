/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro.gburim
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        
        // Operação selecionadas pelo usuário
        switch (escolha) {
            // Soma
            case 0 -> 
                realizarSoma();
            // Subtração
            case 1 -> 
                realizarSubtracao();
            // Multiplicação    
            case 2 -> 
                realizarMultiplicacao();
            // Divisão
            case 3 -> 
                realizarDivisao();
            default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
        // Realização da soma
    private static void realizarSoma() {
        double numero1 = lerNumero("Digite o primeiro número:");
        double numero2 = lerNumero("Digite o segundo número:");
        double resultado = numero1 + numero2;
        exibirResultado("Soma", resultado);
    }
        // Realização da subtração
    private static void realizarSubtracao() {
        double numero1 = lerNumero("Digite o primeiro número:");
        double numero2 = lerNumero("Digite o segundo número:");
        double resultado = numero1 - numero2;
        exibirResultado("Subtração", resultado);
    }
        // Realização da mutiplicação
    private static void realizarMultiplicacao() {
        double numero1 = lerNumero("Digite o primeiro número:");
        double numero2 = lerNumero("Digite o segundo número:");
        double resultado = numero1 * numero2;
        exibirResultado("Multiplicação", resultado);
    }
        // Realização da divisão
    private static void realizarDivisao() {
        double numero1 = lerNumero("Digite o primeiro número:");
        double numero2 = lerNumero("Digite o segundo número:");
        
        // Se o uuário digitar 0, não vai ser possivel realizar a divisão
        if (numero2 == 0) {
            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
            return;
        }
        // resultado
        double resultado = numero1 / numero2;
        exibirResultado("Divisão", resultado);
    }
    
    private static double lerNumero(String mensagem) {
        String input = JOptionPane.showInputDialog(mensagem);
        
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido.");
            return lerNumero(mensagem);
        }
    }
    
    private static void exibirResultado(String operacao, double resultado) {
        JOptionPane.showMessageDialog(null, "Resultado da " + operacao + ": " + resultado);
    }
}
