class Main{

public static void main(String args[]){
	// primitive data type
	int a = 10;
	double b = 19.45;

	System.out.println("The value of a: "+a);
	System.out.println("The value of b: "+b);

	// wrapper class
	Integer x = a;
	Double y = b;

	// This automatic conversion to primitive data type to object is known as Autoboxing.
	if(x instanceof Integer){
	 System.out.println("x belongs to Integer class");
	 System.out.println("X.intValue() :"+x.intValue());
	}
	if(y instanceof Double){
	 System.out.println("y belongs to Double class");
	 System.out.println("y.doubleValue() : "+y.doubleValue());
	}

	// Converting object type to primitive data type
	int i = x;
	double j = y;

	// This process is called unboxing.
	
	System.out.println("i : "+i);
	System.out.println("j : "+j);
}

}