import java.util.Random; /**
 * Write a description of class Bear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bear {
    private String name;
    private int currentHitPoints;
    private int minAttackStrength;
    private int maxAttackStrength;

    pulbic Bear(String name, int currentHitPoints, int minAttackStrength, int maxAttackStrengt};

    this.name = name;
    this.totalHitPoints = totalHitPoints;
    this.currentHitPoints = currentHitPoints;
    this.minAttackStrength = minAttackStrength;
    this.maxAttackStrength = maxAttackStrength;
    this.numofHeals = numofHeals;
    this.labyrinthLoc = labyrinthLoc;

}

public String getName() {
    return name;
}
public int getCurrentHitPoints() {
    return numofHeals;

}
public int attack() {
    Random rand = new Random();
    int attackStrength = rand.nextInt(minAttackStrength, maxAttackStrength);
    return attackStrength;
}
public void recordDamage(int amountToSubtract) {
    currentHitPoints = currentHitPoints - amountToSubtract;

}
