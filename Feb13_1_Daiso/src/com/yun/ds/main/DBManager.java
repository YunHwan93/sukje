package com.yun.ds.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DBManager {
	public static Connection doConnect() throws Exception{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
	    return DriverManager.getConnection(url,"yun","1993");
	}
	public static void close(Connection con,PreparedStatement pstmt,ResultSet rs) {
		try {con.close();} catch (Exception e) {}
		try {pstmt.close();} catch (Exception e) {}
		try {rs.close();} catch (Exception e) {}
	}
}
