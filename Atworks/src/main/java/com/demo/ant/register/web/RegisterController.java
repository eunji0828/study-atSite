package com.demo.ant.register.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.ant.register.service.RegisterService;
import com.demo.ant.register.vo.RegisterVO;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;

	private static final Logger log = LoggerFactory.getLogger(RegisterController.class);
	
	@GetMapping(value="/onLoad")
	public ModelAndView register() throws Exception {
		ModelAndView mv = new ModelAndView();
		log.info("registerController ###");
		mv.setViewName("/register/register");
		return mv;
	}
	
	// ���̵� �ߺ� üũ
	@ResponseBody
	@PostMapping(value="/idCheck")
	public int idCheck(String userId) throws Exception {
		int idResult = 	registerService.idCheck(userId);
		return idResult;
	}
	
	
	// �г��� �ߺ� üũ 
	@ResponseBody
	@PostMapping(value="/nickCheck")
	public int nickCheck(String userNick) throws Exception {
		int nickResult = registerService.nickCheck(userNick);
		return nickResult;
	}
	
	// ȸ������ ���� db ����
		@PostMapping(value="/signUp")
		public ModelAndView signUpt(RegisterVO registerVo, String userId, String userNick) throws Exception{
			
			ModelAndView mv = new ModelAndView();
			
			int idResult = registerService.idCheck(userId);
			int nickResult = registerService.nickCheck(userNick);
			
			try {
				if(idResult == 1 || nickResult == 1) {
					
					
				} else if(idResult == 0 && nickResult == 0) {
					registerService.signUpInsert(registerVo);
					mv.setViewName("/login/login");
					log.info("signUp = " + registerVo);
				}
			} catch (Exception e) {
				throw new RuntimeException();
			}
			
			
			return mv;
		}
	
	
}
