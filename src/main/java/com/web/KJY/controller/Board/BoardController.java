package com.web.KJY.controller.Board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.KJY.dto.DataResponseDto;
import com.web.KJY.dto.ResponseDto;
import com.web.KJY.dto.request.BoardRequestDto;
import com.web.KJY.service.BoardService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
	
	@PostMapping("/registeboard")
	public ResponseEntity<? extends ResponseDto> registeBoard(@RequestBody BoardRequestDto boardRequestDto){
		
		boardService.registeBoard(boardRequestDto);
		System.out.println(boardRequestDto);
		
		return ResponseEntity.ok().body(DataResponseDto.of(boardRequestDto));
	}
	
	@GetMapping("/search/board")
	public ResponseEntity<? extends ResponseDto> searchByUsername(String username){
		
		boardService.getBoard(username);
		return ResponseEntity.ok().body(DataResponseDto.of(boardService.getBoard(username)));
	}
	
}
