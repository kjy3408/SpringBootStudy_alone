package com.web.KJY.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.KJY.domain.entity.Member;

@Mapper
public interface MemberRepository {

	public int saveMember(Member member);
	public List<Member> getMembers();

	
}
