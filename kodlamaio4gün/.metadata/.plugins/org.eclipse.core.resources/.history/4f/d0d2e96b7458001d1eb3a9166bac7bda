package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	
	private List<ProgrammingLanguage>programmingLanguages;
	

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages=new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
		
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguages.remove(programmingLanguage);
		
	}

	//@Override
//	public void update(ProgrammingLanguage programmingLanguage) {
//		this.programmingLanguage.(programmingLanguage);
//		
//	}

	@Override
	public List<ProgrammingLanguage> getAll() {
	
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getId(int id) {
		
		return programmingLanguages.get(id);
	}

}
