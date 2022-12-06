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
        
        //Maryam
        Barista maryam = new Barista();
        maryam.name = "Maryam";
        maryam.coffee = 3;
        maryam.serveCoffee();
                               
        // Hannan
        SalesExecutive hannan = new SalesExecutive();
        hannan.name = "Hannan";
        hannan.medicine = 8;
        hannan.sellMedicine();
       
        // Dwithun
        Chef dwithun = new Chef();
        dwithun.name = "Dwithun";
        dwithun.Noodles = 68;
        dwithun.feedNoodles();



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


// Maryam 
class Barista{
    String name;
    int coffee;
    
    public void serveCoffee() {
        coffee++;
        System.out.println("Total coffee: "+coffee);
    }
}

// Hannan
class SalesExecutive{
    String name;
    int medicine;
    
    public void sellMedicine() {
        medicine++;
        System.out.println("Total medicine: "+medicine);
    }       
}

// Dwithun
class Chef{
    String name;
    int noodles;


    public void feedNoodles() {
        Noodles++;
        System.out.println("Total Noodles: "+noodles);
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
