package vne.userservice.service;

import vne.userservice.Domain.Role;
import vne.userservice.Domain.User;

public interface UserService {
	
	User saveUser(User user);
	
	Role saveRole(Role role);
}
