package com.vampa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //BookController 클래스가 "컨트롤러 역할"을 한다고 스프링에게 선언하는 역할.
public class BookController {
	private static final Logger logger = LoggerFactory.getLogger(BookController.class); //로그 기록을 남기기 위해 Logger 클래스인 logger변수 선언
	/*
	 * 메인 페이지 이동 메소드
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void mainPageGET() { //main.jsp에 접속이 가능하도록 mainPageGET() 메소드 추가하여 @RequestMapping을 통해 url 경로 설정
		logger.info("메인 페이지 진입");
	}

}
