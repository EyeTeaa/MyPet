public class Frog extends myPets
{
    //1 Instance Variables
    private boolean isPoisonous;
    //2 Constructors
    public Frog (boolean isPoisonous, boolean isFriendly, String foodType, double amtSleep, String name)
    {
        super (isFriendly, foodType, amtSleep, name);
        this.isPoisonous = isPoisonous;
    }
    //3 toString
    public String toString()
    {
        String output = super.toString() +
                "\nIs Poisonous: " + isPoisonous +
                "\nName: " + name +
                "\nFriendly: " + isFriendly +
                "\nHours of Sleep: " + amtSleep +
                "\nFood Type: " + foodType;
        return output;
    }

}
