package com.benym.concurrentregister.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.benym.concurrentregister.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Time : 2022/4/23 17:24
 */
@Mapper
public interface RUserMapper extends BaseMapper<UserDO> {
}
