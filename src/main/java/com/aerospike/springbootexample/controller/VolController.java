package com.aerospike.springbootexample.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aerospike.springbootexample.model.Vol;
import com.aerospike.springbootexample.service.VolService;

@RestController
@RequestMapping("/api/vols")
public class VolController {
	@Autowired
	private VolService volService;
    private int gt;//compteur
	@RequestMapping(value = "/allVols", method = RequestMethod.GET)
	public List<Vol> getAllBikes() {
 
		return (List<Vol>) volService.listAllVols();
	}
 
	@RequestMapping(value = "/getVol/{Id}", method = RequestMethod.GET)
	public Vol getVol(@PathVariable("Id") Integer Id) {
		return volService.getVolById(Id);
	}
 
	@RequestMapping(value = "/createVol", method = RequestMethod.POST)
	public Vol createVol(@RequestBody Vol vol) {
		vol.setId(100);
		return volService.saveVol(vol);
	}
 
	@RequestMapping(value = "/updateVol/{Id}", method = RequestMethod.POST)
	public Vol updateVol(@RequestBody Vol vol,@PathVariable("Id") Integer Id) {
	
		return volService.saveVol(vol);
	}
	
	@RequestMapping(value = "/deleteVol/{Id}", method = RequestMethod.GET)
	public void deleteVol(@PathVariable("Id") Integer Id) {
		volService.deleteVol(Id);
	}
}
