package lista;

import javax.swing.*;

public class Questao1  {

//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

    public static void main(String agrs[]){
        String entrada = JOptionPane.showInputDialog( " Digite um numero inteiro: " );
        int num = Integer.parseInt( entrada );
        int antecessor = num - 1;
        JOptionPane.showMessageDialog(null,"O antecessor de " + num + " é " + antecessor + "!");
    }
}
