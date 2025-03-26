package com.kh.spring.api.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring.api.model.service.SafetyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(produces="application/json; charset=UTF-8")
public class ApiSafetyController {
	
	private final SafetyService safetyService;
	
	@GetMapping(value = "hospitals")
	public String requestHospitalApi() throws IOException {
		return safetyService.requestHospitalApi();
	}
	
	@GetMapping(value="message")
	public String requestMessage(@RequestParam(name="pageNo") int pageNo) {
		return safetyService.requestMessage(pageNo);
	}

}
