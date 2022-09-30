package kariyer.net.demo.kariyer.net.DTO;

import java.io.Serializable;
import java.util.List;

import kariyer.net.demo.kariyer.net.model.JobSeekers;
import lombok.Data;

@Data
public class JobSeekersViewDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String firstName;
	
	
	private String lastname;
	
	
	private String nationalId;
	
	
	private String email;
	
	
	private String password;
	
	
	private String rePassword;
	
	public JobSeekersViewDTO(String firstName,String lastName,String email) {
		this.firstName=firstName;
		this.lastname=lastName;
		this.email=email;
	}
	
	public static JobSeekersViewDTO of(JobSeekers jobSeekers) {
		return new JobSeekersViewDTO(jobSeekers.getFirstName(),jobSeekers.getLastName(),jobSeekers.getEmail());
	}

	


}
