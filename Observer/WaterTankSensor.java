/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Menjadi 'kontraktor' / observer yang mengawasi Observeable
public class WaterTankSensor implements IObserver {
    @Override
    public void update(double height) {
        System.out.println("Current Water Height : " + height + " Out of 100 Cm" );
    }
}

