package vne.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vne.userservice.Domain.User;

/*ici <User, Long> on specifie a jpa l'entitie
 * (la classe user) et la table(user) 
 * de la BD qu'il va doit gerer et le type de la cle primaire de cette classe
 */
public interface UserRepo extends JpaRepository<User, Long> {
	/*jpa est inteligent et a travers cette fonction 
	 * il sait qu'il doit aller chercher le user correpondant
	 * au userName passe en parametre
	*/
	User findByUserName(String userName);
}
