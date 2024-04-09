package JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JDBCconnection {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\keerthiraja.sp\\Downloads\\SeleniumJarFiles\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/login");
		
		try {
			//1. loaded the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			//2. Establish connection to the database
			String url="jdbc:mysql://localhost:3306/user";
			String username="root";
			String password="Keerthiraja@7";
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connected to database");
			
			//3. Create the statement for connection
			Statement st=con.createStatement();
			String sql="select * from users";
			
			//4. Execute the statement
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next()) {
				// print the user name and password from the database
				System.out.println("Username : "+ rs.getString(1));
				System.out.println("Password : "+ rs.getString(2));
				
				// get data from database and store into the string variable
				String Username=rs.getString(1); 
				String Password=rs.getString(2);
				driver.findElement(By.xpath("/html/body/div[7]/div/form/div[3]/div/input[2]")).sendKeys(Username);
				driver.findElement(By.xpath("/html/body/div[7]/div/form/div[4]/div/input")).sendKeys(Password);

			}
			con.close();		
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
