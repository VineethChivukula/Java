class Student {
    // Class fields (attributes)
    String name;
    int age;
    
    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class BasicClassAndObjectDemo {
    public static void main(String[] args) {
        // Creating objects of the Student class
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Assigning values to the fields of objects
        student1.name = "Alice";
        student1.age = 20;
        
        student2.name = "Bob";
        student2.age = 22;
        
        // Calling the method to display student information
        System.out.println("Student 1:");
        student1.displayInfo();
        
        System.out.println("\nStudent 2:");
        student2.displayInfo();
    }
}
