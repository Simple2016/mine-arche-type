package com.liqw.maven.archetypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liqw on 2017/11/9.
 */
@Controller
@RequestMapping("/")
public class MainController {
    final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public void index() {
        LOGGER.info("index");
    }
}
