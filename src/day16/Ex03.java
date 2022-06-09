package day16;

import java.util.ArrayList;

class A1{
	public void print() {
		System.out.println("A클래스");
	}
}
class B1 extends A1{
	public void print() {
		System.out.println("B클래스");
	}
	public void bbb() {
		
	}
}
class C1 extends A1{
	public void print() {
	System.out.println("C클래스");
	}
	public void add(int a) {
		System.out.println(a);
	}
}

public class Ex03 {

	public static void main(String[] args) {
//		A1 a;
//		B1 b;
//		C1 c;
//		a = new A1(); a.print();
//		b = new B1(); b.print();
//		c = new C1(); c.print();
		A1 a;
		a = new B1(); a.print();
		a = new C1(); a.print();
		
		B1 b = (B1)a;

		
		ArrayList arr = new ArrayList();
		Object i =b;
		arr.add(b);
		
		C1 cc = new C1();
		cc.add(1111);

	}

}
