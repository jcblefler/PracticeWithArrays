package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Create an array to hold the numbers 1-10
//        Loop through that array and sum the numbers 1-10, then print that total to the screen

//        int[] firstArray = new int[10];
//        int sum = 0;
//
//        firstArray[0] = 1;
//        firstArray[1] = 2;
//        firstArray[2] = 3;
//        firstArray[3] = 4;
//        firstArray[4] = 5;
//        firstArray[5] = 6;
//        firstArray[6] = 7;
//        firstArray[7] = 8;
//        firstArray[8] = 9;
//        firstArray[9] = 10;
//
//
//        for (int i = 0; i < 11; i++){
//            sum = firstArray[i] + sum;
//        }
//        System.out.println(sum);


//        Create an array to hold 10 number inputs from the user and print that total to the screen

//        Scanner scanner = new Scanner(System.in);
//
//        int[] secondArray = new int[10];
//        int sum = 0;
//
//        for (int i = 0; i < 10; i++){
//
//            System.out.print("Input a number: ");
//            int userInput = scanner.nextInt();
//            secondArray[i] = userInput;
//
//        }
//        for (int j = 0; j < 10; j++){
//            sum = secondArray[j] + sum;
//        }
//        System.out.println("The sum =" + sum);


//        Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers

//        Scanner scanner = new Scanner(System.in);
//
//        int[] secondArray = new int[10];
//        int sum = 0;
//        double average;
//
//        for (int i = 0; i < 10; i++){
//
//            System.out.print("Input a number: ");
//            int userInput = scanner.nextInt();
//            secondArray[i] = userInput;
//
//        }
//        for (int j = 0; j < 10; j++){
//            sum = secondArray[j] + sum;
//        }
//        average = sum / 10;
//        System.out.println("The average = " + average);



//        Create an array to store 3 names, loop through that array to print out the names
//
//        String[] nameArray = new String[3];
//
//        nameArray[0] = "Jim";
//        nameArray[1] = "Jack";
//        nameArray[2] = "James";
//
//        for(int i = 0; i < 3; i++){
//            System.out.println(nameArray[i]);
//        }

//        Create an array with the following values: [2,5,9,0,2,1,8,5,4]
//        Loop through the array and print out the index each time the value equals 5

//        int[] myArray = new int[9];
//        myArray[0] = 2;
//        myArray[1] = 5;
//        myArray[2] = 9;
//        myArray[3] = 0;
//        myArray[4] = 2;
//        myArray[5] = 1;
//        myArray[6] = 8;
//        myArray[7] = 5;
//        myArray[8] = 4;
//
//        for (int i = 0; i < 9; i++){
//            if (myArray[i] == 5){
//                System.out.println("5 found at index: " +  i);
//            }
//        }


//        Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array

//        int[] firstArray = new int[10];
//
//        firstArray[0] = 1;
//        firstArray[1] = 2;
//        firstArray[2] = 3;
//        firstArray[3] = 4;
//        firstArray[4] = 5;
//        firstArray[5] = 6;
//        firstArray[6] = 7;
//        firstArray[7] = 8;
//        firstArray[8] = 9;
//        firstArray[9] = 10;
//
//
//        for (int i = 9; i > -1; i--) {
//            System.out.println(firstArray[i]);
//        }


//        Given the following array: ['w','t','y','h','k']
//        Loop through the array and replace the the letter 't' with the word "hello" once it's found
//
//        String[] stringArray = new String[5];
//
//        stringArray[0] = "w";
//        stringArray[1] = "t";
//        stringArray[2] = "y";
//        stringArray[3] = "h";
//        stringArray[4] = "k";
//
//        for (int i = 0; i < 5; i++){
//            if (stringArray[i].equals("t")){
//                stringArray[i] = "hello";
//                System.out.println(stringArray[i]);
//            } else{
//                System.out.println(stringArray[i]);
//            }
//
//        }


//        Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
//        Write a program that will print out all matching pairs from arrays 1 and 2.
//        Expected output:
//        (7,7) and (6,6)


        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];

        arrayOne[0] = 1;
        arrayOne[1] = 7;
        arrayOne[2] = 6;
        arrayOne[3] = 5;
        arrayOne[4] = 9;

        arrayTwo[0] = 2;
        arrayTwo[1] = 7;
        arrayTwo[2] = 6;
        arrayTwo[3] = 3;
        arrayTwo[4] = 4;


        for (int i = 0; i < 5; i++){
            if (arrayOne[i] == arrayTwo[i]){
                System.out.println("("+ arrayOne[i] +"," + arrayTwo[i] + ")");
            }

        }


    }

}
