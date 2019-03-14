package ua.voytovych.syntax.package01;

public class Start {

	public static void main(String[] args) {
		int i = 4;
				
		System.out.println(i++); //postfix increment
		System.out.println(i);
		System.out.println(++i); //prefix increment
		System.out.println(i);
		System.out.println("");
		
		System.out.println(i--); //postfix decrement
		System.out.println(i);
		System.out.println(--i); //prefix decrement
		System.out.println(i);
		
		i*=5; //short notation
		//i+=5;
		//i-=5;
		System.out.println(i);
		System.out.println("");

	}

}
