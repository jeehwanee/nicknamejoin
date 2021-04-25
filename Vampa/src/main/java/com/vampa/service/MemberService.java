package com.vampa.service;

import com.vampa.model.MemberVO;

public interface MemberService { //이 함수를 쓸 거다 정의하고, lmpl에서 사용하겠다
	
	//회원가입
	public void memberJoin(MemberVO member) throws Exception;
	
	//아이디 중복성 검사
	public int idCheck(String memberId) throws Exception;
	
	//닉네임 중복성 검사
	public int nickCheck(String memberNick) throws Exception;
	
	//이메일 중복성 검사
	public int mailCheck(String memberMail) throws Exception;
	
	//로그인  - 안 돼서 주석 처리 해둠@@
	//public MemberVO memberLogin(MemberVO member) throws Exception;
}
