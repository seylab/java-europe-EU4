package day_38_inheritance_part2;

public class DogTest {
	public static void main(String[] args) {

		Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Silky");
		
		dog.eat();
		
		System.out.println(dog.getName());
	}
}
