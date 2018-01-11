package anra.mojaapka.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anra.mojaapka.models.Zamowienia;
import anra.mojaapka.repository.ZamowienieRepository;
import anra.mojaapka.service.ZamowieniaService;

@Service("zamowieniaService")
@Transactional
public class ZamowieniaServiceImpl implements ZamowieniaService {
	
	@Autowired
	ZamowienieRepository zamowieniaRepository;

	@Override
	public List<Zamowienia> findAll() {
		List<Zamowienia> zamowieniaList = null;
		zamowieniaList = zamowieniaRepository.findAll();
		return zamowieniaList;
	}

}
