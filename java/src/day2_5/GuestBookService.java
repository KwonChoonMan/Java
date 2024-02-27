package day2_5;

import java.util.ArrayList;

// 처리하는 클래스 - > 객체 생성 X 

public class GuestBookService {

	private static ArrayList<GuestBook> list = new ArrayList<>();

	public static void save(GuestBook gb) {
		list.add(gb);
	}

	public static ArrayList<GuestBook> findAll() {
		return list;
	}

	public static GuestBook findById(Long gno) {
		for (GuestBook gb : list) {
			if (gb.getGno().equals(gno)) {
				return gb;
			}
		}
		return null; // 값을 읽어오는 경우에는 읽어내야하기 때문에 null로간다
	}

	public static Boolean delete(Long gno) {
		return false;
	}
}
