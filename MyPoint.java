/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc239.lab11a;

/**
 *
 * @author admin
 */
public class MyPoint {
    
    double x,y;
    
    double getX(){
        return x;
    };
    
    double getY() {
        return y;
    }
    
    MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    MyPoint(double xValue, double yValue){
        this.x = xValue;
        this.y = yValue;
    }
    
    double distance(double xValue, double yValue) {
        double xDiff = this.x - xValue;
        double yDiff = this.y - yValue;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    double distance(MyPoint otherPoint){
        double xDiff = this.x - otherPoint.x;
        double yDiff = this.y - otherPoint.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}


class NewPoint extends MyPoint{
    
    private static int numberOfObjects=0;
    
    
    
    NewPoint() {
        this.x = 0;
        this.y = 0;
        
        numberOfObjects +=1;
    }
    
    NewPoint(double xValue, double yValue) {
        this.x = xValue;
        this.y = yValue;
        
        numberOfObjects +=1;
    }
    
    static int getNumberOfObjects() {
        
        return numberOfObjects;
    }
}