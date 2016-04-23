package pet;

public class Pet {
	private String name;
	private String kind;
	private int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>20||age<0) {
			System.out.println("wrong");
		}
		else
		this.age = age;
	}


	
	
	public String bark() {
		return "ÍôÍô";
	}

	public void eat(String food) {
		System.out.println(name + "³Ô" + food);
	}

	public void sleep() {
		System.out.println(name + "ÔÚË¯¾õ£¡");
	}

}
