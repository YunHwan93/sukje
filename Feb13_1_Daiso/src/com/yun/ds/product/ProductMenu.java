package com.yun.ds.product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMenu {
	public static void showProductMenu() {
		Scanner input=null;
		try {
			input= new Scanner(System.in);
			System.out.println("상품메뉴");
			System.out.println("1.상품등록");
			System.out.println("2.재고추가");
			System.out.println("3.상품수정");
			System.out.println("4.상품조회");
			System.out.println("5.이전메뉴");
			System.out.println("--------");
			System.out.print("메뉴: ");
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
			System.out.print("상품이름: ");
			String p_name=input.next();
			System.out.print("상품가격: ");
			int p_price=input.nextInt();
			System.out.print("상품 층: ");
			int p_floor=input.nextInt();
			
			Product p= new Product(p_name, p_price, p_floor,0);
			ProductDAO.doRegProduct(p);
		} catch (Exception e) {
			System.out.println("올바른 입력이 아닙니다");
		}
	}
	public static void showAddStock() {
		Scanner input=null;
		try {
			input= new Scanner(System.in);
			System.out.print("상품이름: ");
			String p_name=input.next();
			System.out.print("추가재고량: ");
			int p_stock=input.nextInt();
			
			
			Product p= new Product(p_name, 0, 0,p_stock);
			ProductDAO.doAddStock(p);
		} catch (Exception e) {
			System.out.println("올바른 입력이 아닙니다");
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
				System.out.print("상품이름: ");
				p_name=input.next();
				System.out.print("수량: ");
				p_stock=input.nextInt();
				p= new Product(p_name, 0, 0,p_stock);
				calculate_list.add(p);
				System.out.println("더 계산하시겠습니까?y/n");
				again=input.next();
				if (again.equals("n")) {
					break;
				}
			}
			ProductDAO.doCalculate(calculate_list);
			
			
			
			ProductDAO.doAddStock(p);
		} catch (Exception e) {
			System.out.println("올바른 입력이 아닙니다");
		}
	}

}
