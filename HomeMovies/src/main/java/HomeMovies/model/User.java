package HomeMovies.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public long id;
	
	@Column
	public String username;
	
	@Column
	public String email;
	
	@Column
	public String password;
	
	@Column
	public long id_grade;
	
	public long getId() { return this.id; }
	public String getUsername() { return this.username; }
	public String getEmail() { return this.email; }
	public String getPassword() { return this.password; }
	public long getIdGrade() { return this.id_grade; }
	
	public void setId(long id) { this.id = id; }
	public void setUsername(String name) { this.username = name; }
	public void setEmail(String mail) { this.email = mail; } 
	public void setPassword(String password) { this.password = password; }
	public void setIdGrade(long id_grade) { this.id_grade = id_grade; }

}
