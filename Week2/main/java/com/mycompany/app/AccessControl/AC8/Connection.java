package Week2.main.java.com.mycompany.app.AccessControl.AC8;

public class Connection {
    // Constructor private để ngăn lập trình viên tạo đối tượng Connection
    private Connection() {
        System.out.println("Đã tạo Connection.");
    }

    // Phương thức tĩnh để tạo đối tượng Connection (chỉ dành cho ConnectionManager)
    static Connection create() {
        return new Connection();
    }

    // Phương thức để mô phỏng một số hành vi của connection
    public void connect() {
        System.out.println("Đã kết nối.");
    }
}
