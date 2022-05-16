package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값 입력: "); // 입력을 받을때는 println이 아니라 print
		int num = scanner.nextInt();
		
		System.out.println("입력한 값: " + num);
		
		/*
		 * 숙제: 스캐너 이용해서 윤년 만들어보기
		 */
	}

}
