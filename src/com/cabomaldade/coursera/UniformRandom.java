package com.cabomaldade.coursera;

/* Solution by André Vasconcelos Souto
    1.2.34 Three-sort. Write a program that takes three
    integer command-line arguments and prints them in ascending order.
    Use Math.min() and Math.max().
 */

public class UniformRandom {
    public static void main(String[] args) {

        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);

        int min = Math.min(Math.min(arg1, arg2),arg3);
        int max = Math.max(Math.max(arg1, arg2),arg3);
        int medium;

        if (arg1 != min && arg1 != max){
            medium = arg1;
        } else if (arg2 != min && arg2 != max){
            medium = arg2;
        } else {
            medium = arg3;
        }

        System.out.println(min + " - " + medium + " - " + max);
    }
}
