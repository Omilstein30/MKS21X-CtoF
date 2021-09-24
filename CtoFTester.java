//The functions should have parameters of the double c for converting to fahrenheit, and it will return the double F, and vics versa fopr converting to Celcius 
//For the first function will return the double F for fahrenheit, and the second one will return the double C for celcius.
public class CtoFTester {

  public static double celsiusToFahrenheit(double c){
    double F = (9/5 * c) + 32;
    return(F);
  }
  public static double fahrenheitToCelcius(double f){
    double C = 5/9 * (f - 32);
    return(C);
  }
}
