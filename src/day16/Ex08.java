package day16;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {		
		���� a = new AA����();
		���� d = new BB����();
		//���� ad = ����;
		System.out.println("���� �ĵ�� �Խ��ϴ�");
		System.out.println("1.���� 2.����");
		int choice =0, num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(num ==1) {
			System.out.println("������ �����߽��ϴ�");
		}else {
			System.out.println("������ �����߽��ϴ�");
		}
		System.out.println("1.���� 2.���");
		choice = scan.nextInt();
		if(choice == 1 && num == 1) a.attack();
		else if(choice == 2 && num == 1) a.defense();
		else if(choice == 1 && num == 2) d.attack();
		else if(choice == 2 && num == 2) d.defense();

	}

}
