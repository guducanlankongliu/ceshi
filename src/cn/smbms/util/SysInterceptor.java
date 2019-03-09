package cn.smbms.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.smbms.pojo.User;

public class SysInterceptor extends HandlerInterceptorAdapter {

	//实现拦截功能
	Logger log = Logger.getLogger(SysInterceptor.class);
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response
			,Object handler) throws Exception{
		//从request作用域拿取用户Constants.User
		//如果这个用户不为空，说明已经进行登陆过了，可以进行访问其他内容，否则跳转到登陆页面
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("User");
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/jsp/error.jsp");
			return false;
		}
		return true;
	}
}
