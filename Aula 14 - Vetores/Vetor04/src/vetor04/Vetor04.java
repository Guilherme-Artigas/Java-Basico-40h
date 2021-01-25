/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Guilherme Estudos
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = {9, 3, 5 , 6, 15 , 18 , 23, 54 ,56};
        
        for (int valor: v) {
            System.out.print(valor + ", ");
        }
        System.out.println("");
        System.out.println("");
        
        int posicao = Arrays.binarySearch(v, 56);
        System.out.println("O valor 56, esta dentro da posição " + posicao + " do vetor.");
    }   
}