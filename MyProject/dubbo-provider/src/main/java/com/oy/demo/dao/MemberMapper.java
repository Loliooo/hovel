package com.oy.demo.dao;

import com.oy.demo.entity.Member;

/**
 * Created by oy on 2017/7/6.
 */
public interface MemberMapper {
    int deleteByPrimaryKey(Integer memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberid);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}
