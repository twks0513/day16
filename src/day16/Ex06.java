package day16;

class A지상군{
	public void 지상군공격1() {}
	public void 지상군공격2() {}
	public void 지상군공격3() {System.out.println("지상군 공격");}
	public void 지상군공격4() {}
	public void 지상군공격5() {}
	
}
class B공군{
	public void attack() {
		System.out.println("공군 공격");
	}
}
public class Ex06 {

	public static void main(String[] args) {
		A지상군 a = new A지상군();
		B공군 b = new B공군();
		
		b.attack();
		

	}

}
