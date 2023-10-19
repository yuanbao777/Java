/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 * This class provides a method to convert a given distance in miles to its equivalent in kilometers.
 * It also specifies a behavior for the ConverterBehaviour interface.
 * @author yuan
 */
public class MIconventer implements ConverterBehaviour{
     private final double convFactor = 1.60934; //1 Mile = 1.60934 Kilometers
    
    /**
     * Converts the given distance value from miles to kilometres.
     *
     * @param miles the distance value in miles to be converted.
     * @return equivalent distance in kilometres.
     */
    @Override
    
    public double convert(double miles) {
        return miles * convFactor;
    }
    
    /**
     * Specifies a behavior for the ConverterBehaviour interface.
     * This method returns a description of the conversion behavior.
     * 
     * @return A string describing the conversion behavior (MI to KM).
     */
    @Override
    public String aBehaviour(){
        return "MI to KM";
    }
}
