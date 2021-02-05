package com.example.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.server.pojo.User;
import org.mapstruct.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tiny
 * @since 2021-02-05
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
