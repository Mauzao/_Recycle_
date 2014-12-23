Public class Loopy {
	public static void main(String [] args){
		int x = 1;
		System.out.println("Antes do Loop");
		while(x < 4){
			System.out.println("No Loop");
			System.out.println("O valor de X ´p" +x);
			x = x - 1;
		}
		System.out.println("Esse é o fim do Loop"); 
	}
	
}