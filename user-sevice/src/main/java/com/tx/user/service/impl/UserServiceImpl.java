package com.tx.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tx.user.domain.User;
import com.tx.user.service.UserService;
import com.tx.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 27873
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-12-20 19:21:14
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




