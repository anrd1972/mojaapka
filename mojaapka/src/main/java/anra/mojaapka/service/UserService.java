package anra.mojaapka.service;

import anra.mojaapka.models.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);

}
