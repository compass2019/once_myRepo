package com.xuecheng.session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class TestSession {

    @RequestMapping("/testSession")
    public void testSession(HttpServletRequest req, HttpServletResponse resp){

        HttpSession session = req.getSession();
        session.setAttribute("msg","abc");
        session.setAttribute("user","123");
        Cookie cookie = new Cookie("JSESSIONID",session.getId());
        cookie.setMaxAge(600);
        resp.addCookie(cookie);

    }
}
