package com.yun.ds.main;
import java.util.Scanner;

public class MainMenu {
	public static void menu() {
		Scanner input=null;
		try {
			input= new Scanner(System.in);
			System.out.println("���θ޴�");
			System.out.println("1.��ǰ");
			System.out.println("2.����");
			System.out.println("3.���");
			System.out.println("4.����");
			System.out.println("--------");
			System.out.print("�޴�: ");
			int menu=input.nextInt();
			MainController.goSubMenu(menu);
		} catch (Exception e) {
			System.out.println("�ȹٷ� �Է��Ͻʽÿ�");
			menu();
		}
		
	}

}
