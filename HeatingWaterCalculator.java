// Kenneth Smith
//2.2
//6-6-2024
//This program is intented to calculate the energy required to heat water from an initial temperature to a final temperature.

import java.util.Scanner;

public class HeatingWaterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            //Prompt user for water amount in kilograms
            System.out.print("Enter water amount in kilograms: ");
            double waterMass = scanner.nextDouble();

            //Prompt user for intial water temperture in Celsius
            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemperature = scanner.nextDouble();

            //Prompt user for final water temperture in Celsius
            System.out.print("Enter final water temperature in Celsius: ");
            double finalTemperature = scanner.nextDouble();

            //Calculate the energy required to heat water
            double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

            //Display the result
            System.out.println("The enegy required to heat the water is " + energy + " Joules ");  
            
            scanner.close();

            
    }
}
