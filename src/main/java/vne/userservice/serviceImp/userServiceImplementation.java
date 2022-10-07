package vne.userservice.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vne.userservice.Domain.Role;
import vne.userservice.Domain.User;
import vne.userservice.repo.RoleRepo;
import vne.userservice.repo.UserRepo;
import vne.userservice.service.UserService;

@Service @RequiredArgsConstructor
public class userServiceImplementation implements UserService {
	
	// ces repo communique directememt avec jpa qui a son tour fait beaucoup de chose dans le backend
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
