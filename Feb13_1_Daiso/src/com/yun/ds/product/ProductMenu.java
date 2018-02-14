package com.yun.ds.product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMenu {
	public static void showProductMenu() {
		Scanner input=null;
		try {
			input= new Scanner(System.in);
			System.out.println("��ǰ�޴�");
			System.out.println("1.��ǰ���");
			System.out.println("2.����߰�");
			System.out.println("3.��ǰ����");
			System.out.println("4.��ǰ��ȸ");
			System.out.println("5.�����޴�");
			System.out.println("--------");
			System.out.print("�޴�: ");
			int menu = input.nextInt();
			ProductController.doDBWork(menu);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void showRegProduct() {
		Scanner input=null;
		try {
			input= new Scanner(System.in);
			System.out.print("��ǰ�̸�: ");
			String p_name=input.next();
			System.out.print("��ǰ����: ");
			int p_price=input.nextInt();
			System.out.print("��ǰ ��: ");
			int p_floor=input.nextInt();
			
			Product p= new Product(p_name, p_price, p_floor,0);
			ProductDAO.doRegProduct(p);
		} catch (Exception e) {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�");
		}
	}
	public static void showAddStock() {
		Scanner input=null;
		try {
			input= new Scanner(System.in);
			System.out.print("��ǰ�̸�: ");
			String p_name=input.next();
			System.out.print("�߰����: ");
			int p_stock=input.nextInt();
			
			
			Product p= new Product(p_name, 0, 0,p_stock);
			ProductDAO.doAddStock(p);
		} catch (Exception e) {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�");
		}
		
	}
	public static void showCalculateMenu() {
		Scanner input=null;
		try {
			ArrayList<Product> calculate_list= new ArrayList<>();
			Product p=null;
			int p_stock=0;
			String p_name=null;
			String again=null;
			while (true) {
				input= new Scanner(System.in);
				System.out.print("��ǰ�̸�: ");
				p_name=input.next();
				System.out.print("����: ");
				p_stock=input.nextInt();
				p= new Product(p_name, 0, 0,p_stock);
				calculate_list.add(p);
				System.out.println("�� ����Ͻðڽ��ϱ�?y/n");
				again=input.next();
				if (again.equals("n")) {
					break;
				}
			}
			ProductDAO.doCalculate(calculate_list);
			
			
			
			ProductDAO.doAddStock(p);
		} catch (Exception e) {
			System.out.println("�ùٸ� �Է��� �ƴմϴ�");
		}
	}

}
