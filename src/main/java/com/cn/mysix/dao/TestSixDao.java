package com.cn.mysix.dao;

import com.cn.mysix.bean.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName TestSixDao
 * @Description TestSixDao
 * @Author wub
 * @Date 2020/3/9 18:08
 * @Version 1.0
 */

public interface TestSixDao {

    List<SysUser> selectAll(@Param("countid") Integer countid);

    int insert(SysUser sysUser);

    int update(SysUser sysUser);

    int delete(Integer countid);
}
