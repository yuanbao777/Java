/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;

/**
 * This class provides a method to convert a given distance in kilometers to its equivalent in miles.
 * It also specifies a behavior for the ConverterBehaviour interface.
 * @author yuan
 */
public class KLconverter implements ConverterBehaviour{
    private final double convFactor = 0.621371;
    /**
     * Converts the given distance value from kilometres to miles.
     *
     * @param kilometres the distance value in kilometres to be converted.
     * @return equivalent distance in miles.
     */
    @Override
    public double convert(double kilometres) {
        return kilometres * convFactor;
    }
    
   /**
     * Specifies a behavior for the ConverterBehaviour interface.
     * This method returns a description of the conversion behavior.
     * 
     * @return A string describing the conversion behavior (KM to MI).
     */
    @Override
    public String aBehaviour(){
        return "KM to MI";
    }
}

