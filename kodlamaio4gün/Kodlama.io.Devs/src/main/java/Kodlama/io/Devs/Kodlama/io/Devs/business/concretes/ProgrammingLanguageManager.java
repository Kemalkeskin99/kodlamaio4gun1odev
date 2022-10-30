package Kodlama.io.Devs.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.core.utilities.Result.ErrorSuccessResult;
import Kodlama.io.Devs.Kodlama.io.Devs.core.utilities.Result.SuccessResult;
import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {

		this.programmingLanguageRepository = programmingLanguageRepository;

	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		if(isEmpty(programmingLanguage)) {
			new ErrorSuccessResult(false,"Do not ignore the programming language");
			}
			if(isExits(programmingLanguage)) {
				new ErrorSuccessResult(false, "Programming language is available");
			}
			

			programmingLanguageRepository.add(programmingLanguage);
			new SuccessResult(true, "Dil kaydeildi");
			

	}

	

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguageRepository.delete(programmingLanguage);

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return this.programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getId(int id) {

		return this.programmingLanguageRepository.getId(id);
	}
	private boolean isExits(ProgrammingLanguage programmingLanguage) {
		
		for(ProgrammingLanguage language:this.getAll()) {
			if(programmingLanguage.getName().equals(language.getName())) {
			return true;
			}
		}
		
		return false;
	}
	private boolean isEmpty(ProgrammingLanguage programmingLanguage) {
		
		return programmingLanguage.getName().isEmpty();
	}

}
