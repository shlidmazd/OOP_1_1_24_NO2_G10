package Week2.main.java.com.mycompany.app.AccessControl.AC5;

public class AccessLevels {
    // Các trường với các mức truy cập khác nhau
    public int publicField = 1;
    private int privateField = 2;
    protected int protectedField = 3;
    int packageField = 4;  // Truy cập gói (mặc định)

    // Các phương thức với các mức truy cập khác nhau
    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void packageMethod() {
        System.out.println("Package-access method");
    }
}
