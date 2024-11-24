package com.zhou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import java.io.PrintWriter;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username == null) { // 用户未登录
            // 设置响应的内容类型和字符编码
            response.setContentType("text/plain;charset=UTF-8");
            response.setStatus(HttpServletResponse.SC_FORBIDDEN); // 设置HTTP状态码为403

            // 输出提示信息
            PrintWriter writer = response.getWriter();
            writer.write("还未登录");
            writer.flush();
            return false; // 阻止请求继续处理
        }

        return true; // 已登录，继续处理请求
    }
}


