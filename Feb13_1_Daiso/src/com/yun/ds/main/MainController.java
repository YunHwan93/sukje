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
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			MainMenu.menu();
		}
	}
	public static void main(String[] arg) {
		MainController.showMenu();
	}

}
