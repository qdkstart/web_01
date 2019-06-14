package com.qdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 邱德凯
 * @version V1.0
 * @Package com.qdk.controller
 * @date 2019/6/12 11:21
 * @Copyright ©   北京联合盈鑫信息技术（北京）有限公司
 */
@Controller
@RequestMapping("login")
public class LoginController {


    @RequestMapping("toView")
    public String toView(String name){


        return  name;
    }





}
