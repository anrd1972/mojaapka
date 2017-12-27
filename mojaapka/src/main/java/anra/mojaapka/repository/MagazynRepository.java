package anra.mojaapka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anra.mojaapka.models.Magazyn;

@Repository("magazynRepository")
public interface MagazynRepository extends JpaRepository<Magazyn, Long>{
	
	

}

