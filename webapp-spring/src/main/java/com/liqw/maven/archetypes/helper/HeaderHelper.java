package com.liqw.maven.archetypes.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created by liqw on 2017/10/13.
 */
public class HeaderHelper {
    static Logger logger = LoggerFactory.getLogger(HeaderHelper.class);

    public static void setTextHead(HttpServletResponse response) {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
    }

    //设置下载的Header
    public static void setDownloadHead(HttpServletResponse response, byte[] bytes, String fileName) {
        response.setContentType("application/octet-stream");
        response.setContentLength(bytes.length);
        response.addHeader("Content-Disposition", "attachment; filename=" + fileName);
    }

    public static boolean isLinux(HttpServletRequest request) {
        String header = request.getHeader("User-Agent");
        return header != null && header.contains("Linux");
    }

    public static boolean isWindows(HttpServletRequest request) {
        String header = request.getHeader("User-Agent");
        return header != null && header.contains("Windows");
    }

    public static boolean isWechat(HttpServletRequest request) {
        String header = request.getHeader("User-Agent");
        return header != null && header.contains("MicroMessenger");
    }

    public static boolean isAlipay(HttpServletRequest request) {
        String header = request.getHeader("User-Agent");
        return header != null && header.contains("AlipayClient");
    }

    //判断是android和windows 还是其他
    public static boolean canDownload(HttpServletRequest request) {
        boolean windows = isWindows(request);
        boolean linux = isLinux(request);
        if (windows || linux) {
            return true;
        }
        return false;
    }

    public static void printHeader(HttpServletRequest request) {
        Enumeration headerNames = request.getHeaderNames();
        logger.debug("===================================================================");
        while (headerNames.hasMoreElements()) {
            String name = (String) headerNames.nextElement();
            logger.debug(name + ":" + request.getHeader(name));
        }
        logger.debug("===================================================================");


    }
}
