class Main{

public static void main(String args[]){
	int a = 10;
	double b = 19.45;

	System.out.println("The value of a: "+a);
	System.out.println("The value of b: "+b);

	Integer x = a;
	Double y = b;

	if(x instanceof Integer){
	 System.out.println("x belongs to Integer class");
	 System.out.println("X.intValue() :"+x.intValue());
	}
	if(y instanceof Double){
	 System.out.println("y belongs to Double class");
	 System.out.println("y.doubleValue() : "+y.doubleValue());
	}
    }

}