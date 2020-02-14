package feb_14th;
/**
 * 
 * @author Hariom Yadav | 14-Feb-2020
 *
 */
class MutableClass {//normal class
	String s;

	public MutableClass(String s) {
		this.s = s;
	}
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}

final class ImmutableClass {//final class + no setter
	String s;
	
	public ImmutableClass(String s) {
		this.s = s;
	}
	public String getS() {
		return s;
	}
	
}
public class Mutable_Immutable {
	public static void main(String[] args) {
		MutableClass obj = new MutableClass("muttable");
		System.out.println(obj.getS());
		obj.setS("muttable def");
		System.out.println(obj.getS());
		
		ImmutableClass obj2 = new ImmutableClass("immutable");
		System.out.println(obj2.getS());
		//we cant update immutable since no setter
		
	}
}
/**
 
muttable
muttable def
immutable
 */
