package vne.userservice.Domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Entity permet de mapper(faire une correspondance avec une table de la base se donnee)
@Entity
// l'anotation Data permet de generer les getter et setter de chaque attribut de la classe
@Data
//une annotation pour le constructeur 
@AllArgsConstructor 
// une annotation pour gerer le consctructeur par defaut de la class
@NoArgsConstructor
public class User {
	// specificis l'id pour lombook
	@Id
	// cette annotation permet de specifier comment l'id doit etre genere
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name ;
	private String userName;
	private String password;
	/*relation plusieurs a plusieurs. 
	 * "fetch = FetchType.EAGER" : pour charger le user avec tous ses roles
	*/
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles = new ArrayList<>();

}
