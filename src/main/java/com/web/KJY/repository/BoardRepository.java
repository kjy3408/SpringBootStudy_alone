package com.web.KJY.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.KJY.domain.entity.Board;

@Mapper
public interface BoardRepository {
	//insert
	public void registeBoard(Board board);//insert는 void
	
	
	//select
	public List<Board> getBoardByMemberName(String memberName);
	public List<Board> getBoardByTitle(String title);
	
	
}
