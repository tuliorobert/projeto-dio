package Exceptions;

import javax.swing.JOptionPane;

public class Calc {
    public static void main(String[] args) {
        for (boolean rp = true; rp == true;) {
            try {
                int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));

                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + (a + b), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                rp = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Você precisa digitar um número inteiro!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }

        System.exit(0);
    }
}