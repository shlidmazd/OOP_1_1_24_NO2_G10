package Week2.main.java.com.mycompany.app.AccessControl.AC6;

class FirstClass {
    // Thành viên dữ liệu protected
    protected int protectedData = 10;
}

class SecondClass {
    // Phương thức để thao tác với dữ liệu protected của FirstClass
    public void modifyProtectedData(FirstClass first) {
        System.out.println("Dữ liệu protected ban đầu: " + first.protectedData);
        first.protectedData += 5;  // Thay đổi dữ liệu protected
        System.out.println("Dữ liệu protected sau khi thay đổi: " + first.protectedData);
    }
}

public class ProtectedDataExample {
    public static void main(String[] args) {
        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();
        
        // Thao tác với dữ liệu protected
        second.modifyProtectedData(first);
    }
}
