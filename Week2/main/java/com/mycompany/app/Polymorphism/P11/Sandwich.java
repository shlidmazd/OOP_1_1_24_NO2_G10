package Week2.main.java.com.mycompany.app.Polymorphism.P11; 

class Meal { 
    Meal() { print("Meal()"); } 
} 

class Bread { 
    Bread() { print("Bread()"); } 
} 

class Cheese { 
    Cheese() { print("Cheese()"); } 
} 

class Lettuce { 
    Lettuce() { print("Lettuce()"); } 
}

// New Pickle class added
class Pickle {
    Pickle() { print("Pickle()"); }
}

class Lunch extends Meal { 
    Lunch() { print("Lunch()"); } 
} 

class PortableLunch extends Lunch { 
    PortableLunch() { print("PortableLunch()"); } 
} 

public class Sandwich extends PortableLunch { 
    private Bread b = new Bread(); 
    private Cheese c = new Cheese(); 
    private Lettuce l = new Lettuce(); 
    // Adding a Pickle object
    private Pickle p = new Pickle();
    
    public Sandwich() { 
        print("Sandwich()"); 
    } 
    
    public static void main(String[] args) { 
        new Sandwich(); 
    } 
}
