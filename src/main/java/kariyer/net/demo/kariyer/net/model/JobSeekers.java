package kariyer.net.demo.kariyer.net.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Table(name="job_seekers")
@Entity
public class JobSeekers extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	@Column(name="nationality_id",unique=true)
	private String nationalId;


	public JobSeekers( String email, String password, String repassword,String firstName, String lastName, String nationalId) {
		super(email,password,repassword);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
	}
	
	
	
	

}
