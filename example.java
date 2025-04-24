class example{

	public static void main(String[] args){

		System.out.println("Hello World!");
		System.out.println("Hello World2!");
	}

}

interface Animal{
	public void move();
}

class Dog implements Animal{
	public void move(){
		System.out.println("Dog is moving");
	}
}

class Cat implements Animal{
	public void move(){
		System.out.println("Cat is moving");
	}
}