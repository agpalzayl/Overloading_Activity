package com.company;

public class Overloading_Activity {

    //instance variables for third method
    private static int num1 = 45;
    private static int num2 = 100;

    //instance variables for fourth method
    private static double var1 = 3.14;
    private static double var2 = 9.8;

    //method that is used to compute for the sum of two numbers
    private static int computeSum1(int num1, int num2) {
        return num1 + num2;
    }

    //method that is used to compute for the sum of three numbers
    private static int computeSum2(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //method that returns the greater value between two numbers
    private static int greaterValue(int num1, int num2) {
        //if statement is used to check whether if it's true or not
        if(num1 > num2) {
            return num1;
        }else if(num2 > num1) {
            return num2;
            }
            return greaterValue(45,100);
        }

    //method that returns the greater value between two numbers, data type: double
    private static double greaterDoubleValue(double var1, double var2) {
        //if statement is used to check whether if it's true or not
        if(var1 > var2) {
            return var1;
        }else if(var2 > var1) {
            return var2;
        }
        return greaterDoubleValue(3.14, 9.8);
    }


    public static void main (String[] args) {
        System.out.println("IT113 - Overloading Activity.");

        System.out.println("The sum of 90 and 50 is " + Overloading_Activity.computeSum1(90,50));
        System.out.println("The sum of 10 and 20 and 30 is " + Overloading_Activity.computeSum2(10, 20, 30));


        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterDoubleValue(3.14,9.8));

    }
}


