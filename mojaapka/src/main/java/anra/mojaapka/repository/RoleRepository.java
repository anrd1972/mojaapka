package anra.mojaapka.repository;
/**
 * @author Andrzej Radziejewski
 * @since 0.1
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anra.mojaapka.models.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{

	public Role findByRole(String role);
}
