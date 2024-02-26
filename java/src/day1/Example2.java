package day1;

// wrapper class
// 자바의 기본타입과 1:1인 클래스 
public class Example2 {
   public static void main(String[] args) {
	     // a는 10이라는 값만 저장 
	     int a = 10;
	     
	     // b는 값외에 여러 메소드를 가진 객체 
	     Integer b = new Integer(10);
	     
	     System.out.println(a);
	     System.out.println(b.MAX_VALUE);
	     
	     // 서버에서 사용자가 값을 입력하지 않으면 서버는 null을 가지게 된다 
	     // 나이를 입력받는다면
	     
	     int x = null;   //  기본타입으로는 안된다 int 대신에 Intege로 쓴다  
	     Integer y = null;
	     // 자바에서 null의  정의는 참조변수가 아직 가리키는 객체가 없다라는 뜻 
   }
}
