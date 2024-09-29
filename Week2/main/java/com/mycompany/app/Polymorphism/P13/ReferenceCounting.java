package Week2.main.java.com.mycompany.app.Polymorphism.P13;

//: polymorphism/ReferenceCounting.java
// Cleaning up shared member objects.
import static Week2.main.java.com.mycompany.app.Polymorphism.P13.ReferenceCounting.Print.*;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    
    public Shared() {
        print("Creating " + this);
    }
    
    public void addRef() { 
        refcount++; 
    }
    
    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }
    
    public String toString() { 
        return "Shared " + id; 
    }
    
    @Override
    protected void finalize() throws Throwable {
        // Verify that the object is being finalized (garbage collected)
        if (refcount > 0) {
            print("Error: Shared object " + id + " is being finalized with non-zero refcount.");
        } else {
            print("Finalizing " + this);
        }
        super.finalize();
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    
    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    
    protected void dispose() {
        print("Disposing " + this);
        shared.dispose();
    }
    
    public String toString() {
        return "Composing " + id;
    }
    
    @Override
    protected void finalize() throws Throwable {
        print("Finalizing " + this);
        super.finalize();
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };

        for (Composing c : composing) {
            c.dispose();
        }
        
        // Request garbage collection (not guaranteed to run immediately)
        System.gc();
    }
}
