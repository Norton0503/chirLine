package com.chirline.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @desc 用户信息操作Controller
 *
 * @author guanwanli
 *
 * @date 2017年8月26日 下午2:54:43
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserinfoController {
    /**
     * 用户登录
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/login")
    public ModelAndView userLogin(ModelAndView modelAndView,HttpServletRequest request,HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("开始执行登录操作," + "用户名：" + username + ",密码：" + password);
        String login_result = "";
        if("xiaojiang".equals(username) && "123456".equals(password)){
            login_result = "登录成功";
        }else{
            login_result = "登录失败";
        }
        modelAndView.addObject("login_result", login_result);
        modelAndView.setViewName("forward:/WEB-INF/pages/result.jsp");
        return modelAndView;
    }
}
