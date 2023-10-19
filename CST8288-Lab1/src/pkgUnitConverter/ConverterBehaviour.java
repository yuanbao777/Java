/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/*
Student Name: Yuan Guo
Student Number: 040914293
Course Section: 23F_CST8288_013
*/
package pkgUnitConverter;

/**
 * The ConverterBehaviour interface defines the behavior required for conversion classes.
 * Classes implementing this interface should provide methods to convert a value and specify a conversion behavior.
 * @author yuan
 */

public interface ConverterBehaviour {
  
/**
     * Converts a value based on the specific behavior implemented by the class.
     * 
     * @param value The value to be converted.
     * @return The converted value.
     */
    double convert(double value);

/**
     * Specifies the conversion behavior implemented by the class.
     * This method should return a string describing the behavior.
     * 
     * @return A string describing the conversion behavior.
     */
    String aBehaviour();
}