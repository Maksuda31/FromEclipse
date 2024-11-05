
public class Main {

	public static void main(String[] args) {
		// object=an instance of a class that may contain attributes and methods
		// example= (phone, desk, computer, coffee cup)
		
		
		car MyCar= new car();
		MyCar.drive();
		MyCar.brake();
		
		System.out.println(MyCar.price);
		System.out.println(MyCar.model);
		System.out.println(MyCar.year);
		System.out.println(MyCar.make);
		System.out.println(MyCar.color);
		
		car car2= new car();
		System.out.println();
		System.out.println("That's my second car bro");
		car2.drive();
		car2.brake();
		
		System.out.println(car2.price);
		System.out.println(car2.model);
		System.out.println(car2.year);
		System.out.println(car2.make);
		System.out.println(car2.color);
		
		
	}

}
