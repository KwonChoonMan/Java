package day2_9;

// 상속의 활용 
// 
class Parent {
    int a;
}

class Child extends Parent{
    int b;
}

public class 상속Test3 {
	public static void main(String[] args) {
        // 1. 부모의 참조변수는 자식을 가리킬 수 있다 
		// 
		//Parent ob = new Child();    이렇게 적어야 한다 !!!
		//Child  ob2 = new Child();   이렇게 안적는다 
		Parent ob1 = new Child();
		System.out.println(ob1.a);
		System.out.println(ob1.b);  // 자식의 필드에는 접근을 할 수가 없다 
		
		Child ob2 = new Child();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		
		// 역은 불가능 
		//Child ob3 = new Parent();  역으로 가리키는건 불가능하다 
	}
}
