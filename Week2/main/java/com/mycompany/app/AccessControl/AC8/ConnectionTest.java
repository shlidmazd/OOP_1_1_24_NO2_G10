package Week2.main.java.com.mycompany.app.AccessControl.AC8;

public class ConnectionTest {
    public static void main(String[] args) {
        // Yêu cầu các connection thông qua ConnectionManager
        for (int i = 0; i < 7; i++) {  // Thử lấy nhiều hơn số lượng connection có sẵn
            Connection conn = ConnectionManager.getConnection();
            if (conn != null) {
                conn.connect();
            }
        }
    }
}
