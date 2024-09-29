package Week2.main.java.com.mycompany.app.AccessControl.AC9.access.local;

public class Foreign {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        // Attempt to access the protected field of MyClass
        System.out.println(myClass.message);
    }
}
