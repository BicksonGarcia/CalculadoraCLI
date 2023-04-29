package org.alanlopez.principal;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Principal {
    public static void main(String[] args){
       long num1, num2, result;
      /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        num1 = sc.nextLong();
        System.out.println("Ingrese el segundo valor");
        num2 = sc.nextLong();
        result = num1 + num2;
        System.out.println("La suma es 1 " + result);*/
       
       num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor"));
       num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor."));
       result = num1 + num2;
       JOptionPane.showMessageDialog(null, "El resultado es "+String.valueOf(result));
       
    }
}
