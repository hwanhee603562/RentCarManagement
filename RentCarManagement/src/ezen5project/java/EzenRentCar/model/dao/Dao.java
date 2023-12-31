package ezen5project.java.EzenRentCar.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// SQL 커넥트 클래스
public class Dao {

	public Connection conn;			// DB연동 객체
	public PreparedStatement ps; 	// 연동된 DB에서 SQL조작( SQL매개변수대입, SQL실행/취소 ) 하는 객체 
	public ResultSet rs;			// SQL 조작 결과(검색결과)를 가져오는 객체 
	
	public Dao() {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");	
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ezenrentcar"
							, "root", "1234");
		}catch (Exception e) {System.out.println("경고] DB연동성공실패 : "+e);}
	}
	
}
