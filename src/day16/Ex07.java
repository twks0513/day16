package day16;
interface 공방{
	public void attack();
	public void defense();
	
}
class AA지상군 implements 공방{

	public void 총알장전() { System.out.println("총알장전");}
	public void attack() {
		총알장전();
		System.out.println("공격 개시");
		
	}

	
	public void defense() {
		System.out.println("지상군 방어합니다");
		
	}
	
}

class AB{
	public void printAttack(공방 aa) {
		aa.attack();
	}

}
class BB공군 implements 공방{

	@Override
	public void attack() {System.out.println("공군공격");}
	
	@Override
	public void defense() {System.out.println("공군 방어합니다");}
}
public class Ex07 {

	public static void main(String[] args) {
		공방 a = new AA지상군();
		a.attack();
		
		AB ab = new AB();
		AA지상군 aa = new AA지상군();
		
		ab.printAttack(aa);
		
		ab.printAttack(new BB공군());

	}

}
