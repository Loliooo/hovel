package com.oy.demo.serviceImpl;

import com.oy.demo.dao.MemberMapper;
import com.oy.demo.entity.Member;
import com.oy.demo.service.MemberService;

import javax.annotation.Resource;

/**
 * Created by oy on 2017/7/6.
 */
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper dao;
    public String print(int id) {
        Member member = dao.selectByPrimaryKey(id);
        return member.getNickname();
//        return "test";
    }
}
