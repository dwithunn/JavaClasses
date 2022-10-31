public class Professions{
    public static void main(String[] args) {

        //Example
        Cobbler example = new Cobbler();        // Creating an object of the class 'Cobbler'
        example.name = "Example";               // Setting the value of attribute 'name' to "Example"
        example.shoes = 36;                     // Setting the value of attribute 'boots' to 36
        example.makeShoe();                     // Calling the makeShoe() method

        // Tarctic
        Baker tarctic = new Baker();
        tarctic.name = "Tarctic";
        tarctic.cookies = 5;
        tarctic.bakeCookie();




        // ✨Create object, set values and call method above this line✨
    }
}



// Example
class Cobbler{                                      // Creating a class 'Cobbler'
    String name;                                    // Creating an attribute 'name'
    int shoes;                                      // Creating an attribute 'boots'

    public void makeShoe() {                        // Creating a method 'makeShoe()'. 
                                                    // When this method is called, the lines below will be executed:
        shoes++;                                    // Increase the value of boots by 1
        System.out.println("Total shoes: "+shoes);  // Print the total number of boots
    }
}


// Tarctic
class Baker{
    String name;
    int cookies;

    public void bakeCookie() {
        cookies++;
        System.out.println("Total cookies: "+cookies);
    }
}




// ✨Type your class above this line✨
 




/* Other examples you can use: 

- Painter (paintings, paint())
- Builder (buildings, build())
- Florist (flowers, growFlower())
- Developer (apps, createApp())
- BusinessMan (products, sellProduct())
- Soldier (kills, kill())
- Teacher (chapters, teachChapter())

*/