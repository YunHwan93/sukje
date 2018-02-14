package com.yun.ds.main;
import com.yun.ds.product.ProductController;

public class MainController {
	public static void showMenu() {
		MainMenu.menu();
	}
	public static void goSubMenu(int menu) {
		if (menu==1) {
			ProductController.goProductMenu();
		}else if(menu==2) {
			
		}else if(menu==3){

		}else if(menu==4) {
			
		}else {
			System.out.println("잘못 입력하셨습니다");
			MainMenu.menu();
		}
	}
	public static void main(String[] arg) {
		MainController.showMenu();
	}

}
