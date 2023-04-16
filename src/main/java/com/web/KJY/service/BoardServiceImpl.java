package com.web.KJY.service;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.HashAttributeSet;

import org.springframework.stereotype.Service;

import com.web.KJY.dto.request.BoardRequestDto;
import com.web.KJY.dto.response.BoardResponseDto;
import com.web.KJY.repository.BoardRepository;
import com.web.KJY.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

	private final BoardRepository boardRepository; 
	
	@Override
	public void registeBoard(BoardRequestDto boardRequestDto) {
		
		boardRepository.registeBoard(boardRequestDto.toEntity());
	}
	
	@Override
	public List<BoardResponseDto> getBoard(String username) {
		List<String> parameterList = new ArrayList<>();
		parameterList.add(username);		
		
		List<BoardResponseDto> boardList = new ArrayList<>();
		
		boardRepository.getBoardByMemberName(parameterList).forEach(board ->{
			boardList.add(board.toDto());
		});
		
		
		return boardList;
	}
}
