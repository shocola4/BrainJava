
//패키지
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.sql. ResultSet;

class JDBCExample2 {
    public static void main(String args[]) {
    	//1단계:DB 연결을 위한 커넥션 인터페이스
        Connection conn = null;
        // Statement 인터페이스-SQL 실행
        Statement  stmt = null;
        // ResultSet 인터페이스-SQL 결과를 저장
        ResultSet rs = null;
        //try ~catch문에서 DB연결중에 예외가 발생하느지를 검사.
        try {
             String jumincd=null;  
        	 String pname=null;
        	 String gender=null;
        	int age=0;
      
        	
        	//2단계;JDB드라이버를 로드한다.
            Class.forName("com.mysql.jdbc.Driver");
            //3단계:드라이버매니져 클래스는 DB를 연결한다.
            conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3307/mysql", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
            
            //커넥션 객체가 Statement객체를 생성
            stmt=conn.createStatement();
            //DML SQL쿼리 실행후 결과를 저장
            rs=stmt.executeQuery(" select jumincd,pname,gender,age from person where gender ='f'");
            		
            			
            
            System .out. println("주민번호 이름 성별 나이");
            
            while(rs.next()) {
            
             jumincd= rs.getString(1);//rs.getString(jumincd);
             pname= rs .getString(2);//getString("pname");
            gender= rs .getString(3);//getString("gender");
             age = rs.getInt(4);//getInt("age");
            
            System .out. println(jumincd+"---"+pname+"--"+gender+"--"+age);
            }
            
            //4단계:DB연결을 종료한다.
            conn.close();
            System .out. println(jumincd+"---"+pname+"--"+gender+"--"+age);
            System .out. println(jumincd+"---"+pname+"--"+gender+"--"+age);
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}