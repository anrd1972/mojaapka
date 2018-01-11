package anra.mojaapka.service;

import java.util.List;

import anra.mojaapka.models.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);

	public List<User> findAll();
	
	public User findUserById(int id);
	
	public void updateUser(String rola, User user);

}
