import java.util.Random;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println("->0 mean stone.\n->1 mean scissor.\n->2 mean paper.\n");
        System.out.println("SELECT ANY NUMBER ACCORDING TO YOUR SELECTION \n");
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int c;
        int c1=0;
        int u1=0;
        int i=1;
        while(i<=5){
            System.out.println("Match "+i);
            System.out.println("YOUR'S CHANCE!");
            int u=sc.nextInt();
            System.out.println("COMPUTER'S CHANCE!");
            c=ran.nextInt(3);
            System.out.println(c);
            System.out.println("   ");
            switch (c){
                case 0:
                    switch (u){
                        case 0:
                            System.out.println("This match is TIE!");
                            break;
                        case 1:
                            System.out.println("Computer WON this match.");
                            c1++;
                            break;
                        case 2:
                            System.out.println("Congrates! You WON this match.");
                            u1++;
                            break;
                        default:
                            System.out.println("You are not entered a valid number try again");
                            i--;
                    }
                    break;
                case 1:
                    switch (u){
                        case 0:
                            System.out.println("Congrates! You WON this match.");
                            u1++;
                            break;
                        case 1:
                            System.out.println("This match is TIE!");
                            break;
                        case 2:
                            System.out.println("Computer WON this match.");
                            c1++;
                            break;
                        default:
                            System.out.println("You are not entered a valid number try again");
                            i--;
                    }
                    break;
                case 2:
                    switch (u){
                        case 0:
                            System.out.println("Computer WON this match.");
                            c1++;
                            break;
                        case 1:
                            System.out.println("Congrates! You WON this match.");
                            u1++;
                            break;
                        case 2:
                            System.out.println("This match is TIE!");
                            break;
                        default:
                            System.out.println("You are not entered a valid number try again");
                            i--;
                    }
                    break;
            }
            i++;
            System.out.println("\n\n\n");
        }
        System.out.printf("\nYou won %d matches.\nComputer won %d matches.", u1 , c1);
        System.out.println("");
        if(c1<u1){
            System.out.println("\nYou are a WINNER of this game");
        }
        else if(c1>u1){
            System.out.println("\nComputer is a WINNER of this game");
        }
        else if(c1==u1){
            System.out.println("\nThis game is TIE");
        }
    }
}
