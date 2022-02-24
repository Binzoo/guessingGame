/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author binamrathapa
 */
public class guessingGame {
        public static void main(String[] args) {

       for(int i = randomNumber(); i < 10 ; ){
        Scanner personChoose = new Scanner(System.in);
        System.out.println("Welcome to the guessing game!");
        System.out.println("Please choose a number from 1 to 9 to see the computer's guess and your own guess");
        System.out.println("Your Number: ");
        
        int check = randomNumber();
        int storeNum = personChoose.nextInt();

        if (storeNum == check) { 
            youWin();
            break;
        } else {
            youLose();
            
       }
       }

    }

    public static void youLose() {
        System.out.println("You Lose the game");
        System.out.println("Your number and computer gussed number did not match.");
    }

    public static void youWin() {
        System.out.println("You win the game");
        System.out.println("Your number and computer gussed number match.");
    }
    public static int randomNumber(){
        Random rand = new Random();
        int upperdound = 10;
        int int_random = rand.nextInt(upperdound);
        
        return int_random;
    } 
    
}
