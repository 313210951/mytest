package org.mytest.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhuxiaomeng
 * @date 2017/12/4.
 * @email 154040976@qq.com
 * 登录、退出页面
 */
@Controller
@Slf4j
public class LoginController {

   // @Autowired
   // private SysUserService userService;

    @GetMapping(value = "/login")
    public String loginCheck() {
    	log.info("测试");
        return "/login";
    }
}
