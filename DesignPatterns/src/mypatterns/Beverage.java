/**
 * 
 */
package mypatterns;

/**
 * @author 417765
 *
 */
public abstract class Beverage {
	
	String description = "unknow beverage name";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double getCost();

}


