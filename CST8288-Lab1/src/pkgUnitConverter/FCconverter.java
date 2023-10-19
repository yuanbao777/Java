// standard Algonquin header goes here.
/*
Student Name: Yuan Guo
Student Number: 040914293
Course Section: 23F_CST8288_013
*/
package pkgUnitConverter;
/**
 * This class provides a method to convert a given temperature in Fahrenheit to its equivalent in Celsius.
 * It also specifies a behavior for the ConverterBehaviour interface.
 * 
 * @author Yuan
 */
public class FCconverter implements ConverterBehaviour{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
     * Converts a temperature value from Fahrenheit to Celsius.
     * 
     * @param fahrenheit The temperature value in Fahrenheit to be converted.
     * @return The equivalent temperature in Celsius.
     */
        @Override
	public double convert(double fahrenheit) {
		return (fahrenheit - convOrigin)/convFactor;
	}

/**
     * Specifies a behavior for the ConverterBehaviour interface.
     * This method returns a description of the conversion behavior.
     * 
     * @return A string describing the conversion behavior (FC to CF).
     */
        @Override
        public String aBehaviour(){
		return "FC to CF";
}
}