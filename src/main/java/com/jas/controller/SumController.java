package com.jas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jas.model.InputNumbersFloat;
import com.jas.model.InputNumbersInt;
import com.jas.model.OutputNumberFloat;
import com.jas.model.OutputNumberInt;
import com.jas.service.SumService;

@RestController()
public class SumController {

	@Autowired
	SumService sumService;

	@PostMapping(value = "/sum", params = { "int" })
	public OutputNumberInt getSumFloat(@RequestBody InputNumbersInt input) {
		return sumService.getSum(input);
	}

	@PostMapping(value = "/sum", params = { "float" })
	public OutputNumberFloat getSumFloat(@RequestBody InputNumbersFloat input) {
		return sumService.getSum(input);
	}

}
