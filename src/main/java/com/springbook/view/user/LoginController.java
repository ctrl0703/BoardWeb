package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping("/login.do")
	public String login(UserVO vo) {
		System.out.println("로그인 처리");
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);

		if(user != null) {
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}
	}
}
