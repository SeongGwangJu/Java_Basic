package exma;

public class Example02 {
	/*
	 * 데이터베이스(DB)
	 * - 데이터베이스는 데이터의 집합 이라고 한다 
	 * 데이터베이스에는 대부분의 정보가 저장되고 관리된다.
	 * 
	 * 데이터베이스의 특징 
	 * - 데이터무결성, 데이터일관성, 데이터회복성, 데이터보안성, 데이터효율성
	 * 
	 * 데이터무결성 : 부적절한 자료가 입력되어 동일한 내용에 대하여 서로 다른 데이터가 
	 * 			   저장되는 것을 허용하지 않는 성질 
	 * 데이터일관성 : 삽입, 삭제, 갱신, 생성 후에도 저장된 데이터가 변함없음 
	 * 데이터회복성 : 장애가 발생하였을 시 특정 상태로 복구되어야 하는 성질 
	 * 데이터보안성 : 불법적인 노출, 변경, 손실로부터 보호되어야 하는 성질 
	 * 데이터효율성 : 응답시간, 저장 공간 활용 등이 최적화되어 사용자, 시스템등의 
	 * 			   요구조건을 만족시켜야 하는 성질 
	 * 
	 * DBMS : 데이터베이스를 관리하고 운영하는 소프트웨어 
	 * 
	 * DBMS의 장점
	 * - 자료의 통합성을 증진시키고 데이터의 접근을 용이하게 해준다 
	 * - 장애 발생시 회복이 가능하고 표준화가 가능
	 * - 데이터의 통제가 쉬워지고 애플리케이션 프로그램들을 쉽게 개발하고 관리할 수 있다.
	 * 
	 * DBMS의 단점 
	 * - 고가의 제품이고 컴퓨터 시스템의 자원을 많이 사용한다 
	 * - 통합된 시스템이기에 일부가 장애를 일으키면 전체 시스템에 장애가 발생함 
	 * 
	 * DBMS의 종류 : ORACLE, MYSQL, MariaDB, MS-SQL 등..
	 * DBMS의 유형은 계층형, 망형, 관계형
	 * 
	 * 관계형데이터베이스(RDBMS)
	 * - 테이블이라는 최소 단위로 구성되며, 이 테이블은 하나 이상의 열(COLUMN)
	 * 과 행(ROW)으로 이뤄져있고 모든 데이터가 여기에 저장됨 
	 * 
	 * SQL : DBMS에서 사용되는 언어 데이터베이스를 조작할 수 있는 언어 
	 * SQL은 구조화된 쿼리 언어이며, 데이터베이스에 쿼리를 보내 원하는 데이터를
	 * 가져오거나 삽입할 수 있다.
	 * 
	 * SQL문법은 크게 3가지로 나뉜다(DDL, DML, DCL)
	 * DDL : 테이블이나 관계의 구조를 생성하는데 사용 
	 * 		CREATE, ALTER, DROP, TRUNCATE 등이 있다 
	 * DML : 테이블에 데이터 검색, 삽입, 수정, 삭제하는 데 사용 
	 * 		 SELECT(조회), INSERT(삽입), UPDATE(수정), DELETE(삭제) 
	 * DCL : 데이터의 사용 권한을 관리하는데 사용 
	 * 		GRANT, REVOKE등 
	 * GRANT : 특정 데이터베이스 사용자에게 특정 작업에 대한 수행 권한을 부여 
	 * REVOKE : 특정 데이터베이스 사용자에게 특정 작업에 대한 수행 권한을 박탈 
	 * 
	 * JDBC
	 * - JDBC는 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API 
	 * 
	 * java.sql.Connection : 연결
	 * java.sql.Statement : sql을 담은 내용 
	 * java.sql.ResultSet : sql 요청 응답 
	 * 
	 */
}
