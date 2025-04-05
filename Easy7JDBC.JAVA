package Project1; import java.sql.*; public
class Easy7JDBC { public static void
main(String[] args) {
// Database connection details
String url = "jdbc:mysql://localhost:3306/shivanidb";
String username = "root";
String password = "Shivani@1234";
// SQL Query
String query = "SELECT * FROM Employee"; try (Connectionconn = DriverManager.getConnection(url, username, password);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(query)) {
System.out.println("Connected to shivanidb successfully!\n");System.out.println("EmpID | Name | Salary"); while (rs.next()){
System.out.printf("%d | %s | %.2f\n",
rs.getInt("EmpID"), rs.getString("Name"),
rs.getDouble("Salary"));}
} catch (SQLException e) {
System.err.println("Connection failed: " + e.getMessage());}
}}
