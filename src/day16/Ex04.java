package day16;

class Parents{
	public void familyName() {
		System.out.println("이");
	}
	public void Name() {
		familyName();
		System.out.println("순신");
	}
}

class Daughter extends Parents{
	public void Name() {
		familyName();
		System.out.println("국주");
	}
}

class Son extends Parents{
	public void Name() {
		familyName();
		System.out.println("기광");
		
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Parents p = new Parents(); p.Name();
		p = new Daughter(); p.Name();
		p = new Son(); p.Name();
		

	}

}
