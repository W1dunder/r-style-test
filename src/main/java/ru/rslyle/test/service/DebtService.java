package ru.rslyle.test.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ru.rslyle.test.model.DebtModel;
import ru.rslyle.test.util.Calculator;


@Service
public class DebtService {

	
	public List<DebtModel> getPayments(double sum, int monts, double percent) {
		List<DebtModel> result = new ArrayList<>(monts);
		
		Calculator calculator = new Calculator(sum, monts, percent);
		
		LocalDate date = LocalDate.now().plusMonths(1);
		
		for (int i = 1; i <= monts; i++) {
			
			double s = calculator.calculateS();
			
			calculator.pay(s);
			
			result.add(new DebtModel(i, date.getMonthValue() + "/" + date.getYear(), s, calculator.calculatePn(), calculator.getSn(), calculator.getX()));
			
			date = date.plusMonths(1);
		}
		return result;
	}
}
