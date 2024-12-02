import java.util.Random;
import java.util.Scanner;

class Gamble
{
public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int wealth = 100;
    int percent = 70;
    int gambleMax = 21;

    int choiceInt = 0;
    int gamble;
    boolean showSystemProperties = false;

    System.out.println("\n\nWelcome to the Gamblers Coin Toss arena!");
        try {
        Thread.sleep(500);
        } catch (InterruptedException a) {
        a.printStackTrace();
        }
    System.out.println("You Start off with a $100 and can gamble it to your hearts desire.");
        try {
        Thread.sleep(1000);
        } catch (InterruptedException a) {
        a.printStackTrace();
        }
    System.out.println("Your gamble may not exceed more than 70% of your wealth," +
            " this reduces by 5% each turn.");
        try {
        Thread.sleep(1000);
        } catch (InterruptedException a) {
        a.printStackTrace();
        }
    System.out.println("\nAfter 6 Tries OR When the Max Gamble is in the single digits the game ends.");
        try {
        Thread.sleep(1000);
        } catch (InterruptedException a) {
        a.printStackTrace();
        }
    System.out.println("Good Luck!");
    System.out.println("Press Any Key To Start...");
    String Null = sc.nextLine();


        System.out.println("Dice Game Starting...\n");

        for (int i = 1; gambleMax > 20 && i < 7 ; i++)
            {
            System.out.println("\n\n\n\nTurn Number: " + i);
            System.out.println("Current Balance: $" + wealth);
            gambleMax = wealth * percent / 100;
            System.out.println("Max Gamble Allowed $" + gambleMax);
            percent = percent - 5;


            System.out.print("Enter Your Call (H/T): ");
            String Call = sc.next();
            //I think needed to get char output from scanner
            char choice = Call.charAt(0);

            System.out.print("\nHow Much Would You Like To Gamble: ");
            gamble = sc.nextInt();

            //Is it higher than limit?
            if (gamble > gambleMax)
                {
                System.out.println("\nGamble too high!");
                }
            else if (gamble <= gambleMax)
                {
                int result = new Random().nextInt(2) + 1;

                //Char to int for ease of calc
                switch (choice)
                    {
                    case 'H':
                        choiceInt = 1;
                        System.out.println("\nYou Chose Heads...");
                        break;
                    case 'T':
                        choiceInt = 2;
                        System.out.println("\nYou Chose Tails...");
                        break;
                    default:
                        System.out.println("Invalid Input.");
                    }
                //System.out.println(result);
                //System.out.println(choiceInt);
                try {
                Thread.sleep(350);
                } catch (InterruptedException a) {
                a.printStackTrace();
                }
                switch (result)
                    {
                    case 1:
                        System.out.println("\nThe coin fell on heads!");
                        break;
                    case 2:
                        System.out.println("\nThe coin fell on tails!");
                        break;
                    default:
                        System.out.println();
                    }

                if (choiceInt == result)
                    {
                    wealth = wealth + gamble;
                    System.out.println("You chose right and now have a wealth of $" + wealth);
                    }
                else
                    {
                    wealth = wealth - gamble;
                    System.out.println("Welp... It Didn't pay off. Current wealth: $" + wealth);
                    }
                try {
                Thread.sleep(250);
                } catch (InterruptedException a) {
                a.printStackTrace();
                }
                }

            }
        System.out.println("\n\n\nGame is over!");
        System.out.println("\nFinal Score $" + wealth + "!");

        showSystemProperties = true;


        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on December 1st 2024");
            }




    }
}
