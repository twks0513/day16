package day16;

import java.util.ArrayList;

final class A{
	public void aaa() {
		System.out.println("AŬ����");
	}
}
class B extends ArrayList{
	A a = new A();
	public void bbb() {
		a.aaa();
		ArrayList arr;
		System.out.println("BŬ����");
	}
}

class AA{
	public void aa() {
		
	}
}
class BB extends AA{
	public void bb() {
		
	}
}

public class Ex02 {

	public static void main(String[] args) {
		BB bb = new BB();
		
		
		
		B b = new B();
		
		b.add("aaaa");
		System.out.println(b.get(0));

	}

}
