package com.codedifferently.partB;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private Airport airport;
    private Scanner scanner; //allows us to use the scanner anywhere
    public Main (){
        this.airport = new Airport();
        scanner = new Scanner(System.in);
    }

    public void displayAllFlights(){
        ArrayList<Plane> planes = airport.getPlanes();
        for (int x = 0; x < planes.size(); x++ ){
            System.out.println(planes.get(x));
        }
    }
    public void selectedFlight(){
        System.out.println("Please enter your selected flight: ");
        Integer selected = scanner.nextInt();
        Plane plane = airport.getPlanes().get(selected);
        System.out.println("you selected: " + plane.toString());
    }
    public void run(){

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Welcome to Baron Airlines!:");
            System.out.println("1. Where are you traveling to?");
            System.out.println("2. Select a Departure Date - one way ticket only!");
            System.out.println("3. How many passengers");
            System.out.println("4. Find a flight");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllFlights();
                    break;
                case 2:
                    selectedFlight();
                    break;
                case 3:
                case 4:
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        scanner.close(); //always have to close the scanner
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
