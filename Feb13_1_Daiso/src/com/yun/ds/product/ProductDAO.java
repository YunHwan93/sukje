package com.yun.ds.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.yun.ds.main.DBManager;

public class ProductDAO {
	public static void doRegProduct(Product p) {
		String sql = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = DBManager.doConnect();
			sql = "insert into DProduct values(?,?,?,0)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, p.getP_name());
			pstmt.setInt(2, p.getP_price());
			pstmt.setInt(3, p.getP_floor());

			if (pstmt.executeUpdate() == 1) {
				ProductController.goRegProductResult();
			} else {

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, null);
		}
	}

	public static void doAddStock(Product p) {
		String sql = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = DBManager.doConnect();
			sql = "update DProduct set p_stock=p_stock+? where p_name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(2, p.getP_name());
			pstmt.setInt(1, p.getP_stock());

			if (pstmt.executeUpdate() == 1) {
				ProductController.goAddStockResult();
			} else {

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, null);
		}

	}

	public static void doCalculate(ArrayList<Product> calculate_list) {
		String sql = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = DBManager.doConnect();

			
			for (Product p : calculate_list) {
				sql = "select * from DProduct where p_name=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, p.getP_name());
				rs= pstmt.executeQuery();
			}
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}

	}
}
