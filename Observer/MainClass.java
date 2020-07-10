/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MainClass {
    public static void main(String[] args) {
        IObserver watertankSensor = new WaterTankSensor();

        Electronics electronics = new Electronics();
        electronics.addObserver(watertankSensor);

        // A change in any values in subject leads to observer triggering updateValue method
        // and printing updated values.
        electronics.setHeight(53.5);
    }
}

