/*
    Author: VAIBHAV
    Place: Delhi, India
    Date: 04/04/2026
    Last Edited:
    Description: This program will help you to play lucky7 game. In this game, you will be in a virtual casino with an initial amount. Now you will bet an amount and then two dice will roll. If the sum of dice's result is equal to 7, you will win, otherwise lose. If win's you will be awarded by three times of your bet amount. But if lose you will lose all your bet amount.
    Previous Improvements:
    Future Improvements:
*/

package com.vaibhav;

import java.util.Random;
import java.util.Scanner;

// Player class
class Player {
    Scanner sc = new Scanner(System.in);

    // Declartion objects of private classes
    private Dice dice; // Declaring object of dice class

    // Variable declaration
    int gameAmount;
    int betAmount;
    int sumOfDice;

    // player class constructor
    public Player() {

        // Initializing objects of private classes
        dice = new Dice();  // Initializing object of dice class

        System.out.println("||| Welcome to V's Casino |||");
        System.out.println("⚠️ Play at your own risk. Your money is at stake.");
        System.out.println("Do you have the guts? (Yes/No): ");
        String gameStartChoice = sc.next();
        if (gameStartChoice.equalsIgnoreCase("Yes")) {
            startGame();
        } else {
            System.out.println("No worries, maybe next time!");
        }
    }

    // Private start-game method
    private void startGame() {
        System.out.println("Great! Welcome to the game.");
        System.out.println("Enter the amount of money you bring to the table: ");
        gameAmount = sc.nextInt();
        System.out.println("Enter the bet amount: ");
        betAmount = sc.nextInt();
        System.out.println("💰 Current balance: " + gameAmount);
        System.out.println("💰 Betting amount: " + betAmount);

        if (betAmount > gameAmount) {
            System.out.println("❌ You cannot bet more than your current balance.");
            return;
        }
        else if (betAmount <= 0) {
            System.out.println("❌ Bet amount must be greater than 0.");
            return;
        }
        else {
            dice.diceRoll(); // Calling diceroll method in private dice class
        }
    }

    // Private dice class
    private class Dice {
        Random rand = new Random();

        //Private diceroll method used to roll two dice
        private void diceRoll() {
            System.out.println("Dice Rolling...");
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            System.out.println("🎲 Dice 1: " + dice1);
            System.out.println("🎲 Dice 2: " + dice2);
            sumOfDice = dice1 + dice2;
        }
    }
}

public class Lucky7 {
    public static void main(String[] args) {

    }
}
