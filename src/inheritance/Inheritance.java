/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Abdalmohsen abughali
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         String manualGear="Manual";
         String outoGear="Manual";
        
         MountainBike mountainBike = new MountainBike(60.0,manualGear, 10);
       
         System.out.println("geer : "+ mountainBike.gear);
         System.out.println("Speed : "+ mountainBike.speed);
         System.out.println("seatHight :"+ mountainBike.seatHight);

         
         
        System.out.println(mountainBike.toString());
         
                
                  
        
        
    }
    
}
