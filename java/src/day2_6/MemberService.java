package day2_6;

import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;

public class MemberService {
	private static ArrayList<Member> list = new ArrayList<>();
	// 아이디 사용가능
	public static Boolean 아이디사용가능(String username) {
		for(Member m:list) {
			if(m.getUsername().equals(username)) {
				return false;
			}
		}
		return true;
	}
	
	// 회원가입
	public static void 조인(Member member) {
		list.add(member);
	}
	
	// 아이디 찾기
	public static String 아이디찾기(String email) {
		for(Member m:list) {
			if(m.getEmail().equals(email)) {
				return m.getUsername();
			}
		}
		return null;
	}
	
	// 비밀번호 찾기 -> 임시비밀번호 발급
	// pom.xml에 apache commons lang
	public static String 임시비밀번호(String username) {
		for(Member m:list) {
			if(m.getUsername().equals(username)) {
				return RandomStringUtils.randomAlphanumeric(20);
			}
		}
		return null;
	}
	
	// 로그인
	public static Boolean 로그인(String username, String password) {
		for(Member m:list) {
			if(m.getUsername().equals(username) &&
					m.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	// 내정보 : 실제 상황에서는 비밀번호는 안나가야 한다
	public static Member 내정보(String username) {
		for(Member m:list) {
			if(m.getUsername().equals(username)) {
				return m;
			}
		}
		return null;
	}
	
	// 비밀번호 변경
	public static Boolean 비밀번호변경(String username, String 기존비밀번호, String 새비밀번호) {
		for(Member m:list) {
			if(m.getUsername().equals(username) && 
					m.getPassword().equals(기존비밀번호)) {
				m.setPassword(새비밀번호);
				return true;
			}
				
		}
		return false;
	}
}
