/**
 * 
 */
package mypatterns;

/**
 * @author 417765
 *
 */
public class Soy extends CandimentDecorator{
	
	Beverage beverage;
	
	public Soy (Beverage beverage){
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() +",Soy";
	}
	public double getCost(){
		return beverage.getCost() + 0.10;
	}
}
