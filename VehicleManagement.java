import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; 

public class VehicleManagement {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        Scanner key = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Display a list of vehicle details");
            System.out.println("3. Delete a vehicle");
            System.out.println("4. Sort vehicle list by age");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = key.nextInt();
            key.nextLine(); 

            switch (choice) {
                case 1:
                    // add vehicle here
                   System.out.print("Enter registration number: ");
                   String regNo = key.nextLine();
                   System.out.print("Enter make: ");
                   String make = key.nextLine();
                   System.out.print("Enter year of manufacture: ");
                   int yearOfManufacture = key.nextInt();
                   System.out.print("Enter value: ");
                   double value = key.nextDouble();

                   Vehicle vehicle = new Vehicle(regNo, make, yearOfManufacture, value);
                   vehicleList.add(vehicle);
                   System.out.println("Vehicle added successfully!");
                    break;
                
                case 2:
                    // display vehicle list here
                  System.out.println("List of vehicle details:");
                     for (Vehicle Vehicle : vehicleList) {
                      System.out.println(Vehicle);
            }
        
    
                    break;
                case 3:
                    // delete vehicle
                       System.out.print("Enter the index of the vehicle to delete: ");
                       int index = key.nextInt();
                       key.nextLine(); // Consume newline character
                         
                          if (index >= -1 && index < vehicleList.size()) {
                       vehicleList.remove(index);
                       System.out.println("Vehicle deleted successfully!");
                      } 
                         else {
                          System.out.println("Invalid index.");
            }
        
    
                    break;
              
            case 4:
               
                // sort vehicle list by age
               while(true) {
                  System.out.println("\n\nSort Menu:");
                  System.out.println("1. Sort by age (ascending)");
                  System.out.println("2. Sort by age (descending)");
                  System.out.println("3. Back to main menu");
                  System.out.print("Enter your choice: ");
                  int sort = key.nextInt();
                  if(sort == 1){
                     System.out.println("List of vehicle details sorted by age (ascending):");
                     Collections.sort(vehicleList, Comparator.comparingInt(Vehicle::getYearOfManufacture));
                     for(int i = 0; i < vehicleList.size(); i++){
                        System.out.println(vehicleList.get(i));
                     }
                  }
                  else if(sort == 2){
                     System.out.println("List of vehicle details sorted by age (descending):"); 
                    Collections.sort(vehicleList, Comparator.comparingInt(Vehicle::getYearOfManufacture).reversed());
                     for(int i = 0; i < vehicleList.size(); i++){
                        System.out.println(vehicleList.get(i));
                     }
                     }
                     else if(sort == 3){
                     System.out.println("Returning to main menu...\n\n");
                    break;
                    }
                    }
                    break;         
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        key.close();
    }

}   