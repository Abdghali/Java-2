/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author  Abdalmohsen abughali
 */
///


/// the MountainBike is an subcalss of Bicycle class
// الدراجة الجبلية 
public class MountainBike extends Bicycle{
    
   int seatHight ; // hight of Mountain Bike

   // constructor
    public MountainBike(double speed, String gear , int _seatHight ) {
        super(speed, gear); // refer to Bicycle class so you can Inherit all  attributes  of Bicycle class.  
        this.seatHight = _seatHight;
    }

    
    // for print all information of MountainBike
    @Override
    public String toString() {
        return "MountainBike{" + "seatHight : " + seatHight + " , speed : "+speed+", gear : "+ gear+ '}';
    }
   
   
   
}
