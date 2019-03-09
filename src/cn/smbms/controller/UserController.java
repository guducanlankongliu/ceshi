package cn.smbms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/login.html")
	public String login(@RequestParam("userCode")String userName,
			@RequestParam("userPassword")String password,Model model,HttpSession session){
		User user = userService.getUserByCode(userName);
		if (user.getUserPassword().equals(password)) {
			model.addAttribute("message","登陆成功");
			session.setAttribute("User", user);
			return "redirect:/user/sys/main.html";
		}
		model.addAttribute("message","登陆失败");
		return "login";
	}
	
	@RequestMapping("/sys/main.html")
	public String doLogin(){
		return "frame";
	}
	
	
}
