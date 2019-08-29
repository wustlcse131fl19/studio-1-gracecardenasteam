package studio1;

import support.cse131.ArgsProcessor;

public class Average {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Value for first number?");
        int n2 = ap.nextInt("Value for second number?");
        int average = (n1 + n2) / 2;
        System.out.println("The Average of the Values inputted is " + average + ".");

    }}

