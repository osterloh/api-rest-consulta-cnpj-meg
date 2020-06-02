package br.com.meg.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnect {
	
	private static DataBaseConnect db;
	private Connection con;

	private DataBaseConnect() {
		try {			
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.55.245:1521:dbsystex", "systextil", "oracle");
						
		} catch (Exception e) {
			System.out.println("\n\n##########################################");
			System.out.println("Erro ao conectar na BD!!!");
			System.out.println("##########################################\n\n");
			e.printStackTrace();
		}
	}

	public static DataBaseConnect getInstance() {
		if (db == null)
			db = new DataBaseConnect();

		return db;
	}

	public Connection getConnection() {
		return con;
	}

}
