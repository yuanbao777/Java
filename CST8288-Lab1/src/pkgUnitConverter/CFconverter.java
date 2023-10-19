// standard Algonquin header goes here.
/*
Student Name: Yuan Guo
Student Number: 040914293
Course Section: 23F_CST8288_013
*/
package pkgUnitConverter;
/**
 * This class provides a method to convert a given temperature in Celsius to its equivalent in Fahrenheit.
 * @author Yuan
 */
public class CFconverter implements ConverterBehaviour{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;

/**
     * Converts a temperature value from Celsius to Fahrenheit.
     * 
     * @param celsius The temperature value in Celsius to be converted.
     * @return The equivalent temperature in Fahrenheit.
     */
        @Override
	public double convert(double celsius) {
		return celsius*convFactor + convOrigin;
	}

/**
     * Specifies a behavior for the ConverterBehaviour interface.
     * This method returns a description of the conversion behavior.
     * 
     * @return A string describing the conversion behavior (CF to FC).
     */

        @Override
        public String aBehaviour(){
		return "CF to FC";
	}

}

