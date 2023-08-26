// Normal interface with abstract methods
interface Vehicle {
    void start();

    void stop();

    void accelerate();
}

// Class implementing the Vehicle interface (Car)
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }
}

// Class implementing the Vehicle interface (Bicycle)
class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle started");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle pedaling faster");
    }
}

// Marker interface (no methods, used for identification)
interface Insurable {}

// Class implementing the Insurable interface
class InsurancePolicy implements Insurable {
    // Implementation of the Insurable interface (empty in this case)
}

public class InterfacesDemo {
    public static void main(String[] args) {
        // Using classes that implement the Vehicle interface
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.start();
        car.accelerate();
        car.stop();

        bicycle.start();
        bicycle.accelerate();
        bicycle.stop();

        // Using a class that implements the Insurable interface (marker interface)
        InsurancePolicy policy = new InsurancePolicy();

        // Checking if an object implements the Insurable interface
        if (policy instanceof Insurable) {
            System.out.println("This policy is insurable.");
        }
    }
}