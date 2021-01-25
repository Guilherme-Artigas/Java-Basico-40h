/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author Guilherme Estudos
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        for (int c = 0; c < 4; c++) {
            System.out.println("Cambalhota " + c);
        }
        */
        for (int c1 = 0; c1 < 4; c1++) {
            for (int c2 = 1; c2 < 4; c2++) {
                System.out.println(c1 + " " + c2);
            }
        }
    }
}