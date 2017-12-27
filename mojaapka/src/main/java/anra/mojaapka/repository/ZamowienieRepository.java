package anra.mojaapka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anra.mojaapka.models.Zamowienia;

@Repository("zamowieniaRepository")
public interface ZamowienieRepository extends JpaRepository<Zamowienia, Long> {
	
	

}
