package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	@GetMapping("/")
	public String home() {
		return "I am in home";
	}
	@GetMapping("/getaccount/{number}")
	public AccountDTO getloan(@PathVariable String number) {
		return new AccountDTO();
	}
}
