package com.wipro.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.sb.healthMonitor.CustomHealthMonitor;


@Controller
public class BankController {
	
	@Autowired
	CustomHealthMonitor customHealthMonitor;
	
	@GetMapping("/bankBranch")
	public String getBankName() {
		return "bankBranch";
	}

	@GetMapping("/bankBranchService")
	public String getBankAddress() {
		return "bankBranchService";
	}
	
	@PostMapping("/bringApplicationUp")
	@ResponseBody
	public String bringApplicationUp() {
		return customHealthMonitor.bringApplicationUp();
	}

	@PostMapping("/bringApplicationDown")
	@ResponseBody
	public String bringApplicationDown() {
		return customHealthMonitor.bringApplicationDown();
	}

}
