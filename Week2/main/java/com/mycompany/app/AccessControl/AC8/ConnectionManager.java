package Week2.main.java.com.mycompany.app.AccessControl.AC8;

public class ConnectionManager {
    private static final int MAX_CONNECTIONS = 5;  // Số lượng connection tối đa
    private static Connection[] connections = new Connection[MAX_CONNECTIONS];  // Mảng chứa connection
    private static int currentIndex = 0;  // Chỉ số theo dõi các connection có sẵn

    // Phương thức tĩnh để lấy đối tượng connection
    public static Connection getConnection() {
        if (currentIndex < MAX_CONNECTIONS) {
            if (connections[currentIndex] == null) {
                connections[currentIndex] = Connection.create();  // Tạo connection mới
            }
            return connections[currentIndex++];  // Trả về connection và tăng chỉ số
        } else {
            System.out.println("Không có kết nối nào có sẵn.");
            return null;  // Không còn connection nào có sẵn
        }
    }
}
