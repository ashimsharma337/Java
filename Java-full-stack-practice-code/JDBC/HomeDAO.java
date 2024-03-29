package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import beans.Home;

// Data Access Object: CRUD // this class is responsible for handling JDBC 
public class HomeDAO implements HomeDAOInterface, AutoCloseable{
    
	
	
	private Connection connection;
	
	public HomeDAO() throws Exception {
		connect();
	}
	
	public void close() throws Exception {
		if(connection != null && !connection.isClosed()) {
			this.connection.close();
		}
	}
	
	public void connect() throws Exception{
		String url = "jdbc:mysql://localhost:3306/homebuyer";
		String user = "root";
		String password = "password";
		
		// load driver
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		this.connection = DriverManager.getConnection(url, user, password);
	}
	
	
	@Override
	public boolean save(Home home) throws SQLException {
		String sql = "INSERT INTO HOME(ADDRESS, PRICE) VALUE (?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, home.getAddress());
		statement.setInt(2, home.getPrice());
		//INSERT INTO HOME(ADDRESS, PRICE) VALUES ('1234 BOND RD', 223344)
		int rows = statement.executeUpdate();
		return rows > 0 ? true: false;
	}

	@Override
	public List<Home> findAll() throws SQLException {
		String sql = "SELECT HOME_ID, ADDRESS, PRICE FROM HOME";
		List<Home> results = new LinkedList<>();
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		// do something
		while(rs.next()) {
		Home home = new Home(rs.getString("ADDRESS"), rs.getInt("PRICE"));
		home.setId(rs.getInt("HOME_ID"));
		results.add(home);
		}
		return results;
	}

}

interface HomeDAOInterface {
	// create 
	public boolean save(Home home) throws SQLException;
	
	// get 
	public List<Home> findAll() throws SQLException;
}
