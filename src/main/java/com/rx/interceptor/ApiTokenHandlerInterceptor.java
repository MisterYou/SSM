package com.rx.interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * token验证拦截器，拦截用户访问的userapi接口
 *
 */
public class ApiTokenHandlerInterceptor extends HandlerInterceptorAdapter {
//	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

}
