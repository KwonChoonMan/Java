package day1;

import java.util.ArrayList;

// 향샹된 for 
public class Example6 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		// 향샹된 for : js의 of , 파이썬의 in
		for (Integer ob : list1) {
			System.out.println(ob)
		}
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		//자바의 모든 객체를 가리킬 수 있는 참조변수 타입이 Object 
		for(Object ob:list2) {    // 이렇게 코드를 만들면은 안된다 object로 넘길수는 있다 
			System.out.println(ob);
		}
	}
}
