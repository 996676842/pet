package pet;

public class Master {
	public static void main(String[] args) {

		Dog myDog = new Dog();
		myDog.setName("����");
		myDog.setAge(5);
		myDog.setKind("��ë");
		String sound = myDog.bark();
		System.out.println(sound);
		String s = "��ͷ";
		myDog.eat(s);
		myDog.sleep();

		Cat myCat = new Cat();
		String sound1 = myCat.bark();
		System.out.println(sound1);
		
	   

		Master m = new Master();
		String userName = "����";
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
