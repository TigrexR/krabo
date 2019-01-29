package com.tigrex.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tigrex.admin.entity.SysUser;
import com.tigrex.admin.service.SysUserService;

@Service(version = "1.0.0", interfaceClass = SysUserService.class)
public class SysUserServiceImpl extends ServiceImpl<BaseMapper<SysUser>, SysUser> implements SysUserService {
}
