package com.liqw.maven.archetypes.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liqw on 2017/11/9.
 */
@Controller
@RequestMapping("/")
public class MainController {
    final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @ResponseBody()
    @RequestMapping(value = "test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String index() {
        LOGGER.info("index");
        return "hello world！你好";
    }
}
