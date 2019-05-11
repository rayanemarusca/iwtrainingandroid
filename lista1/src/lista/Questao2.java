package lista;

import javax.swing.*;

public class Questao2 {

    //Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
    public static void main(String agrs[]){
        String base = JOptionPane.showInputDialog("Digite o tamanho da base do retângulo: ");
        String altura = JOptionPane.showInputDialog("Digite o tamnho da altura do retângulo: ");

        int numBase = Integer.parseInt(base);
        int numAltura = Integer.parseInt(altura);
        int area = numBase * numAltura;

        JOptionPane.showMessageDialog(null,"A área do retângulo é " + area + "!");

    }
}
