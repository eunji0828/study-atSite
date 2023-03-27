package com.demo.ant.login.web;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.ant.login.dao.LoginMapperDao;
import com.demo.ant.login.service.LoginService;
import com.demo.ant.register.vo.RegisterVO;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;

@Controller
@RequestMapping("/login")
public class LoginController {

	
	@Autowired
	LoginService loginService;
	
	@Autowired
	LoginMapperDao loginDao;
	
	private static final Logger Log = LoggerFactory.getLogger(LoginController.class);
	
	@GetMapping(value="/login")
	public ModelAndView login() throws Exception{
		
		ModelAndView mv = new ModelAndView();
		Log.info("LoginController ###");
		mv.setViewName("/login/login");
		return mv;
		
	}
	
	// 로그인
	@PostMapping(value="/signIn")
	public ModelAndView signIn(RegisterVO registerVo, HttpSession session, HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		RegisterVO loginInfo = loginDao.signInSelect(registerVo);
		Log.info("signIn = " + registerVo);
		
		
		// 로그인 정보 일치하는 경우
		if(loginInfo != null) {
			System.out.println(loginInfo);
			
			session.setAttribute("userId", loginInfo.getUserId());
			session.setAttribute("userNick", loginInfo.getUserNick());
			session.setAttribute("userNm", loginInfo.getUserNm());
			session.setAttribute("userNo", loginInfo.getUserNo());
			Log.info("signIn2 = " + registerVo);
		
			mv.addObject("userId", session.getAttribute("userId"));
			mv.addObject("userNick", session.getAttribute("userNick"));
			mv.addObject("userNm", session.getAttribute("userNm"));
			
//			mv.addObject("user1", loginInfo.getUserId());
//			mv.addObject("user2", loginInfo.getUserNick());
//			mv.addObject("user3", loginInfo.getUserNm());
			mv.setViewName("/main/main");
			
			session.setMaxInactiveInterval(1800);	// 세션 유효시간
			
		} else if(loginInfo == null) {   // 로그인 정보 불일치할 경우
			
			mv.setViewName("/login/login");
		}
		
		return mv;
	}
	
	// 로그아웃
	@GetMapping(value="/logout")
	public String login(HttpSession session) {
		if(session.getAttribute("userId") != null || session.getAttribute("userId") != "") {
			session.invalidate();
		}
		return "/main/main";
	}
}
