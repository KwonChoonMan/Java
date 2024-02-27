package day1_2;

import java.util.ArrayList;

public class GuestBookService {
	private ArrayList<GuestBook> list = new ArrayList<>();
	
	public void save(GuestBook gb) {
		list.add(gb);
	}
	
	public ArrayList<GuestBook> findAll() {
		return list;
	}
	
	public GuestBook findById(Long gno) {
		for(GuestBook gb:list) {
			if(gb.getGno()==gno) {
				return gb;
			}  
		}
		return null;
	}
	
	public Long delete(Long gno) {
		for(GuestBook gb:list) {
			if(gb.getGno()==gno) {
				list.remove(gb);
				return 1L;
			}
		}
		return 0L;
	}
}