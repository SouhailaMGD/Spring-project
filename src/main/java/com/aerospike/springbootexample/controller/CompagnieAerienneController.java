package com.aerospike.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aerospike.springbootexample.model.CompagnieAerienne;
import com.aerospike.springbootexample.service.CompagnieAerienneService;

@RestController
@RequestMapping("/api/compagnieaeriennes")
public class CompagnieAerienneController {
	
	
	@Autowired
	private CompagnieAerienneService compagnieaerienneService;
 
	@RequestMapping(value = "/allcompagnieaeriennes", method = RequestMethod.GET)
	public List<CompagnieAerienne> getAllcompagnieaeriennes() {
 
		return (List<CompagnieAerienne>) compagnieaerienneService.listAllCompagnieAeriennes();
	}
 
	@RequestMapping(value = "/getcompagnieaerienne/{Id}", method = RequestMethod.GET)
	public CompagnieAerienne getcompagnieaerienne(@PathVariable("Id") Integer Id) {
		return compagnieaerienneService.getCompagnieAerienneById(Id);
	}
 
	@RequestMapping(value = "/createcompagnieaerienne", method = RequestMethod.POST)
	public CompagnieAerienne createcompagnieaerienne(@RequestBody CompagnieAerienne compagnieaerienne) {
		compagnieaerienne.setId(200);
		return compagnieaerienneService.saveCompagnieAerienne(compagnieaerienne);
	}
 
	@RequestMapping(value = "/updatecompagnieaerienne/{Id}", method = RequestMethod.POST)
	public CompagnieAerienne updatecompagnieaerienne(@RequestBody CompagnieAerienne compagnieaerienne,@PathVariable("Id") Integer Id) {
		return compagnieaerienneService.saveCompagnieAerienne(compagnieaerienne);
	}
	
	@RequestMapping(value = "/deletecompagnieaerienne/{Id}", method = RequestMethod.GET)
	public void deletecompagnieaerienne(@PathVariable("Id") Integer Id) {
		compagnieaerienneService.deleteCompagnieAerienne(Id);
	}
}
