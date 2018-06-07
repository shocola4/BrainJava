package com.kosea.kmove30;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisTest {

	public static void main(String[] args) {
		
		String resource = "mybatis-config.xml";//src경로
		
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			SqlSession session = sqlSessionFactory.openSession();
			try {
			 // Blog blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
				//Member member =new Member();
			    ////////조회/////////
				//Member member = session.selectOne("org.mybatis.example.SelectMapper.selectMember", 101);
			
		/*	System.out.println("회원번호"+ member.getMno());
			
			System.out.println("회원아이디"+ member.getId());
			
			System.out.println("회원비밀번호"+ member.getPass());*/
		
	        ////////추가시작/////////
		/*Member newMember=new Member(102, "testID","12348");
		//Member newMember=new Member(103, "miriri","12343");
		int insertCount=session.insert(	"org.mybatis.example.SelectMapper.insertMember",newMember);
		System.out.println("추가건수"+insertCount);	*/
		
//			Member newMember=new Member();
//			newMember.setMno(102);			newMember.setId("testID");
//			newMember.setPass("12348" );
			////////삭제/////////
//			int deleteCount =session.delete("org.mybatis.example.SelectMapper.deleteMember", 101);
//		 	System.out.println("삭제건수"+deleteCount);
		    ////////추가종료///////// 		
		
		
		   ////////수정 시작////////
				String queryMapping = "org.mybatis.example.SelectMapper.UpdateMember";

				Member member = new Member(103, "HDD", "12345");

				int updateCount = session.update(queryMapping, member);

				System.out.println("수정 건수: " + updateCount);
		   ////////수정 종료////////
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
		
			} finally {
			  session.commit();	
			  session.close();
			}
		} catch (Exception ex) {

			ex.printStackTrace();
		}
		
	}

}
