


class User {
	
	protected String name;
	protected String email;
	
	User(String name){
		this.name = name;
	}
	
	void sayHi(){
		System.out.println("Hi! I'm " + this.name);
	}
}

class SuperUser extends User{
	SuperUser(String name) {
		super(name);
	}
	
	//メソッドのオーバーライド
	void sayHi(){
		System.out.println("HIIIIII! I'm " +this.name);
	}
}



public class HelloWorld {
	
	public static void main(String[] args) {
		
		int sales[] = {150,200,140,400};
		
		
		
		for(int i =0; i < sales.length ; i++){
			System.out.println(sales[i]);	
		}
		
		Junyafn("shijuhbo");
		Junyafn();
		
		User tom = new User("tomson");
		SuperUser bob = new SuperUser("bob mimimi");
		tom.sayHi();
		bob.sayHi();
		
		
		
		System.out.println("\n\n");
		
		String s = new String("abcdefg");
		
		System.out.println (s.length() + "\n" + s.substring(2,5));
		
		
		double n = 6.65543;
		
		System.out.println( Math.ceil(n) );
		System.out.println( Math.floor(n) );
		System.out.println( Math.round(n) );
		
		System.out.println( Math.random() );
		System.out.println( Math.PI );
		
	}
	public static void Junyafn(String name){
		System.out.println("Hi! I'm " + name);
	}
	public static void Junyafn(){
		System.out.println("Hi! I'm nobody!");
		System.out.println("\n");
	}
}
