public class AllMyPets
{
    public static void main (String[] args)
    {
        myPets testPet =  new myPets(false, "Food" , 2, "Test Pet");
        System.out.println(testPet.toString());

        Frog shrimp = new Frog(false, true, "worms,", 6, "Shrimp");
        System.out.println(shrimp.toString());
    }
}
