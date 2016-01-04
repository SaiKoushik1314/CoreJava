package MyDay;

public class FoodTest implements Vegetable,Meat {

	public static void main(String[] args) {

		 double quantity=4;
		 double unitcost=200;
		 double price=300;
		 FoodTest ft1 = new FoodTest();
		 System.out.println("cost of meat is:"+ft1.cost(price, quantity));
		 System.out.println("Cost of vegetable is:"+ft1.price(quantity, unitcost));
	}

	@Override
	public double price(double quantity, double unitcost) {
		// TODO Auto-generated method stub
		return quantity*unitcost;
	}

	@Override
	public double cost(double price, double quantity) {
		// TODO Auto-generated method stub
		return price*quantity;
	}

}
