package com.yun.ds.product;

public class ProductController {
	public static void doDBWork(int menu) {
		if (menu==1) {
			ProductMenu.showRegProduct();
		}else if (menu==2) {
			ProductMenu.showAddStock();
		}else if (menu==3) {
			
		}else if (menu==4) {
			
		}else if (menu==5) {
			
		}else {
		
		}
	}
	public static void goProductMenu() {
		ProductMenu.showProductMenu();
	}
	public static void goRegProductResult() {
		ProductView.printRegProductResult();
	}
	public static void goAddStockResult() {
		ProductView.printAddStockResult();
		
	}
}
