# JavaClasses
A project for members to understand the concept of Java classes and implement it

## Adding your code block:
- Open [Professions.java](https://github.com/Github-Amity/JavaClasses/blob/main/Professions.java) file and click on edit
  
**Creating a code block for your class:**
- Add your code block above the indicated line (// ✨Type your class above this line✨).  
- Create a comment with your name (for example - Example)  
``// Example ``  
- Create a class name of your choice based on any profession. If you're not sure what to choose, use any of the examples given at the bottom of the file. (example - Cobbler)  
``class Cobbler{``  
- Create an attribute 'name' of type String  
``String name;``  
- Create another attribute of type int based on the profession you chose (for example - shoes for class Cobbler)  
``int shoes;``
- Create a method based on the profession you chose (for example - makeShoe() for class Cobbler)  
``public void makeShoe() {``
- Inside the method, add a line of code to increase the value of the chosen attribute (for example - shoes)  
``shoes++;``
- Print the value of the chosen attribute (for example - shoes)  
``System.out.println("Total shoes: "+shoes);``
- Close the remaining curly brackets  
  
**The final code block should look similar to this:**
```
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
```

**Creating a code block for your object:**
- Add your code block above the indicated line (// ✨Create object, set values and call method above this line✨). 
- Create a comment with your name (for example - Example)  
``// Example `` 
- Create an object of the class YOU created above (not the one given in the example below), following what you learned in the [JavaObjects](https://github.com/Github-Amity/JavaObjects) project. Use your username instead of 'example' and set the value of the attribute of your chosen profession to any number you like (in this example, the value of 'boots' is set to 36, but for your attribute, set it to any number you wish). Then call the method you created for your class (in this example, the method is makeShoe() ).
  
**The final code block should look similar to this:**
```
        // Example
        Cobbler example = new Cobbler();        // Creating an object of the class 'Cobbler'
        example.name = "Example";               // Setting the value of attribute 'name' to "Example"
        example.shoes = 36;                     // Setting the value of attribute 'boots' to 36
        example.makeShoe();                     // Calling the makeShoe() method
```
- Once you're done, scroll down to propose changes section, and add the message:  
'Add ``Cobbler`` class and ``Example`` object'  
where 'Cobbler' is your chosen profession and 'Example' is your username. Skip the description area and click on ``Propose changes``
- Once done, click on the green ``Create Pull Request`` button
- Confirm that your changes are correct, and click on ``Create Pull Request`` again
- You have successfully created a class, its attributes and a method. You also created an object of your class, initialized its attributes, called a method and submitted a pull request!

## How it works:
```
class Cobbler{                                      // Creating a class 'Cobbler'
    String name;                                    // Creating an attribute 'name'
    int shoes;                                      // Creating an attribute 'boots'

    public void makeShoe() {                        // Creating a method 'makeShoe()'. 
                                                    // When this method is called, the lines below will be executed:
        shoes++;                                    // Increase the value of boots by 1
        System.out.println("Total shoes: "+shoes);  // Print the total number of boots
    }
}
```
The ``class Cobbler`` line at the top of your class code block creates a class called Cobbler (you may have used a different profession from the one mentioned here). The lines below create two attributes (name, shoes) and one method (makeShoe()). This class resembles a profession of its own, has its own attributes and its own methods.  
After that, you created an object of this class, set values for the attributes and called the method you created.  
```
        Cobbler ravi = new Cobbler();        // Creating an object of the class 'Cobbler'
        ravi.name = "Ravi";               // Setting the value of attribute 'name' to "Ravi"
        ravi.shoes = 36;                     // Setting the value of attribute 'boots' to 36
        ravi.makeShoe();                     // Calling the makeShoe() method
```
Remember that a class is like a common noun (a cobbler), and an object is a specific instance of the common noun, that is, a proper noun (a cobbler named Ravi). So when you create a class, you are simple creating a class for a profession. It is not specific to anyone. But when you create its object, and set the value of its name attribute to your username, then you are creating an object specific to yourself. 

*If you need more help understanding these concepts, I'd recommend the following video:*  
https://www.youtube.com/watch?v=Mm06BuD3PlY
