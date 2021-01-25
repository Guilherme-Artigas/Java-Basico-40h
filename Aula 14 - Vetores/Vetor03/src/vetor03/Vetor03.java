/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Guilherme Estudos
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v[] = {3.8, 5.1, 9.7, 8.6};
        
        Arrays.sort(v);
        for (double valor: v) {
            System.out.println(valor);
        }
    }
}