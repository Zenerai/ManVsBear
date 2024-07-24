import java.util.Random;

public static class Man {
    private String name;
    private int totalHitPoints;
    private int currentHitPoints;
    private int minAttackStrength;
    private int maxAttackStrength;
    private int numberOfHeals;
    private int [] labyrinthLoc;

    public Man(String name, int totalHitPoints, int currentHitPoints, int minAttackStrength, int maxAttackStrength, int numOfHeals, int[] labyrinthLoc) {

    }

    this.name = name;
    this.totalHitPoints = totalHitPoints;
    this.currentHitPoints = currentHitPoints;
    this.minAttackStrength = minAttackStrength;
    this.maxAttackStrength = maxAttackStrength;
    this.numOfHeals =numOfHeals;
    this.labyrinthLoc = labyrinthLoc;

}

public String getName() {
    return name;

}

public int getCurrentHitPoints() {
    return numofHeals;

}
public void setNumOfHeals(int, numOfHeals) {
    this.numofHeals = numOfHeals;
}

public int [] getLabyrinthLoc() {
    return labyrinthLoc;

    public void setLabyrinthLoc(int[] labyrinthLoc) {
        this.labyrinthLoc = labyrinthLoc;
    }
    public int attack() {
        // get a random number between the min and max strength and return it to the caller.
        Random rand = new Random();
        int attackStrength = rand.nextInt(minAttackStrength, maxAttackStrength);
        return attackStrength;

        // Shorter return new Random().nextInt(minAttackStrength, maxAttackStrength);
    }
    public void recordDamage(int amountToSubtract) {
        currentHitPoints = currentHitPoints - amountToSubtract; // Keeping track of damage player takes from bears
    }
    public boolean heal() {
        if (numOfHeals > 0);
        currentHitPoints = totalHitPoints; // heal to full health. You can also randomize your healing or have it heal 25% etc.
        numOfHeals - -; // subtract number of heals -1.

        return true;
    }

    return false;
}

public void move(String direction) {
// proper values are north, east, south, west
    if (direction.equalsIgnoreCase("North")) {
        if (labyrinthLoc)[0] ==0 {
            labyrinthLoc[0] = 2;
        } else{
            labyrinthLoc[0] = labyrinthLoc[0] - 1;
        }

    } else if (direction.equalsIgnoreCase("South")) {
        if (labyrinthLoc)[0] ==2 {
            labyrinthLoc[0] = 0;
        } else{
            labyrinthLoc[0] = labyrinthLoc[0] + 1;
        }
    else if (direction.equalsIgnoreCase("East")) {
            if (labyrinthLoc)[1] ==2 {
                labyrinthLoc[1] = 0;
            } else{
                labyrinthLoc[1] = labyrinthLoc[1] + 1;
            }

    else if (direction.equalsIgnoreCase("West")) {
                if (labyrinthLoc)[1] ==0 {
                    labyrinthLoc[1] = 2;
                } else{
                    labyrinthLoc[1] = labyrinthLoc[1] - 1;
                }

                // row column, [0, 0] North is +1 to [1, 0]
}

}












