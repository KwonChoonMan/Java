package day1_1;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 할일 객체 : 번호, 할일, 작성일, 완료여부
// js의 경우 : {tno:1, title:'자바공부', finish:true}
// 자바의 경우에는 설계도인 클래스를 만든 다음에 객체를 생성

// 접근제어자(access modifier)
// 1. public
// 2. private
// 왜 private? 허락된 사용자만 값을 읽고 쓸 수 있다

@Getter
@Setter
public class Todo {
	private Long tno;
	private String title;
	private LocalDate writeday;
	private Boolean finish;
	
	// 생성자는 객체 생성을 담당하는 메소드
	// 1. 이름은 클래스 이름과 같다
	// 2. 리턴값이 없다(void가 아니라 아예 없다)
	// 3. 인자가 하나도 없는 생성자 : 기본 생성자(default constructor)
	// 4. 생성자가 없을 경우 기본 생성자를 자바가 자동으로 추가한다
	// 	  즉 모든 클래스를 생성자를 최소한 1개는 가진다
	public Todo(Long tno, String title, LocalDate writeday, Boolean finish) {
		// this : 객체 자신
		this.tno = tno;
		this.title = title;
		this.writeday = writeday;
		this.finish = finish;
	}
	
	// 변수나 메소드의 이름이 모두 달라야한다
	// method overload : 인자가 다르면 메소드의 이름이 같아도 된다
	public Todo() {
	}
}