/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3pbo;

/**
 *
 * @author ASUS
 */
public class Truck {
    //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    //the Truck class has one constructor
    public Truck (int startCandence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCandence;
        speed = startSpeed;
    }
    // the truck class has foour method
    public void setCadence (int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void speedUp(int increment){
        speed = increment;
        
    }
}
