package com.benym.concurrentregister.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.benym.concurrentregister.domain.UserDO;
import com.benym.concurrentregister.mapper.RUserMapper;
import com.benym.concurrentregister.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Time : 2022/4/23 17:32
 */
@Service
public class UserServiceImpl extends ServiceImpl<RUserMapper, UserDO> implements UserService {

}
