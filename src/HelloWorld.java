public class HelloWorld {

	public static void main(String[] args) {
		 // Prints "Hello, World" to the terminal window.
		 //
		 if (args.length !=1 ) {
			 System.out.println("usage $0 num");
		 } else {
			System.out.println("Hello, World: "+args[1]);
		 }
	}

}
