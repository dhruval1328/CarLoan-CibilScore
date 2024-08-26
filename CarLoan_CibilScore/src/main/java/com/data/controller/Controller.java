package com.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.CibilData;
import com.data.serviceI.CibilServiceI;

@RestController
public class Controller {
	
	@Autowired
	CibilServiceI si;
	
	@GetMapping("/cibil")
	public ResponseEntity<CibilData> cibilcheck(){
		
		CibilData c = si.check();
		ResponseEntity<CibilData> d = new ResponseEntity<CibilData>(c, HttpStatus.OK);
		return d;
	}
}
