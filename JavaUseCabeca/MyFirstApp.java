public class MyFirstApp{
	public static void main(String[] args){
		int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.println("x 'is " +x);
		double d = Math.random();
		
		if  (x == 10){
			System.out.println("x must be 10");
		}else{
			System.out.println("x ins't be 10");
		}
		if ((x < 3 ) & (name.equals("Dirk"))){
			System.out.println("Gently");
		}
		System.out.println("this line runs no meter what");
			
		}
	}