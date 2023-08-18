package first;


import java.util.Scanner;

class Clerk {
    String name;
    int id;
    int age;
    double salary=2000;
    String designation="Clerk";

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter id: ");
        id = scanner.nextInt();
        
        System.out.print("Enter age: ");
        age = scanner.nextInt();
         
        
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class Developer extends Clerk {
    
    double salary=3000;
    String designation="Developer";



    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class Tester extends Clerk{
   
    double salary=4000;
    String designation="Tester";

    

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class Manager extends Clerk {
    
    double salary=5000;
    String designation="Manager";

   
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Clerk clerk = new Clerk();
        Developer developer = new Developer();
        Tester tester = new Tester();
        Manager manager = new Manager();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Clerk");
            System.out.println("2. Developer");
            System.out.println("3. Tester");
            System.out.println("4. Manager");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    clerk.inputDetails();
                    System.out.println("Details for Clerk:");
                    clerk.display();
                    break;
                case 2:
                    developer.inputDetails();
                    System.out.println("Details for Developer:");
                    developer.display();
                    break;
                case 3:
                    tester.inputDetails();
                    System.out.println("Details for Tester:");
                    tester.display();
                    break;
                case 4:
                    manager.inputDetails();
                    System.out.println("Details for Manager:");
                    manager.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close(); // Closing the scanner properly
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
    }
}
