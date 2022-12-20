package com.tx.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tx.user.domain.User;
import org.springframework.stereotype.Component;

/**
* @author 27873
* @description 针对表【user】的数据库操作Service
* @createDate 2022-12-20 19:21:14
*/
@Component
public interface UserService extends IService<User> {

}
