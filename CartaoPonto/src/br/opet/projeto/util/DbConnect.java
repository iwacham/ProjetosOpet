package br.opet.projeto.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Tiago Iwamoto
 *
 */
public class DbConnect {
	
	/**
	 * 
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver").newInstance();
		String dbLocal = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conexao = DriverManager.getConnection(dbLocal, "system", "iwamoto");
		return conexao;
	}

	/**
	 * 
	 * @param conn
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public static ResultSet getResultSet(Connection conn, String sql) throws SQLException {
		Statement st = conn.createStatement();
		return st.executeQuery(sql);
	}

	/**
	 * 
	 * @param conn
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public static PreparedStatement getPreparedStatement(Connection conn, String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}
}
