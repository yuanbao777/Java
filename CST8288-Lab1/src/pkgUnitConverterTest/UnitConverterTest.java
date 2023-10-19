//standard Algonquin header here
/*
Student Name: Yuan Guo
Student Number: 040914293
Course Section: 23F_CST8288_013
*/
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 * The UnitConverterTest class is a test class for the UnitConverter class and various conversion behaviors.
 * 
 * It provides sample code for converting between Fahrenheit and Celsius temperatures, kilometers and miles, and miles and kilometers.
 * 
 * @author Yuan
 */
public class UnitConverterTest {

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
		UnitConverter unitConverter = new UnitConverter();
		System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, unitConverter.convert(70.0));
		
		unitConverter.changeBehaviourTo(new CFconverter());
		System.out.printf("%5.2f in Celsius is %5.2f Fahrenheit\n", 20.0, unitConverter.convert(20.0));
		unitConverter.changeBehaviourTo(new KLconverter());
                System.out.printf("%5.2f in Kilometers is %5.2f Miles\n", 10.0, unitConverter.convert(10.0));

                unitConverter.changeBehaviourTo(new MIconventer());
                System.out.printf("%5.2f in Miles is %5.2f Kilometers\n", 10.0, unitConverter.convert(10.0));
	}

}
