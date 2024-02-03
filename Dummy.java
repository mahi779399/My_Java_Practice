import package01.*;
import package02.C;
import java.lang.Integer;

public class Dummy {
	public static void main(String[] args) {
		// System.out.println("haai Dummy");
		// A objA = new A();
		// A.aStatic();
		// B objB = new B();
		// objB.bInstance();
		// C objC = new C();
		// C objC1 = new C();
		// C.cStatic();
		// objC.cInstance();
		// System.out.println("haai Dummy");
		// Only for non - premitive data types not applicable for premitive data types
		String s = "mahi";
		Integer num = 10;
		// gives complete 'class + path' ex:class java.util.String;
		System.out.println(s.getClass());
		// gives complete path ex:java.util.String;
		System.out.println(s.getClass().getName());
		// gives only class name ex:String;
		System.out.println(s.getClass().getSimpleName());
		// Also applicable for user created object classes
		A objA = new A();
		C objC = new C();
		System.out.println(objA.getClass());
		System.out.println(objA.getClass().getName());
		System.out.println(objA.getClass().getSimpleName());
		System.out.println(objC.getClass());
		System.out.println(objC.getClass().getName());
		System.out.println(objC.getClass().getSimpleName());
		Dummy d = new Dummy();
		System.out.println(d.getClass());
		System.out.println(d.getClass().getName());
		System.out.println(d.getClass().getSimpleName());
		System.out.println(d.hashCode());
		if (objA instanceof A) {
			System.out.println("True: that object belongs to that class");
		} else {
			System.out.println("False: that object not belongs to that class");
		}
		System.out.println(objA instanceof A);
	}
}