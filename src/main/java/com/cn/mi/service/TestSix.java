package com.cn.mi.service;

import com.cn.mi.bean.SysUser;
import com.cn.mi.dao.TestSixDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wub
 * @version 1.0
 */

@Service
public class TestSix {

    @Resource
    private TestSixDao testSixDao;

    public List<SysUser> selectAll(Integer count) {

        return testSixDao.selectAll(count);

    }

    public int insert(SysUser sysUser) {
        if (sysUser.getUser() != null) {
            return testSixDao.insert(sysUser);
        }
        return 0;
    }


    public int update(SysUser sysUser) {
        if (sysUser.getCount() != null) {
            return testSixDao.update(sysUser);
        }
        return 0;
    }

    public int delete(Integer countId) {
        if (countId != null) {
            return testSixDao.delete(countId);
        }
        return 0;
    }
}
