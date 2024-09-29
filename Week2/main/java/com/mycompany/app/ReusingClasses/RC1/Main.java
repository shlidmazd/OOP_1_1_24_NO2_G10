package Week2.main.java.com.mycompany.app.ReusingClasses.RC1;

class FirstClass {
    private String message;

    public FirstClass() {
        this.message = "Hello from FirstClass!";
    }

    public String getMessage() {
        return message;
    }
}

// Second class
class SecondClass {
    private FirstClass firstClass;

    // Lazy initialization
    public FirstClass getFirstClass() {
        if (firstClass == null) {
            firstClass = new FirstClass(); // instantiate only when first accessed
        }
        return firstClass;
    }

    public void showMessage() {
        System.out.println(getFirstClass().getMessage());
    }
}

public class Main {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.showMessage();  // This will trigger the lazy initialization of FirstClass
    }
}
