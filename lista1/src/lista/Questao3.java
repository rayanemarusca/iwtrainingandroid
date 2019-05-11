package lista;

import javax.swing.*;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Questao3 {
    //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
    public static void main(String[] args) throws ParseException {
       String data = JOptionPane.showInputDialog("Digite sua data de nascimento(dd/MM/yyyy): ");
       SimpleDateFormat formato = new SimpleDateFormat( "dd/MM/yyyy" );
       Date date = formato.parse(data);

       Date time = new Date(System.currentTimeMillis());
       long dt = (time.getTime() - date.getTime());
       long dias = dt / 86400000L;

       JOptionPane.showMessageDialog(null, "Você tem " + dias + " de vida!");
    }
}
