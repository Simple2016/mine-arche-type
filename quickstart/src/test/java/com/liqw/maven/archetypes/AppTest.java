package com.liqw.maven.archetypes;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    @BeforeClass
    public static void beforeClass() {
        LOGGER.info("beforeClass");
    }

    @Before
    public void before() {
        LOGGER.info("before");
    }

    @Test
    public void test() {
        LOGGER.info("test");
    }

}
