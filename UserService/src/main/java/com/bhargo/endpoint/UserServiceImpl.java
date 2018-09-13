package com.bhargo.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by bhargo on 13/9/18.
 */
@RestController
@RequestMapping("/user")
public class UserServiceImpl {

    @RequestMapping("/setup")
    public String setUp() {
        return "done";
    }
}
