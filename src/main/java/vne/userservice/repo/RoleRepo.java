package vne.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vne.userservice.Domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
