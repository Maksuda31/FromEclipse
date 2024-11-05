
public class demoConstructorMain {

	public static void main(String[] args) {
		// Constructor= special method that is called when an object is instantiated(created)

		
	Human human1= new Human("Maks", 35, 62);
	
	Human Ugly= new Human("Debi", 35, 62);
	
	//System.out.println(human1.age);
	
	System.out.println(Ugly.name);
	System.out.println(Ugly.age);
	System.out.println(Ugly.weight);
	
	human1.talkative();
	Ugly.Lazy();
	}

}
