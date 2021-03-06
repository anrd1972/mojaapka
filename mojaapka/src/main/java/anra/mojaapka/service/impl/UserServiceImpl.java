package anra.mojaapka.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anra.mojaapka.models.Role;
import anra.mojaapka.models.User;
import anra.mojaapka.repository.RoleRepository;
import anra.mojaapka.repository.UserRepository;
import anra.mojaapka.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ROLE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		List<User> userList = null;
		userList = userRepository.findAll();
		return userList;
	}
	
	@Override
	public User findUserById(int id) {
		return userRepository.findUserById(id);
	}

	@Override
	public void updateUser(String rola, User user) {
		Role userRole = roleRepository.findByRole(rola);
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}

}
