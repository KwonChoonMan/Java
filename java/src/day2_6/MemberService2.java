package day2_6;

import java.util.ArrayList;

public class MemberService2 {
  private static ArrayList<Member> list = new ArrayList<>();
  // 아이디 사용 가능 
  public static Boolean 아이디사용가능(String username) {
	  for(Member m:list) {
		  if(m.getUsername().equals(username)) {
			  return false;
		  }
	  }
	  return true;
  }
    // 회원가입 
  public static void 















}
