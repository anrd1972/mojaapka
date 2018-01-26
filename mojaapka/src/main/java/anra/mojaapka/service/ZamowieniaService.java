package anra.mojaapka.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import anra.mojaapka.models.Zamowienia;

public interface ZamowieniaService {

	public List<Zamowienia> findAll();
	
	public void saveZamowienia(Zamowienia zamowienia);
	
	public Page<Zamowienia> findAllPages(Pageable pageable);
}
