package anra.mojaapka.service;
/**
 * @author Andrzej Radziejewski
 * @since 0.1
 */
import anra.mojaapka.models.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);

}
