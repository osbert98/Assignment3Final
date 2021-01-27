package Assignment1;

public class checkMoney {

	static void money(int money) {
	    if (money < 4500) {
	      throw new ArithmeticException("You cannot afford this package.");
	    }
	    else {
	      System.out.println("Package is ready for you!");
	    }
	  }

}
