/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author Guilherme Estudos
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma (int p1, int p2) {
        int soma = p1 + p2;
        System.out.println("Soma: " + soma);
    }
    
    public static void main(String[] args) {
        soma(5, 3);
    }   
}