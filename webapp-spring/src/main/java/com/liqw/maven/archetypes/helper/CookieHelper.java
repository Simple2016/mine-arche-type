package com.liqw.maven.archetypes.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liqw on 2017/12/21.
 */
public class CookieHelper {
    public static final int EXPIRY = 30 * 24 * 60 * 60;
    public static final String IDENTITY = "identity";
    static Logger logger = LoggerFactory.getLogger(CookieHelper.class);

    public static void removeCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie(IDENTITY, null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }


    public static Cookie getCookie(HttpServletRequest httpServletRequest, String name) {
        Assert.notNull(name, "cookie名为空");
        Cookie[] cookies = httpServletRequest.getCookies();

        int i = -1;
        if (cookies != null && cookies.length != 0) {
            for (int j = 0; j < cookies.length; j++) {
                Cookie cookie = cookies[j];
                logger.debug("cookieName:{},cookieValue:{}", cookie.getName(), cookie.getValue());
                if (name.equals(cookie.getName())) {
                    i = j;
                    break;
                }
            }
        }

        if (i >= 0) {
            return cookies[i];
        }
        return null;
    }
}
