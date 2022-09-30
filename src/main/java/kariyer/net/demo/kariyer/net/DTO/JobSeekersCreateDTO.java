package kariyer.net.demo.kariyer.net.DTO;


import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class JobSeekersCreateDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@NotNull(message="name can not be null")
	private String firstName;
	
	@NotNull(message="name can not be null")
	private String lastname;
	
	@NotNull(message="name can not be null")
	private String nationalId;
	
	@NotNull(message="name can not be null")
	private String email;
	
	@NotNull(message="name can not be null")
	private String password;
	
	@NotNull(message="name can not be null")
	private String rePassword;
}
