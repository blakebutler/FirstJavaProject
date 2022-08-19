public class FirstClass
{
    public static void main(String[] args)
    {
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

        //Loops
        int a = 0;
        while (a<10){
            System.out.print(a + " --> ");
            a += 2;
            System.out.println(a);
        }


    }
}
