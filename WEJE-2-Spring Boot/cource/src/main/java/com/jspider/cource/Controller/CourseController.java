package com.jspider.cource.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.cource.enitity.Cource;
import com.jspider.cource.responce.CourceResponce;
import com.jspider.cource.services.CourcesServices;

@Controller
public class CourseController {
	
	@Autowired
	CourcesServices services;
	
	
	@PostMapping("/add")
	public ResponseEntity<CourceResponce> addCources(@RequestBody Cource cource){
		Cource cource1 = services.addCources(cource);
		if(cource1!=null) {
			return new ResponseEntity<CourceResponce>(new CourceResponce("Ok", " Cource Successfully added.!! ", cource1, null), HttpStatus.OK);
		}
		
		return new ResponseEntity<CourceResponce>(new CourceResponce("Not Found", " Cource Not added.!! ", cource1, null), HttpStatus.BAD_REQUEST);
			
	}
	@GetMapping("getAll")
	public ResponseEntity<CourceResponce> getCources(){
		List<Cource> listCources = services.getCources();
		if(listCources!=null) {
			return new ResponseEntity<CourceResponce>(new CourceResponce("Ok", " Cource Successfully Founded.!! ", null, listCources), HttpStatus.OK);
		}
		return new ResponseEntity<CourceResponce>(new CourceResponce("Not Found", " Cource Not Found.!! ", null, listCources), HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("getById")
	public ResponseEntity<CourceResponce> getById(@RequestParam int id){
		Cource cource = services.getById(id);
		if(cource!=null) {
			return new ResponseEntity<CourceResponce>(new CourceResponce("Ok", " Cource Successfully Founded.!! ", cource, null), HttpStatus.OK);
		}
		return new ResponseEntity<CourceResponce>(new CourceResponce("Not Found", " Cource Not Found.!! ", cource, null), HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("deleteById")
	public ResponseEntity<CourceResponce> deleteById(@RequestParam int id){
		Cource cource = services.deleteById(id);
		if(cource!=null) {
			return new ResponseEntity<CourceResponce>(new CourceResponce("Ok", " Cource Successfully Deleted.!! ", cource, null), HttpStatus.OK);
		}
		return new ResponseEntity<CourceResponce>(new CourceResponce("Not Found", " Cource Not Found.!! ", cource, null), HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/updateById")
	public ResponseEntity<CourceResponce> updateById(@RequestBody Cource cource){
		Cource cource1 = services.updateById(cource);
		if(cource1!=null) {
			return new ResponseEntity<CourceResponce>(new CourceResponce("Ok", " Cource Successfully Updated.!! ", cource1, null), HttpStatus.OK);
		}
		
		return new ResponseEntity<CourceResponce>(new CourceResponce("Not Found", " Cource Not added.!! ", cource1, null), HttpStatus.BAD_REQUEST);
			
	}
	
	@GetMapping("getByName")
	public ResponseEntity<CourceResponce> getByName(@RequestParam String name){
		Cource cource = services.getByName(name);
		if(cource!=null) {
			return new ResponseEntity<CourceResponce>(new CourceResponce("Ok", " Cource Successfully Founded.!! ", cource, null), HttpStatus.OK);
		}
		return new ResponseEntity<CourceResponce>(new CourceResponce("Not Found", " Cource Not Found.!! ", cource, null), HttpStatus.BAD_REQUEST);
	}

}
