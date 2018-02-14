package com.yun.ds.product;

public class Product {
	private String p_name;
	private int p_price;
	private int p_floor;
	private int p_stock;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String p_name, int p_price, int p_floor,int p_stock) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_floor = p_floor;
		this.p_stock = p_stock;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public int getP_floor() {
		return p_floor;
	}

	public void setP_floor(int p_floor) {
		this.p_floor = p_floor;
	}

	public int getP_stock() {
		return p_stock;
	}

	public void setP_stock(int p_stock) {
		this.p_stock = p_stock;
	}
	
	
}
