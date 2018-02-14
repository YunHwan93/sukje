package com.yun.ds.main;
import java.util.Scanner;

public class MainMenu {
	public static void menu() {
		Scanner input=null;
		try {
			input= new Scanner(System.in);
			System.out.println("메인메뉴");
			System.out.println("1.상품");
			System.out.println("2.직원");
			System.out.println("3.계산");
			System.out.println("4.종료");
			System.out.println("--------");
			System.out.print("메뉴: ");
			int menu=input.nextInt();
			MainController.goSubMenu(menu);
		} catch (Exception e) {
			System.out.println("똑바로 입력하십시오");
			menu();
		}
		
	}

}
