/**
 * 
 */
package mypatterns;

/**
 * @author 417765
 *
 */
public class BeverageTest {
	
	public static void main(String args[]) {
		
		Beverage beverage1 = new HouseBlend();  // 1+ 
		beverage1 = new Mocha(beverage1); //+0.05
		beverage1 = new Mocha(beverage1); //+0.05
		beverage1 = new Soy(beverage1);//+0.10
		
		System.out.println(beverage1.getDescription() + ":" + beverage1.getCost()); // cost - 1.20
		
		Beverage beverage2 = new DarkRoast(); //2+
		beverage2 = new Mocha(beverage2); //0.05
		beverage2 = new Mocha(beverage2); //0.05
		beverage2 = new Soy(beverage2); //0.10
		
		System.out.println(beverage2.getDescription() + ":" + beverage2.getCost()); //cost - 2.20
		
	}

}
