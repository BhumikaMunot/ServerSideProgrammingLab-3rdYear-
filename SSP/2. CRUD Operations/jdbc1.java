import java.sql.*;
public class jdbc1{
    public static void main(String [] args){
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        Connection conn;
        try{
            conn = DriverManager.getConnection("jdbc:odbc:student");
            Statement stmt = conn.createStatement();
            String sql1 ="Select * from marks";

			ResultSet rs=stmt.executeQuery(sql1);
			int cnt=1;
			while(rs.next()){
				int ExamNo=rs.getInt("ExamNo");
				String Name=rs.getString("Name");
				int m1=rs.getInt("m1");
                int m2=rs.getInt("m2");
                int Total=rs.getInt("m2");
				
				
				//Date bdate=rs.getDate("dob");

								
				//int phoneNumber=rs.getInt("phoneno");
                System.out.println(ExamNo+" "+Name+" "+m1+" "+m2+" "+Total);
				
			}
		}
			catch(SQLException e){
				e.printStackTrace();
			}
        }
    }
