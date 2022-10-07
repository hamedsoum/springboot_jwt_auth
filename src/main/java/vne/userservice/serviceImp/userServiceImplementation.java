package vne.userservice.serviceImp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import vne.userservice.Domain.Role;
import vne.userservice.Domain.User;
import vne.userservice.repo.RoleRepo;
import vne.userservice.repo.UserRepo;
import vne.userservice.service.UserService;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class userServiceImplementation implements UserService {
	
	/*ces repo communique directememt avec jpa qui a 
	 * son tour fait beaucoup de chose dans le backend
	 * pour creer des requete pour nous et interroge la base de donnee
	 * */
	private final UserRepo userRepo;
	private final RoleRepo roleRepo;

	/*
	 * Le mot-clé @override est utilisé pour définir une méthode qui est héritée de la classe parente. 
	 * On ne l'utilise donc que dans le cas de l'héritage. En plaçant ce mot-clé dans le commentaire 
	 * de la méthode réécrite, le compilateur vérifiera que la méthode est correctement utilisée (mêmes
	 *  arguments, même type de valeur de retour) et affichera un message d'avertissement si ce n'est pas le cas.
	 * */
	
	@Override
	public User saveUser(User user) {
		log.debug("Saving new user {} to the database", user.getUserName());

		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		log.debug("Saving new role {} to the database", role.getName());
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		log.debug("Adding role {} to user {}", roleName, username);
		User user = userRepo.findByUserName(username);
		Role role = roleRepo.findByName(roleName);
		user.getRoles().add(role);
	}

	@Override
	public User getUser(String username) {
		log.debug("fetching user {} ",  username);
		return userRepo.findByUserName(username);
	}

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}
 
}
