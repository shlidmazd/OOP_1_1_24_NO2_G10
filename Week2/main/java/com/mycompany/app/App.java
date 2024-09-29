package Week2.main.java.com.mycompany.app;

public class App {
    public static void main(String[] args) {
        // Tạo một đối tượng Book và in thông tin của nó
        Book book = new Book("1984", "George Orwell");
        System.out.println(book);

        // Tạo một đối tượng Time, thêm phút và in thời gian
        Time time = new Time(5, 30);
        time.addMinutes(95); // Thêm 1 giờ và 35 phút
        System.out.println("Thời gian cập nhật: " + time);

        // Thực hiện ví dụ đệ quy (tính giai thừa)
        Recursion recursion = new Recursion();
        int fact = recursion.factorial(5);
        System.out.println("Giai thừa của 5: " + fact);

        // Tạo một NNCollection và thêm các đối tượng NameNumber
        NNCollection nnCollection = new NNCollection();
        nnCollection.add(new NameNumber("Alice", 12345));
        nnCollection.add(new NameNumber("Bob", 67890));
        nnCollection.printAll();
    }
}
