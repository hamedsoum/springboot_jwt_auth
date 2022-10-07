package vne.userservice.service;

import java.util.List;

import vne.userservice.Domain.Role;
import vne.userservice.Domain.User;

public interface UserService {
	
	User saveUser(User user);
	
	Role saveRole(Role role);
	
	void addRoleToUser(String username,  String roleName);
	
	User getUser(String userName);
	
	List<User>getUsers();
}

