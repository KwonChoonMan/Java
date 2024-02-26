package day1_1;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TodoServiceTest {
	// TodoService를 테스트하기 위해 객체를 생성
	private TodoService service = new TodoService();

	// junit으로 테스트하려면 반드시 public void 형식이여야 한다
	// @Test 테스트는 하나씩
	public void findAllTest() {
    	// Todo가 없는 상태에서 0인지 테스트 
    	ArrayList<Todo> list1 = service.findAll();
    	assertEquals(0, list1.size());
    	
    	service.save(new Todo(1l,"자바공부",LocalDate.now(),false));
    	ArrayList<Todo> list = service.findAll();
    	
    	// assert 메소드는 검증하는 메소드 package day1_1;



    public class TodoService {
	// 데이터베이스 대신 ArrayList 
	private ArrayList<Todo> list = new ArrayList<>();

	// 할일 추가 메소드
	public void save(Todo todo) {
       list.add(todo);
	}

	// 할일 목록
	public ArrayList<Todo> findAll() {
       return list;
	}
    // 마이바티스 db 프레임워크에서 save delete update의 결과는 정수 
	// 할일 삭제 
	public long delete(Long tno) {
       for(Todo t:list) {
    	   if(t.getTno()==tno) {
    		   // 인덱스로 삭제 또는 객체로 삭제 
    		   list.remove(t);
    		   return 1;
    	   }
       }
       return 0L;
	}

	// 할일 변경
	public Long change(Long tno) {
      for(Todo t:list) {
    	  if(t.getTno()==tno) {
    		  t.setFinish(!t.getFinish());
    		  return 1L;
    	  }
      }
       return 0L;
	}
}
 
    	
    }

	//@Test
	public void deleteAndUpdateTest() {
		service.save(new Todo(1l, "자바공부", LocalDate.now(), false));
		service.save(new Todo(2l, "영어공부", LocalDate.now(), false));

		// 삭제 성공 테스트
		assertEquals(1L, service.delete(2L));
		// 삭제 실패 테스트
		assertEquals(0L, service.delete(222L));
	}
	@Test
		public void UpdateTest() {
			service.save(new Todo(1l, "자바공부", LocalDate.now(), false));
			service.save(new Todo(2l, "영어공부", LocalDate.now(), false));
             
			
}
