package day16;

import java.util.Scanner;
interface Test01{
	public static final String NAME="ȫ�浿";
	public String N = "aaa";
}
public class Ex09 {

	public static void main(String[] args) {	
		System.out.println(Test01.NAME);
//		���� a = new AA����();
//		���� d = new BB����();
		���� u;
		System.out.println("���� �ĵ�� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice =0, num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(num ==1) {
			u = new AA����();
			System.out.println("������ �����߽��ϴ�");
		}else {
			u = new BB����();
			System.out.println("������ �����߽��ϴ�");
		}
		System.out.println("1.���� 2.���");
		choice = scan.nextInt();
		if(choice == 1) u.attack();
		else if(choice == 2) u.defense();
		

	}

}
