package com.liqw.maven.archetypes.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class XssFilter implements Filter {
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        String url=((HttpServletRequest) request).getRequestURL().toString()  ;
// 针对特定服务设置编码
//        if(url.contains("/gateway")){
//            request.setCharacterEncoding("GBK");
//            response.setCharacterEncoding("GBK");
//        }else{
//            request.setCharacterEncoding("UTF-8");
//            response.setCharacterEncoding("UTF-8");
//        }
        chain.doFilter(new XssHttpServletRequestWrapper((HttpServletRequest) request), response);
    }

    @Override
    public void destroy() {
    }
    
   
}

