public class FirstClass
{
    public static void main(String[] args)
    {
        // Day 1
        System.out.println("Hello, World!");
        System.out.println("Goodbye, World!\nwow");

        int numDogs; // intstantiation
        numDogs = 2; // initialization
        int numCats = 0;// intstantiation & initialization

        System.out.println("Dogs: " +numDogs +"\nCats: " +numCats);
        System.out.println("At first there were " +numCats +" cats");

        numCats += 1;
        numCats ++;

        System.out.println("Now there are " +numCats +" cats");

//        //Loops
//        int a = 0;
//        while (a<100){
//            System.out.print(a + " --> ");
//            if (a == 32){
//                System.out.println("It's 32");
//                //break; //Stops loop
//                continue; //cancels iteration and restarts/continues loop
//            }
//            a += 2;
//            System.out.println(a);
//
//        }

        for (int x = 1; x < 30; x *= 2){
            System.out.print(x + "\t");
            for (int i = 0; i < x; i++){
                System.out.print("*"); //i must stay in loop
            }
            System.out.println("");
            //break or continue can be used
        }
        System.out.println("\nDone");
        System.out.println("Checking the commit in Github");


    }
}
