package inner;

// 내부 클래스
/*
 * 클래스, 메소드 속에 클래스
 * 
 * 장점
 * 	내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
 * 	캡슐화, 코드의 복잡성을 줄여준다.
 * 	내부 클래스가 외부 클래스의 부품을 활용할 때
 * 	내부 클래스는 잘 활용되지 않을 때
 * 
 * 보통의 클래스는
 * class A{}
 * class B{}
 * 
 * 내부 클래스는
 * class A{
 * 	class B{}
 * }
 * 
 * 종류
 * 정적 멤버 클래스: 외부 클래스의 멤버 변수 위치에 선언
 * 스타틱 클래스	 스타틱 멤버처럼 다뤄진다.
 * 					 주로 외부 클래스의 스타틱 멤버, 특히 스타틱 메소드에 사용될 목적으로 선언한다.
 * 
 * 멤버 클래스: 외부 클래스의 멤버 변수 위치에 선언
 * 				인스턴스 멤버처럼 사용된다.
 * 				주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용
 * 
 * 지역 클래스: 외부 클래스의 메소드나 초기화 블럭 안에서 선언
 * 				선언된 영역 내부에서만 사용된다.
 * 
 * 익명 클래스: 클래스 선언과 객체의 생성을 동시에 하는 이름없는 클래스
 * 				(일회용)
 */
public class InnerClass01 {
	class Human{
		
	}
}