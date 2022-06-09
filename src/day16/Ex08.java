package day16;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {		
		공방 a = new AA지상군();
		공방 d = new BB공군();
		//공방 ad = 공군;
		System.out.println("적이 쳐들어 왔습니다");
		System.out.println("1.지상군 2.공군");
		int choice =0, num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(num ==1) {
			System.out.println("지상군을 선택했습니다");
		}else {
			System.out.println("공군을 선택했습니다");
		}
		System.out.println("1.공격 2.방어");
		choice = scan.nextInt();
		if(choice == 1 && num == 1) a.attack();
		else if(choice == 2 && num == 1) a.defense();
		else if(choice == 1 && num == 2) d.attack();
		else if(choice == 2 && num == 2) d.defense();

	}

}
