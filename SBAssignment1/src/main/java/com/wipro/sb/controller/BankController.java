package com.wipro.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/bankName")
	public String getBankName() {
		return "Bank of America";
	}

	@GetMapping("/bankAddress")
	public String getBankAddress() {
		return "Bank of America<BR>2625 Piedmont Rd NE<BR>Atlanta 30324, GA";
	}

}
