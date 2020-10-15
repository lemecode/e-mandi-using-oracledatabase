package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {

		Properties prop = loadPropertiesFile();

		final String driver = prop.getProperty("driver");

		Class.forName(driver);

		final String url = prop.getProperty("url");
		final String user = prop.getProperty("username");
		final String pass = prop.getProperty("password");

		Connection con = DriverManager.getConnection(url, user, pass);

		return con;

	}

	public static Properties loadPropertiesFile() throws IOException {

		Properties prop = new Properties();

		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;

	}
}
