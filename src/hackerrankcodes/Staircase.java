/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankcodes;

import java.util.Scanner;

/**
 *
 * @author DATA INFOSEC
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (j < n) {
                    System.out.println(" ");
                } else {
                    System.out.print("#");
                }

            }
            System.out.println("");
        }

    }

}
