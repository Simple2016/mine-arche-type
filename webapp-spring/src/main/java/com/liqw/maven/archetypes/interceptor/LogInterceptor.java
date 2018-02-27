package com.liqw.maven.archetypes.interceptor;

import com.liqw.maven.archetypes.helper.HeaderHelper;
import com.liqw.maven.archetypes.helper.LogHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liqw on 2017/12/21.
 */
public class LogInterceptor implements HandlerInterceptor {
    Logger logger = LoggerFactory.getLogger(HandlerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) {
        logger.debug("=======preHandle===========");
        HeaderHelper.printHeader(httpServletRequest);
        LogHelper.logRequestParam(httpServletRequest, logger, "LogInterceptor-preHandle");

        String servletPath = httpServletRequest.getServletPath();
        logger.debug("servletPath：" + servletPath);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        //logger.debug("=======postHandle===========");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //logger.debug("=======afterCompletion===========");
    }
}