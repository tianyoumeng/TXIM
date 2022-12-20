package com.tx.user.mapper;

import com.tx.user.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 27873
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-12-20 19:21:14
* @Entity com.tx.user.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




