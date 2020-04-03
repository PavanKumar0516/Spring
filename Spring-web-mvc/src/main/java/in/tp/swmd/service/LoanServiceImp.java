package in.tp.swmd.service;

import org.springframework.stereotype.Service;

import in.tp.swmd.model.Loan;



@Service
public class LoanServiceImp implements ILoanService {
    
	public void computeInterest(Loan loan) {
		if(loan!=null) {
			loan.setInterest((loan.getPrincipal()*loan.getTime()*loan.getRate())/100);
		}
		
	}
    

}
