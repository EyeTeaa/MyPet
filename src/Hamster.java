public class Hamster extends myPets
{
    //1 Instance Variables
    private boolean needToExercise; //Do i need to exercise it
    private boolean needsGrooming ; //long hair vs short hair

    //2 Constructor
    public  Hamster (boolean needToExercise, boolean needsGrooming, boolean isFriendly, String foodType, double amtSleep, String name)
    {
        super(isFriendly, foodType, amtSleep, name);
        this.needToExercise = needToExercise;
        this.needsGrooming = needsGrooming;

    }
    //3 toString

    public String toString()
    {
        String output = super.toString() +
                "\nNeeds to be exercised: " + needToExercise +
                "\nNeeds to be groomed: " + needsGrooming;
        return output;
    }

    //4 Getters

    public boolean getNeedsGrooming() {
        return needsGrooming;
    }
    public boolean getNeedsToExercise()
    {
        return needToExercise;
    }

    //5 Setters
    public void setNeedToExercise(boolean needToExercise)
    {
        this.needToExercise = needToExercise;
    }

    public void setNeedsGrooming(boolean needsGrooming) {
        this.needsGrooming = needsGrooming;
    }
}
