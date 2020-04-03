package in.tp.swmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.tp.swmd.model.Loan;
import in.tp.swmd.service.LoanServiceImp;

@Controller
public class LoanController {
	@Autowired
	LoanServiceImp loanservice;

	@GetMapping("/loan")
	public String showLoanPage() {
		return "loanpage";
	}

	@PostMapping("/loan")
	public ModelAndView showLoanPageWithInterest(@ModelAttribute Loan loan) {
		loanservice.computeInterest(loan);
		return new ModelAndView("loanpage","loan",loan);
	}
	
}