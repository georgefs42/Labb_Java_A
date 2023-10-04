package com.george.Labb_Java_A;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instantiate
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //Variables
        String player1;
        String player2;
        int die;
        int rounds = 5;
        int player1sum = 0;
        int player2sum = 0;

        //Player 1 - name
        System.out.println("Input player1's name: ");
        player1 = scan.nextLine();
        System.out.println("Hello " + player1 + " you are player ONE");

        //Player 2 - name
        System.out.println("\n" + "Input player2's name: ");
        player2 = scan.nextLine();
        System.out.println("Hello " + player2 + " you are player TWO" + "\n");



        //Game Logic

        /* TODO - Each Round?
         * Each Player -> ThrowDice()
         * Each of round -> calculate sum
         * */

        //Player1 turn
        System.out.println("\n" + player1 + " is throwing");
        for (int i = 0; i< rounds; i++){


            //Dice
            die = rand.nextInt(6) + 1;
            System.out.println(die); //Throw dice

            player1sum += die;
            System.out.println("Sum is: " + player1sum);
        }

        //player2 turn
        System.out.println("\n" + player2 + " is throwing");
        for (int i = 0; i< rounds; i++){


            //Dice
            die = rand.nextInt(6) + 1;
            System.out.println(die); //Throw dice

            player2sum += die;
            System.out.println("Sum is: " + player2sum);
        }
        // TODO who won!

        System.out.printf("\n" + player1 + "'s score: %d\n" + player2 +"'s score: %d\n", player1sum, player2sum);

        if (player2sum > player1sum){
            System.out.println("\n" + player2 + " Won!");
        } else if (player2sum < player1sum) {
            System.out.println("\n" + player1 + " Won!");
        } else {
            System.out.println("\n" + "It was a tie! ");
        }
    }
}