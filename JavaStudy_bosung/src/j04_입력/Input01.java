package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력: "); // 입력을 받을때는 println이 아니라 print
		int num1 = scanner.nextInt();
		System.out.print("두번째 값 입력: ");
		int num2 = scanner.nextInt();
		
		System.out.println("입력한 값: " + num1);
		System.out.println("두값을 더한 값: " + (num1 + num2));
		
		scanner.next();				//문자열(String)
		scanner.nextLine();			//문자열(String)
		scanner.next().charAt(0);	//문자(char)
		scanner.nextInt();			//정수(int)
		scanner.nextDouble();		//실수(double)
		
		
		/*
		 * 숙제: 스캐너 이용해서 윤년 만들어보기
		 */
		
//		System.out.print("년도 입력: ");
//		int year = scanner.nextInt();
//		
//		String result = null;
//		result = year % 4 == 0 
//				&& year % 100 != 0 
//				|| year % 400 == 0 ? "윤년" : "윤년이 아님";
//		
//		System.out.println(result);
		
		
		
	}

}
