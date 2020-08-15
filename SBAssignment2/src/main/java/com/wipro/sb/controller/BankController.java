package com.wipro.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BankController {

	
	@GetMapping("/bankBranch")
	public String getBankName() {
		return "bankBranch";
	}

	@GetMapping("/bankBranchService")
	public String getBankAddress() {
		return "bankBranchService";
	}
}
