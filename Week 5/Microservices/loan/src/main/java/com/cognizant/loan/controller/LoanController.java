package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanController {
    @GetMapping("/{number}")
    public LoanDTO getLoanByNumber(@PathVariable String number) {
        LoanDTO loan = new LoanDTO();
        loan.setNumber(number);
        loan.setType("car");
        loan.setLoan(400000);
        loan.setEmi(3258);
        loan.setTenure(18);

        return loan;
    }
}
