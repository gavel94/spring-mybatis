package com.xy.study.controller;

import com.xy.study.core.JsonResponse;
import com.xy.study.core.JsonResponseTool;
import com.xy.study.orm.pojo.UserInfo;
import com.xy.study.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jhhuang on 17-1-11
 * QQ:781913268
 * Description：UserController
 */
@RestController()
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public JsonResponse info(@RequestParam int id) throws Exception
    {
        UserInfo userInfo = userService.findUserById(id);
        System.out.print(userInfo.getUserName());
        return JsonResponseTool.success(userInfo);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public JsonResponse save(UserInfo userInfo) throws Exception
    {
        userService.insertUser(userInfo);
        return JsonResponseTool.success(null);
    }
}
