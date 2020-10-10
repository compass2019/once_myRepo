package com.xuecheng.cookie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestCookie {
    @RequestMapping("/cookTest")
    public void cookieTest01(HttpServletResponse resp, HttpServletRequest req) throws IOException {

        resp.setContentType("text/html;charset=utf-8");
        //获取cookie
        Cookie[] cookies = req.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                //对cookie，其进行解码
                String decode = URLDecoder.decode(value, "utf-8");


                if ("lasttime".equals(name)) {
                    resp.getWriter().write("<h1>欢迎回来！您上次访问的时间是：" + decode+"</h1>");
                }

                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
                String format = simpleDateFormat.format(date);
                //对cookie,其进行编码
                String curTime = URLEncoder.encode(format, "utf-8");


                Cookie cookie1 = new Cookie("lasttime", curTime);
                resp.addCookie(cookie1);
            }
        } else {

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
            String format = simpleDateFormat.format(date);
            //
            String curTime = URLEncoder.encode(format, "utf-8");
            Cookie cookie = new Cookie("lasttime", curTime);
            cookie.setMaxAge(0);
            resp.addCookie(cookie);

            resp.getWriter().write("欢迎光临！这是你首次访问！");

        }
    }
}
