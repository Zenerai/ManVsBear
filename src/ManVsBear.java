import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class ManVsBearMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManVsBear {

    private Dungeon [][] labyrinth = new Dungeon[3][3];
    private Bear[] bears = new bear[9];
    private Man[] man;

    public void play() {
        displayAsciiArt();
        createTheMan();
        createTheBears();
        createTheLabyrinth();
        fight();

    }
    public void displayAsciiArt() {
        System.out.println("asciiart here please");

        System.out.println("Welcome to Man Vs. Bear");
    }
    public void createTheMan() {
    /* The goal of this functioin is to create and populate our player object (Man). 
    this.name = name; 
    this.totalHitPoints = totalHitPoints; 
    this.currentHitPoints = currentHitPoints;
    this.minAttackStrength = minAttackStrength; 
    this.maxAttackStrength = maxAttackStrength; 
    this.numofHeals = numofHeals;
    this.labyrinthLoc = labyrinthLoc;
    
    man = new Man(name, totalHitPoints, currentHitPoints, minAttackStrength, maxAttackStrength, numofHeals, labyrinthLoc)
    
    */
        Scanner scan = new Scanner(System.in);
        boolean goodAnswers = false;
        System.out.println("First thing to do is create the Man!");
        while(goodAnswers== false) { // Also ! equals NOT. So !goodAnswers also works
            try {

                System.out.println("What is the firstname of your man?");
                String firstName = scan.nextLine();
                System.out.println("I love the name, "+firstName+". Strong warrior name.");
                System.out.println("Alright "+firstName+",how many hit points do you want?");
                int currentHitPoints = scan.nextInt();
                System.out.println("Okay. That seems fair. Now, what is your Minimum Attack Strength?");
                int minAttackStrength = scan.nextInt();
                if (minAttackStrength < 10) {
                    System.out.println("Well... You need to hit the gym little buddy...");
                } else {
                    System.out.println("Nice! Good Strength for the bottom amount, tough guy.");
                }
                System.out.println("What about max attack Strength?");
                int maxAttackStrength = scan.nextInt();
                System.out.println("Very well. Last question, how many heals do you want?");
                int numOfHeals = scan.nextInt();
                if (numOfHeals > 4){
                    System.out.println("Give me a break. Make it a challenge at least...");
                } else {
                    System.out.println("Sounds great!");
                }
                int[] startingLoc = new int[]{1,1};


                man = new Man(name, totalHitPoints, currentHitPoints, minAttackStrength, maxAttackStrength, numofHeals, labyrinthLoc);
            } catch (InputMismatchException ime) {
                System.out.print("Invalid entry, try again.");
                scan = new Scanner(System.in);
            }
        }
    }
    public void createTheBears() {
        /*
         * Build out 9 bear. The details/properties are all hard coded.
         * After all 9 bears objects are create, put them in an array and shuffle the array.
         */

        System.out.println("\nNow it's time to generate the 9 bears you will fight and place them in random locations with in the dungeon.");
        System.out.println("Press any key and Enter to continue...");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        Bear bear1 = new Bear("Bubba", 100, 50, 75);
        Bear bear2 = new Bear("Jamestown", 150, 50, 75);
        Bear bear3 = new Bear("The Brick", 250, 50, 75);

        Bear bear4 = new Bear("Amorte", 100, 50, 75);
        Bear bear5 = new Bear("Jefferson", 150, 50, 75);
        Bear bear6 = new Bear("Harrisbear", 250, 50, 75);

        Bear bear7 = new Bear("Pittsbear", 100, 50, 75);
        Bear bear8 = new Bear("Johannesbear", 150, 50, 75);
        Bear bear9 = new Bear("Brave Bear", 250, 50, 75);

        bears = new Bear[9];

        bears[0] = bear1;
        bears[1] = bear2;
        bears[2] = bear3;

        bears[3] = bear4;
        bears[4] = bear5;
        bears[5] = bear6;

        bears[6] = bear7;
        bears[7] = bear8;
        bears[8] = bear9;

        //shuffle the array here
    System.out.print(Array.toString(bears)+"\n");

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            //Implement your own shuffle, swapping the location of 2 bears at a time.
            //Each time the for loop goes through, swap the spots of two bears in the array.
            int randomIndexToSwapA = rand.nextInt(bears.length); //3
            int randomIndexToSwapB = rand.nextInt(bears.length); // 6

            Bear b = bears[randomIndexToSwapA];

            bears[randomIndextoSwapA] = bears[randomInexToSwapB];
            bears[randomIndextoSwapB= b;]
        }
        System.out.println(Arrays.toString(bears));
    }
    public void createTheLabyrinth() {
        // Create 9 dungeon objects
        Dungeon dungeon1 = new Dungeon("Nick's Dirty Closet", "What's that smell, pizza from last year?", 94, bears[0]);
        Dungeon dungeon2 = new Dungeon("Old Shack", "A dirty old shack where bears like to hang out", 86, bears[1]);
        Dungeon dungeon3 = new Dungeon("Mountain Top", "A blissful peak of a mountain, with bears", 56, bears[2]);

        Dungeon dungeon4 = new Dungeon("A Wooded Forest", "An old wooded forest, with bears", 72, bears[3]);
        Dungeon dungeon5 = new Dungeon("A Dirt Road", "Down an old dirt road. Also there's bears", 73, bears[4]);
        Dungeon dungeon6 = new Dungeon("Old Shack", "A dirty old shack where bears like to hang out", 86, bears[5]);

        Dungeon dungeon7 = new Dungeon("Nick's Dirty Closet", "What's that smell, pizza from last year?", 94, bears[6]);
        Dungeon dungeon8 = new Dungeon("Old Shack", "A dirty old shack where bears like to hang out", 86, bears[7]);
        Dungeon dungeon9 = new Dungeon("Nick's Dirty Closet", "What's that smell, pizza from last year?", 94, bears[8]);

        //add them to the array
        Dungeon[] dungeons = new Dungeon[9];
        dungeons[0] = dungeon1;
        dungeons[1] = dungeon2;
        dungeons[2] = dungeon3;

        dungeons[3] = dungeon4;
        dungeons[4] = dungeon5;
        dungeons[5] = dungeon6;

        dungeons[6] = dungeon7;
        dungeons[7] = dungeon8;
        dungeons[8] = dungeon9;

        System.out.println(Arrays.toString(dungeons));

        // shuffle the array
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            //Implement your own shuffle, swapping the location of 2 bears at a time.
            //Each time the for loop goes through, swap the spots of two bears in the array.
            int randomIndexToSwapA = rand.nextInt(bears.length); //3
            int randomIndexToSwapB = rand.nextInt(bears.length); // 6

            Dungeon d = dungeons[randomIndexToSwapA];

            dungeons[randomIndextoSwapA] = dungeons[randomInexToSwapB];
            dungeons[randomIndextoSwapB]=d;
        }
        System.out.println(Arrays.toString(dungeons));
        // add them to the labyrinth
        labyrinth[0][0] = dungeon1[0];
        labyrinth[0][1] = dungeon2[1];
        labyrinth[0][2] = dungeon3[2];

        labyrinth[1][0] = dungeon4[3];
        labyrinth[1][1] = dungeon5[4];
        labyrinth[1][2] = dungeon6[5];

        labyrinth[2][0] = dungeon7[6];
        labyrinth[2][1] = dungeon8[7];
        labyrinth[2][2] = dungeon9[8];
    }
    public void fight() {
        System.out.println("You have entered The Dungeon " + labyrinth[1][1].getdungeon);
        while(true) {
            /*
            1. We know the current location of the man.
            2. Pull out the dungeon and the bear object.
            3. Is this the first fight or the next fight in the sequence?
            4. Are all bears dead? Did I win the game? Am I dead?
             */
            while (true) {
            int[] manCurrentLoc = man.getLabyrinthLoc();
            int manCurrentRow = manCurrentLoc[0];
            int manCurrentCol = manCurrentLoc[1];
            Dungeon manCurrentDungeon = labyrinth[manCurrentRow][manCurrentCol];
            Bear manCurrentBear = manCurrentDungeon.getBear();

            System.out.println("You are now in Dungeon " +manCurrentDungeon.getName()+ " "+manCurrentDungeon.getDescription());
            System.out.println("The bear you are fighting is named: "+manCurrentBear.getName());
            System.out.println("The bear has "+manCurrentBear.getCurrentHitPoints()+" total hit points.");

            System.out.println("Man, it's your turn to go first. Would you like to attack (a) or heal (h)");
            Scanner scan = new Scanner(System.in);
            if (scan.nextLine().equals("a")) {
                //Add Attack Code
                int attackStrength = man.attack();
                manCurrentBear.recordDamage(attackStrength);
                System.out.println("You attacked with an attack strength of "+attackStrength+". "+manCurrentBearw.getName()+ "has "+manCurrentBear.getCurrentHitPoints()+" hitpoints remaining.");
            }
            //Now it's the bear's turn to attack
                int bearattackStrength = manCurrentBear.attack();
                man.recordDamage(bearattackStrength);
                System.out.println("The bear attacked with an attack strength of "+bearattackStrength+". "+man.getName()+ "has "+man.getCurrentHitPoints()+" hitpoints remaining.");
        }
    }



}