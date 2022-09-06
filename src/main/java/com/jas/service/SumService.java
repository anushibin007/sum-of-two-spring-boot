package com.jas.service;

import org.springframework.stereotype.Service;

import com.jas.model.InputNumbersFloat;
import com.jas.model.InputNumbersInt;
import com.jas.model.OutputNumberFloat;
import com.jas.model.OutputNumberInt;

@Service
public class SumService {
	public OutputNumberInt getSum(InputNumbersInt input) {
		int sum = input.getNumberOne() + input.getNumberTwo();
		return new OutputNumberInt(sum);
	}
	
	public OutputNumberFloat getSum(InputNumbersFloat input) {
		float sum = input.getNumberOne() + input.getNumberTwo();
		return new OutputNumberFloat(sum);
	}
}
