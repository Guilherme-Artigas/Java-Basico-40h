/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author Guilherme Estudos
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int p1, int p2) {
        int soma = p1 + p2;
        return soma;
    }
    
    public static void main(String[] args) {
        int s = soma(8, 9);
        System.out.println(s);
    }    
}