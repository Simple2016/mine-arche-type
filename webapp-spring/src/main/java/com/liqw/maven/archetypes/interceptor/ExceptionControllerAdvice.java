package com.liqw.maven.archetypes.interceptor;

import com.liqw.maven.archetypes.common.ErrEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionControllerAdvice {
    Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

    /**
     * 全局异常捕捉处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map errorHandler(Exception ex) {
        ex.printStackTrace();
        Map map = new HashMap();
        map.put("code", "-1");
        map.put("message", "系统异常");
        map.put("success", false);
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.OK)
    public Map paramErrHandler(MissingServletRequestParameterException ex) {
        logger.error("请求缺少参数=>" + ex.getParameterName());
        Map map = new HashMap();
        map.put("code", ErrEnum.PARAM_ERR.getCode());
        map.put("message", "缺少参数");
        map.put("success", false);
        return map;
    }


}