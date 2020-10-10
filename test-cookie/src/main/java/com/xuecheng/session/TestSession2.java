package com.xuecheng.session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class TestSession2 {

    @RequestMapping("/testSession2")
    public void testsesion(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        String msg = (String) session.getAttribute("msg");
        String user = (String) session.getAttribute("user");
        resp.getWriter().write(msg+"==="+user);
        //org.apache.catalina.session.StandardSessionFacade@4baf399e
        //org.apache.catalina.session.StandardSessionFacade@419c80c9
    }


}
