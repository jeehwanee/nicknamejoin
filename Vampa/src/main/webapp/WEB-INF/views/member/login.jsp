<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jquery를 사용하기 위한 url -->
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script> 
<!-- jquery를 사용하기 위한 url 끝 -->
<link rel="stylesheet" href="/resources/css/member/login.css">
</head>
<body>

<div class="wrapper">
	
	<div class="wrap">
		<form id="login_form" method="post">
			<div class="logo_wrap">
				<span>Book Mall</span>
			</div>
			<div class="login_wrap"> 
				<div class="id_wrap">
						<div class="id_input_box">
						<input class="id_input" name="memberId">
					</div>
				</div>
				<div class="pw_wrap">
					<div class="pw_input_box">
						<input class="pw_iput" name="memberPw">
					</div>
				</div>

				<div class="login_button_wrap">
					<input type="button" class="login_button" value="로그인">
				</div>			
			</div>
			
		</form>
	</div>

</div>

<script>
    
    <!-- 르그인 구현 안돼서 주석 처리 해둠~~ 
    /* 로그인 버튼 클릭 메서드 */
    $(".login_button").click(function(){
    	
    	if(${result == 0}){
    		alert("ㅇㅇㅇ");
    	}
        /* 로그인 메서드 서버 요청 */
        $("#login_form").attr("action", "/member/login");
        $("#login_form").submit();
    }); 주석 끝@@-->

 
    
</script>
</body>
</html>