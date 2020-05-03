package com.cmr.amazon.common;
import java.sql.*;
public class JDBCTemplate {
	public static boolean executeUpdate(String sql) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DBConFactory.getConnection();
			stmt=con.createStatement();
			stmt.executeUpdate(sql);
		}catch(Exception e) {System.out.println(e); return false;}
		finally {
			try {
			con.close();
			stmt.close();
			}catch(Exception e) {System.out.println(e);}
		}
		return true;
	}
	public static ResultSet executeQuery(String sql) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			con=DBConFactory.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
		
		}catch(Exception e) {System.out.println(e);}
		finally {
			try {
			con.close();
			stmt.close();
			}catch(Exception e) {System.out.println(e);}
		}
		return rs;
	}
}
