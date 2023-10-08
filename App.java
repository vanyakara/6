/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete n: ");
        int n=scan.nextInt();
        double fibN=calculateFibonacci(n);
        System.out.println("chisloto na Fibonacci za "+n+" e "+(long)fibN);
    }
    public static double calculateFibonacci(int n){
        double sqrt5=Math.sqrt(5);
        double phi=(1+sqrt5)/2;
        double psi=(1-sqrt5)/2;
        double fibN=(Math.pow(phi, n)-Math.pow(psi,n))/sqrt5;
        return fibN;
    }
}
