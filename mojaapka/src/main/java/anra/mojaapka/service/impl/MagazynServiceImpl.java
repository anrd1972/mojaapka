package anra.mojaapka.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import anra.mojaapka.models.Magazyn;
import anra.mojaapka.repository.MagazynRepository;
import anra.mojaapka.service.MagazynService;

public class MagazynServiceImpl implements MagazynService {

	@Autowired
	MagazynRepository magazynRepository;
	
	@Override
	public void saveMagazyn(Magazyn magazyn) {
		magazynRepository.save(magazyn);
	}

}
