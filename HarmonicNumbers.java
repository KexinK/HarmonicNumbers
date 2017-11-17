/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ohio.kk892515.lab05;

/**
 *
 * @author kk892515
 */
/**
 * Kexin Kang CS 2300 Lab 05: Harmonic Numbers 9/27/2017
 */
public class HarmonicNumbers {

    public static void main(String[] args) {
        System.out.println("Harmonic Numbers.");
        System.out.println("Kexin Kang");
        System.out.println("");
        System.out.println("");

        System.out.printf("%4s", "i");
        System.out.printf("%18s", "harm(i)");
        System.out.printf("%18s", "harm(i) - ln(i)");
        System.out.println("");
        System.out.println("");

        double harm = 0.0;
        double diff;
        for (int i = 1; i <= 1000; ++i) {
            harm += 1.0 / i;
            diff = harm - Math.log(1.0 * i);
            System.out.printf("%4d", i);
            System.out.printf("%18.12f", harm);
            System.out.printf("%18.12f", diff);
            System.out.println("");

        }

    }
}
