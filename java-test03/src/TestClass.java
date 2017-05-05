

class Robot{
	void hello(){
		System.out.println("こんにちは");		
	}
	
	void bye(){
		System.out.println("さようなら");
	}
}













public class TestClass {

	public static void main(String[] args) {
		
		
		String li = "にこにこ";
		
		System.out.println("こんにちは" + li);
		
		System.out.println("A\n\n");
		
		
		
		Robot mini = new Robot() ;
		
		
		mini.hello();
		mini.bye();
		
		
		long sum = 0L;
		for(long i = 0L ; i < 100 ; i++ ){
			sum += i ;
		}
		System.out.println("合計は"+ sum +"です");
		
		int result[] = {34,45,86,92,55,69};
		for(int i = 0 ; i < result.length ; i++ ){
			System.out.println(result[i]);
		}
		
		
		
		
		 
	}

}