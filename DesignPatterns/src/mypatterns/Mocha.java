package mypatterns;

public class Mocha extends CandimentDecorator{
	
	Beverage beverage;
	
	public Mocha (Beverage beverage ){
		this.beverage = beverage;
	}
	
	public String getDescription (){
		return beverage.getDescription() + ",Mocha";
	}
	
	public double getCost (){
		return beverage.getCost() + 0.05;
	}

}
