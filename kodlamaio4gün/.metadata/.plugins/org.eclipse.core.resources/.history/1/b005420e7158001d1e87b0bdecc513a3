package Kodlama.io.Devs.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesControllers {
	
	private ProgrammingLanguageService programmingLanguageService;
	@Autowired
	public ProgrammingLanguagesControllers(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguageService.add(programmingLanguage);
	}
	@GetMapping("/delete")
	public void delete(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguageService.delete(programmingLanguage);
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguage>getAll(){
		return programmingLanguageService.getAll();
	}
	@GetMapping("/getıd")
	public ProgrammingLanguage getId(int id) {
		return programmingLanguageService.getId(id);
	}

}
