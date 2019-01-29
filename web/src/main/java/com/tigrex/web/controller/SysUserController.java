package com.tigrex.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tigrex.admin.entity.SysUser;
import com.tigrex.admin.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Reference(version = "1.0.0")
    private SysUserService sysUserService;

    @RequestMapping(value = "getSysUserInfo")
    public SysUser getSysUserInfo(){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("id", 1);
        SysUser sysUser = sysUserService.getOne(wrapper);
        return sysUser;
    }

}
