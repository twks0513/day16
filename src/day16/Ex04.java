package day16;

class Parents{
	public void familyName() {
		System.out.println("��");
	}
	public void Name() {
		familyName();
		System.out.println("����");
	}
}

class Daughter extends Parents{
	public void Name() {
		familyName();
		System.out.println("����");
	}
}

class Son extends Parents{
	public void Name() {
		familyName();
		System.out.println("�Ɽ");
		
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Parents p = new Parents(); p.Name();
		p = new Daughter(); p.Name();
		p = new Son(); p.Name();
		

	}

}
