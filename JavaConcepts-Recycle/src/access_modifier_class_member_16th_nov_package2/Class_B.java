package access_modifier_class_member_16th_nov_package2;

import access_modifier_class_member_16th_nov_package1.Class_A;//not visible - coz default only visible inside package

public class Class_B {
	public static void main(String[] args) {
		Class_A obj = new Class_A();
		
		obj.i = 9;
		//Problem : not visible - coz class memeber is default
		//Solution : make class member as public 
		obj.j =10;//public class member - so visible outside package 
		
	}
}
