package pet;

public class Master {
	public static void main(String[] args) {

		Dog myDog = new Dog();
		myDog.setName("旺财");
		myDog.setAge(5);
		myDog.setKind("金毛");
		String sound = myDog.bark();
		System.out.println(sound);
		String s = "骨头";
		myDog.eat(s);
		myDog.sleep();

		Cat myCat = new Cat();
		String sound1 = myCat.bark();
		System.out.println(sound1);
		
	   

		Master m = new Master();
		String userName = "张三";
		m.SayHello(userName);
		System.out.println(userName);
		String userName1 = m.SayHello(userName);
		System.out.println(userName1);
	}

	public String SayHello(String name) {
		name = "hello" + name;
		return name;
	}
}
