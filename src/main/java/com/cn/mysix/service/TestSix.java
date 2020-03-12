package com.cn.mysix.service;

import com.cn.mysix.bean.SysUser;
import com.cn.mysix.dao.TestSixDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestSix
 * @Description TestSix
 * @Author wub
 * @Date 2020/3/9 18:04
 * @Version 1.0
 */

@Service
public class TestSix {

    @Autowired
    private TestSixDao testSixDao;

    public List<SysUser> selectall(Integer count) {

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

    public int delete(Integer countid) {
        if (countid != null) {
            return testSixDao.delete(countid);
        }
        return 0;
    }
}
