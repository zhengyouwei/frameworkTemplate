package com.zyw.controller;

import com.zyw.common.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 给第三方调用的接口类
 */
@RestController
public class thirdPartyController {
    @Autowired
    Person per;

    @RequestMapping("/getPerson")
    public String getPerson(){
        return per.toString();
    }

}
