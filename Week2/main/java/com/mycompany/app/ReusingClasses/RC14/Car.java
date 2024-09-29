package Week2.main.java.com.mycompany.app.ReusingClasses.RC14;

// Composition with public objects
class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
    
    // New service method
    public void service() {
        System.out.println("Engine is being serviced.");
    }
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}


public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door(); // 2-door

    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        
        // Call the new service method on the Engine instance
        car.engine.service();
    }
}
