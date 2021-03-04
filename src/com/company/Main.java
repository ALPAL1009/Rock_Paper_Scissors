package com.company;

import java.util.Scanner;


public class Main       {


    public static void main(String[] args) {

        game();
    }



    public static void game() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rock, paper, or scissors\nTo end the game, enter quit\n");

        // Continue playing unless user wants to end game
        while(true) {

            String user = in.nextLine();

            if(user.equals("quit"))
                break;

            //check if user enters valid answer
            if(!user.equals("rock") && !user.equals("paper") && !user.equals("scissors"))
                System.out.println("Invalid user input!\nTry rock, paper, or scissors\n\n");

            else {
                int random = (int)(Math.random()*3);

                String pc;
                if(random == 0)
                    pc = "rock";
                else if(random == 1)
                    pc = "paper";
                else
                    pc = "scissors";

                System.out.println(user + " vs " + pc);

                //Display game results
                if(user.equals(pc))
                    System.out.println("Stalemate!\n\n");
                else if((user.equals("rock") && pc.equals("scissors")) || (user.equals("scissors") && pc.equals("paper")) || (user.equals("paper") && pc.equals("rock")))
                    System.out.println("You WON against the computer!\n\n");
                else
                    System.out.println("You LOST against the computer!\n\n");
            }
        }

        System.out.println("Leaving game....");

    }

}




