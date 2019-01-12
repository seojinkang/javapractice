package window2;

public class MyRoom {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.leg = 4;
		dog.tail = true;
		
		dog.bark();
		dog.shake();
		
		System.out.println(dog.leg);
		System.out.println(dog.tail);
		
		System.out.println("------------------------");
		
		TV tv1 = new TV();
		tv1.shape = "네모";
		tv1.stand = true;
		
		tv1.turnon();
		tv1.change(100);
		
		TV tv2 = new TV();
		tv2.shape = "다이아몬드";
		tv2.stand = false;
		
		tv2.turnon();
		tv2.change(200);
		
//		System.out.println("--------");
//		System.out.println(tv1);
//		System.out.println(tv2);
				
	}

}
