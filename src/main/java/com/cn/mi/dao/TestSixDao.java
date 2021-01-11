package com.cn.mi.dao;

import com.cn.mi.bean.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wub
 *
 * @version 1.0
 */

public interface TestSixDao {

    List<SysUser> selectAll(@Param("countId") Integer countId);

    int insert(SysUser sysUser);

    int update(SysUser sysUser);

    int delete(Integer countId);
}
