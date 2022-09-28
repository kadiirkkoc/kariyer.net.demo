package kariyer.net.demo.kariyer.net.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
	
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(name="e_mail",nullable = false,unique=true)
	private String email;
	
	@Column(name="password",nullable = false)
	private String password;
	
	@Column(name="re_password",nullable = false)
	private String repassword;
	
	@ManyToOne
	@JoinColumn(name="job_position_id",nullable=false)
	private JobPosition job_position;

	private User(String email, String password, String repassword) {
		this.email = email;
		this.password = password;
		this.repassword = repassword;
	}
	
	
	
	

}
