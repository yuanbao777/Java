/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Student Name: Yuan Guo
Student Number: 040914293
Course Section: 23F_CST8288_013
*/
package pkgUnitConverter;

/**
 * The UnitConverter class provides a flexible way to convert various units using different behaviors.
 * The class stores the current value to be converted and the active conversion behavior.
 *
 * @author yuan
 */


public class UnitConverter {
    
  private double value;
  private ConverterBehaviour aBehaviour;

 /**
     * Constructs a new UnitConverter object with the default FCconverter behavior for temperature conversion.
     */
  public UnitConverter(){
  this.aBehaviour = new FCconverter();
  }

/**
     * Gets the current value to be converted.
     * 
     * @return The current value to be converted.
     */  

  public double getValue(){
      return value;
  }

/**
     * Converts the current value using the active conversion behavior.
     * 
     * @param value The value to be converted.
     * @return The converted value.
     */
  public double convert(double value) {
        return this.aBehaviour.convert(value);
    }
          
/**
     * Changes the active conversion behavior to the specified behavior.
     * 
     * @param aBehaviour The new conversion behavior to be used.
     */
  public void changeBehaviourTo(ConverterBehaviour aBehaviour){
          this.aBehaviour = aBehaviour;
}

/**
     * Returns a string representation of the UnitConverter object.
     * 
     * @return A string containing the temperature value and the current conversion behavior type.
     */
  @Override
   public String toString(){
       StringBuilder builder = new StringBuilder();
       builder.append("[")
               .append("Temperature :")
               .append(String.format("%.2f", value))
               .append("Converter Behaviour Type:")
               .append(aBehaviour.aBehaviour())
               .append("]\n");
               return builder.toString();
               
       
   }
}

  