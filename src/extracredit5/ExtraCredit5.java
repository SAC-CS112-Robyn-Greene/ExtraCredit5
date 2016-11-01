/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit5;

/**
 *
 * @author Robyn
 */
import java.util.*;

public class ExtraCredit5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int dice1 = 0;
        int dice2 = 0;
        String reply = ("y");
        int total;

        //while up first  
        for (total = 0; total <= dice1 + dice2; total++) {
            System.out.println("Let's roll some dice!!");
            while (dice1 + dice2 != 7 && dice1 + dice2 != 11) {
                dice1 = rand.nextInt(6) + 1;
                dice2 = rand.nextInt(6) + 1;
                System.out.print(dice1);
                System.out.print(" ");
                System.out.println(dice2);
            }
            System.out.print("Rolled  ");
            System.out.println(dice1 + dice2);
            //do while is next
            do {
                System.out.print("Answer with Y or N... ");
                System.out.print("Would you like a drink?  ");
                reply = input.next();

                if (reply.equalsIgnoreCase("y")) {
                    System.out.println("Lets have a soda!");
                    break;
                } else if (reply != "y") {
                    System.out.println("Let me know if you change your mind.");
                    break;
                } else {

                }

            } while (true);

            break;
        } //for

    }//main

}//class
