package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author tallon
 * @version v1.0.0
 */
@RestController
public class TestController {

    private final static Logger LOGGER = Logger.getLogger("LOAN-TEST");
    @GetMapping("/test")
    public String test() {
        LOGGER.info("test log");
        return "hello";
    }
}
