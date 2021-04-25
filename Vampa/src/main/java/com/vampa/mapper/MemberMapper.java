package com.vampa.mapper;

import com.vampa.model.MemberVO;

public interface MemberMapper {
	
	//회원가입 - insert쿼리를 실행시켜 줄 메소드
	public void memberJoin(MemberVO member); //MemberVO 객체를 member로 생성 (MemberVO를 파라미터로 사용)
	
	//아이디 중복성 검사 - select쿼리를 실행시켜 줄 메소드
	public int idCheck(String memberId);
	
	//닉네임 중복성 검사
	public int nickCheck(String memberNick);
	
	//이메일 중복성 검사
	public int mailCheck(String memberMail);
	
	//로그인 안돼서 주석처리 해둠@@
	//public MemberVO memberLogin(MemberVO member); //MemberVO를 파라미터로 사용
}
