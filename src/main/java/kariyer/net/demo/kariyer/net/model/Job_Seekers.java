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

public class Job_Seekers extends User{
	
	@Column(name="first_name",nullable = false)
	private String firstName;
	
	@Column(name="last_name",nullable = false)
	private String lastName;
	
	
	@Column(name="nationality_id",nullable = false,unique=true)
	private String naitonalityId;


	private Job_Seekers(String firstName, String lastName, String naitonalityId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.naitonalityId = naitonalityId;
	}
	
	
	
	

}
