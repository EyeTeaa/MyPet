public class AllMyPets
{
    public static void main (String[] args)
    {
        myPets testPet =  new myPets(false, "Food" , 2, "Test Pet");
        System.out.println(testPet.toString());

        System.out.println();

        Frog shrimp = new Frog(false, true, "worms,", 6, "Shrimp");
        System.out.println(shrimp.toString());

        System.out.println();

        Hamster jgerome = new Hamster(false, true, true, "rats", .5, "Jgerome");
        System.out.println(jgerome.toString());
    }
}
