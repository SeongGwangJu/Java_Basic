package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


import connect.DBConnection;
import vo.ProductVO;

public class ProductDao extends DBConnection{
	
	//
	
	//삭제
	public int delete(int code) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM PRODUCT "
				+ "WHERE PRODUCT_CODE = ?";
		
		int res = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, code);
			res = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(conn);
				close(pstmt);
			}
	}
	//검색
	public List<ProductVO> search(String search) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_NAME LIKE ?";
		List<ProductVO> list = new ArrayList<ProductVO>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "% + search + "%");
			stmt
		}
	}
	//쓰기
	public int insert(ProductVO productVO) {
		Connection conn = getConnection();
		PreparedStatement stmt = null;
		int res = 0;
		String sql = "INSERT INTO PRODUCT(PRODUCT_CODE, PRODUCT_NAME, _RPODUCT_PRICE, PRODUCT_FACTORY, PRODUCT_DATE" 
		+ "VALUES(?,?,?,?,?,?)";
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, productVO.getProduct_code());
			stmt.setString(2, productVO.getProduct_name());
			stmt.setInt(3, productVO.getProduct_price());
			stmt.setInt(4, productVO.getProduct_count());
			stmt.setString(5, productVO.getProduct_factory());
			stmt.setString(6, productVO.getProduct_date());
			res = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
			close(stmt);
		} 
		return res;
	}
				
	
	
	public List<ProductVO> select() {
		Connection conn = getConnection();
		String sql = "SELECT * FROM PRODUCT";
		Statement stmt = null;
		ResultSet rs = null;
		
		List<ProductVO> list = new ArrayList<ProductVO>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProduct_code(rs.getInt("PRODUCT_CODE"));
				vo.setProduct_name(rs.getString("product_name"));
				vo.setProduct_count(rs.getInt("product_count"));
				vo.setProduct_factory(rs.getString(0));
				vo.setProduct_date(rs.getString(0));
			}
		}
	}
}


				
			
		

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("-------------------- 재고관리 프로그램 --------------------");
			System.out.println("1.제품등록|2.제품조회|3.제품검색|4.제품삭제|5.제품수정|6.종료");
			System.out.println("1. 제품등록");
			System.out.println("2. 제품조회");
			System.out.println("3. 제품검색");
			System.out.println("4. 제품삭제");
			System.out.println("5. 제품수정");
			System.out.println("6. 프로그램 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("메뉴를 선택해 주세요 >> ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("제품코드등록 >> ");
				int code = sc.nextInt();
				
				System.out.println("제품이름등록 >> ");
				String name = sc.next();
				
				System.out.println("제품가격등록 >> ");
				int price = sc.nextInt();
				
				System.out.println("제품수량등록 >> ");
				int count = sc.nextInt();
				
				System.out.println("제조사등록 >>");
				String factory = sc.next();
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
				Date now = new Date();
				String time = format.format(now);
				
				ProductVO vo = new ProductVO(code, name, price, count, factory, time);
				if(dao.insert(vo) >0 ) {
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
					
					
					
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
			} else if(choice ==2) {
				
				ProductDao dao = new ProductDao();
				List<ProductVO> list = dao.select();
				for(ProductVO vo : list) {
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
					System.out.println("제품코드 : " + vo.getProduct_code());
					System.out.println("제품이름 : " + vo.getProduct_name());
					System.out.println("제품가격 : " + vo.getProduct_price());
					System.out.println("재고수량 : " + vo.getProduct_count());
					System.out.println("제조사 : " + vo.getProduct_factory());
					System.out.println("입고날짜 : " + vo.getProduct_date());
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
					
					
					
				}
			} else if(choice ==3) {
				
			} else if(choice ==4) {
				
			} else if(choice ==5) {
				
			} else if(choice ==6) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
	
		
		}
	}
}
