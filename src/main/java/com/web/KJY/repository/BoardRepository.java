package com.web.KJY.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {

	public String registeBoard();
	public String registeMember(String username);
}
