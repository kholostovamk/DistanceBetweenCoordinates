/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package csc239.lab11a;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Lab11a {

    public static void main(String[] args) {
        
        String[] p1Arr, p2Arr;
        Scanner console = new Scanner(System.in);
        boolean isRunning= true;
        
        while (isRunning ){
        
        //input first point coordinates
        System.out.println("Enter x and y coordinates for p1 (or q to exit): ");
        
        String p1Coordinates = console.nextLine();
        String p1CoordTrimmed = p1Coordinates.trim(); // in case of space after last coordinate
        p1Arr = p1CoordTrimmed.split(" ", 2);
        
         //check fo q to exit
        
        if (p1Arr[0].equals("q") /* || p2Coordinates.equals("q")*/) {
            isRunning = false;
            System.out.println("Exiting the program...");
            break;
        }
        
        double firstX = Integer.parseInt(p1Arr[0]);
        double firstY = Integer.parseInt(p1Arr[1]);
        
        //creating 1st object
        NewPoint firstPoint = new NewPoint(firstX,firstY);
        
        //input second point coordinates
        System.out.println("Enter x and y coordinates for p2 (or q to exit): ");
        
        String p2Coordinates = console.nextLine();
        String p2CoordTrimmed = p2Coordinates.trim();
        p2Arr = p2CoordTrimmed.split(" ", 2);
        double secondX = Integer.parseInt(p2Arr[0]);
        double secondY = Integer.parseInt(p2Arr[1]);
        
        //creating2nd object
        NewPoint secondPoint = new NewPoint(secondX, secondY);
        
        //Displaying the distance 
        System.out.printf("p1=( %.5f, %.5f), p2=( %.5f, %.5f), numberOfObjects=%d\n", firstX,firstY,secondX,secondY, NewPoint.getNumberOfObjects());
        System.out.printf("Distance (object to object) = %.5f\n", firstPoint.distance( secondPoint));
        System.out.printf("Distance (object to X,Y coordinates) = %.5f\n",firstPoint.distance(secondX, secondY));
        }
    
    }
}
