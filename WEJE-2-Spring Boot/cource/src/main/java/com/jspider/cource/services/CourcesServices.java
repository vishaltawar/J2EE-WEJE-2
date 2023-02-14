package com.jspider.cource.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.cource.enitity.Cource;
import com.jspider.cource.repository.CourceRepository;

@Service
public class CourcesServices {

	@Autowired
	CourceRepository repository;

	public Cource addCources(Cource cource) {
		DateTimeFormatter formatedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = LocalDateTime.now().format(formatedDate);
		cource.setBuyDate(LocalDateTime.now().format(formatedDate));

		cource.setEndDate(LocalDateTime.now().plusMonths((long) cource.getDuration()).format(formatedDate));
		return repository.save(cource);

	}

	public List<Cource> getCources() {
		return repository.findAll();

	}

	public Cource getById(int id) {
		Cource cource = repository.findById(id).orElse(null);
		return cource;
	}

	public Cource deleteById(int id) {
		Cource cource = repository.findById(id).orElse(null);
		if (cource != null) {
			repository.delete(cource);
			return cource;
		}
		return cource;
	}

	public Cource updateById(Cource cource) {
		Cource cource1 = repository.findById(cource.getId()).orElse(null);
		if (cource1 != null) {
			cource1.setName(cource.getName());
			cource1.setCost(cource.getCost());
			cource1.setDuration(cource.getDuration());
			cource1.setBuyDate(cource.getBuyDate());
			cource1.setEndDate(cource.getEndDate());

			repository.save(cource1);
			return cource1;

		}
		return cource1;
	}

	public Cource getByName(String name) {
		return repository.findByName(name);
	}

}
