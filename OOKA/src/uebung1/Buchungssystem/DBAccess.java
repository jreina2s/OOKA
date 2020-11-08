package uebung1.Buchungssystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBAccess {


	public final static int HOTEL = 0;

	public final static int AUTO = 1;

	private String url = "jdbc:postgresql://dumbo.inf.h-brs.de/demouser";

	private Connection conn;

	public DBAccess() {

	}

	public void openConnection() {
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Properties props = new Properties();
		props.setProperty("user", "demouser");
		props.setProperty("password", "demouser");

		try {
			this.conn = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<String> getObjects(int type, String value) {
		Statement st;
		List<String> result = new ArrayList<String>();
		if (value.equals("*")) {
			value = "";
		}
		try {
			st = conn.createStatement();
			if (type == HOTEL) {
				result = getHotel(st, value);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	private List<String> getHotel(Statement st, String value) throws SQLException {
		ResultSet rs;
		List<String> result = new ArrayList<String>();
		rs = st.executeQuery(
				"SELECT * FROM buchungsystem.hotel WHERE buchungsystem.hotel.name ilike " + "\'%" + value + "%\'");
		while (rs.next()) {
//			System.out.println("Hotel: " + rs.getString("name"));
			result.add(rs.getString(1));
			result.add(rs.getString(2));
			result.add(rs.getString(3));
			result.add(rs.getString(4));
			result.add(rs.getString(5));

//			Attribute für die Klasse Hotel herrausfinden
//			System.out.println(rs.getMetaData().getColumnName(1));
//			System.out.println(rs.getMetaData().getColumnName(2));
//			System.out.println(rs.getMetaData().getColumnName(3));
//			System.out.println(rs.getMetaData().getColumnName(4));
//			System.out.println(rs.getMetaData().getColumnName(5));
		}

		return result;
	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
