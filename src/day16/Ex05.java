package day16;
class Ex05Class implements Test{

	@Override
	public void test() {
		
		System.out.println("test");
	}
}
public class Ex05{
	public static void main(String[] args) {
		Ex05Class e =new Ex05Class();
		e.test();
	}
	
}
