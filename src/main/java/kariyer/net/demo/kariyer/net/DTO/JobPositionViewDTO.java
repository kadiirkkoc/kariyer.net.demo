package kariyer.net.demo.kariyer.net.DTO;

import java.io.Serializable;

import kariyer.net.demo.kariyer.net.model.JobPosition;
import lombok.Data;

@Data
public final class JobPositionViewDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String position_Name;
	
	private JobPositionViewDTO(String position_Name) {
		this.position_Name=position_Name;
	}
	
	public static JobPositionViewDTO of(JobPosition jobPosition) {
		return new JobPositionViewDTO(jobPosition.getPosition_Name());
	}

	
	
	

}
