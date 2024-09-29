package Week2.main.java.com.mycompany.app.AccessControl.AC5;

public class AccessTest {
    public static void main(String[] args) {
        AccessLevels access = new AccessLevels();

        // Truy cập trường và phương thức public
        System.out.println("Public field: " + access.publicField);  // Được
        access.publicMethod();  // Được

        // Truy cập trường và phương thức private
        // System.out.println("Private field: " + access.privateField);  // Lỗi: privateField có truy cập private
        // access.privateMethod();  // Lỗi: privateMethod có truy cập private

        // Truy cập trường và phương thức protected
        System.out.println("Protected field: " + access.protectedField);  // Được vì trong cùng gói
        access.protectedMethod();  // Được vì trong cùng gói

        // Truy cập trường và phương thức truy cập gói (mặc định)
        System.out.println("Package-access field: " + access.packageField);  // Được
        access.packageMethod();  // Được
    }
}
