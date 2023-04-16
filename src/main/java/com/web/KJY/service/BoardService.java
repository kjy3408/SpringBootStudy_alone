package com.web.KJY.service;

import java.util.List;

import com.web.KJY.dto.request.BoardRequestDto;
import com.web.KJY.dto.response.BoardResponseDto;

public interface BoardService {

	public void registeBoard(BoardRequestDto boardRequestDto);
	
	public List<BoardResponseDto> getBoard(String username);
}
