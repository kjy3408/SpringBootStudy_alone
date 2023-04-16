package com.web.KJY.controller.Member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.KJY.domain.entity.Member;
import com.web.KJY.dto.DataResponseDto;
import com.web.KJY.dto.ResponseDto;
import com.web.KJY.dto.request.MemberRequestDto;
import com.web.KJY.service.MemberService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class MemberController {

	private final MemberService memberService;
	
	@PostMapping("/member")
	public ResponseEntity<? extends ResponseDto> saveMember(@RequestBody MemberRequestDto memberRequestDto){
		
		memberService.saveMember(memberRequestDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}

	@GetMapping("/members")
	public ResponseEntity<? extends ResponseDto> getMembers() {
		
		return ResponseEntity.ok().body(DataResponseDto.of(memberService.getMembers()));
	}
	
}
