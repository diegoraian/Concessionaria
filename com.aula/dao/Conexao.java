package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public abstract class Conexao {

	Connection conn ;
	
	public Conexao() {
	}
	public Connection getConnection (){
		String fileProperty = "";
		String [] paramsToRead =  {};
		new ReadFileProperty(fileProperty,paramsToRead);
		
		
		String DRIVER  = "com.ibm.db2.jdbc.net.DB2Driver";
		String URL = "jdbc:db2:localhost:8080/treinoweb";
		String USER = "";
		String PASS = "";
		try{
			Class.forName(DRIVER).newInstance();
			conn = DriverManager.getConnection(URL, USER, PASS);
		}catch(Exception ae){
			conn = null;
		}
		
		return conn;
	}
	public Boolean close (PreparedStatement ps){
		 try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return Boolean.TRUE;
	}
}
