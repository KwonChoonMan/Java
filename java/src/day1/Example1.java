package day1;

public class Example1 {
  public static void main(String[] args) {
	      // 타입 
	      // 1. 기본타입 : 정수 , 실수 , 문자 , 참거짓 
	      // 정수는 크기가 커지면 표현범위가 넒어진다
	      // 4바이트 정수 : -21억~21억 
	       int a = 10; 
	       // 8바이트 정수  : -900경~ +900경 
	       long b = 20;
	       
	       // 실수는 크기가 커지면 정밀해진다(실수는 근사값)
	       float f = 10;
	       double d = 10;
	       
	       //문자형은 글자 1글자를 저장 -> 거의 사용하지 않음
	       char ch = 'A';
	        
	       boolean isChild = false;
	       
	       // 2. 참조변수 : 객체를 가리키는 4바이트 리모콘
	       //             객체 자체는 이름이 없다 
	       //              참조변수로 작업한다 
	       String str = "Hello";
	       System.out.println(str.hashCode());
    }
}
