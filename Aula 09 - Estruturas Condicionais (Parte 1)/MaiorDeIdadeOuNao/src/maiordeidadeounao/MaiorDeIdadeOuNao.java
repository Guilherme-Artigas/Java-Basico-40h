/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiordeidadeounao;

import java.util.Scanner;

/**
 *
 * @author Guilherme Estudos
 */
public class MaiorDeIdadeOuNao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        
        int idade = 2020 - nasc;
        System.out.println("Sua idade é " + idade);
        
        if (idade >= 18) {
            System.out.println("Maior");
        }
        else {
            System.out.println("Menor");
        }
    }
}
