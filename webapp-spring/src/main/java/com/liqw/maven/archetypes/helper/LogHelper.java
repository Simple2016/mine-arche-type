package com.liqw.maven.archetypes.helper;

import org.slf4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

public class LogHelper {
    /**
     * 打印http请求的参数
     *
     * @param request  HttpServletRequest
     * @param logger   slf4j 的logger
     * @param describe 说明
     */
    public static void logRequestParam(HttpServletRequest request, Logger logger, String describe) {
        StringBuffer sb = new StringBuffer();
        Map<String, String[]> params = request.getParameterMap();
        for (String key : params.keySet()) {
            sb.append("[");
            sb.append(key);
            sb.append("=");
            sb.append(request.getParameter(key));
            sb.append("]");
        }
        logger.info("{}=>{}", describe, sb.toString());
    }
}
