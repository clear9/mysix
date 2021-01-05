package com.cn.mysix.dao;

import com.cn.mysix.bean.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wub
 *
 * @version 1.0
 */

public interface TestSixDao {

    List<SysUser> selectAll(@Param("countid") Integer countid);

    int insert(SysUser sysUser);

    int update(SysUser sysUser);

    int delete(Integer countId);
}
