package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	public static Connection getConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
                            return DriverManager.getConnection("jdbc:jtds:sqlserver://DESKTOP-KMNS09Q:1433/QLBH");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

		}
		return null;
	}
}
