package functional_interface_n_lambda_expression_16th_nov;

/**
 * 
 * @author Hariom Yadav - Nov 16, 2019
 *
 */

@FunctionalInterface//1. adda annotation , 2. add one method
interface FunInterface{
	void method();
}

@FunctionalInterface//1. adda annotation , 2. add one method
interface FunInterface2{
	void method(int i);
}


@FunctionalInterface//1. adda annotation , 2. add one method
interface FunInterface3{
	void method(int i);
}


public class FunctionalInterface_n_Lambda_exp {
	public static void main(String[] args) {
		FunInterface obj = () -> System.out.println("hi");//3.
		obj.method();
		
		FunInterface2 obj2 = (x) -> System.out.println("hi..."+x);//3.
		obj2.method(2);//0th step take value from argument -> send to (x) then (x) send to body present after "->" line
		
		FunInterface3 obj3 = (x) -> {
			//method body
			System.out.println("obj3 : "+x);//3.
			System.out.println("hello "+x+2);
		};
		obj3.method(2);//0th step take value from argument -> send to (x) then (x) send to body present after "->" line
		
		
		
		
	}
}
