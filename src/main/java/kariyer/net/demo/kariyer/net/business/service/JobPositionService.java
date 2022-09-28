package kariyer.net.demo.kariyer.net.business.service;

import java.util.List;

import kariyer.net.demo.kariyer.net.DTO.JobPositionCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobPositionViewDTO;
import kariyer.net.demo.kariyer.net.model.JobPosition;

public interface JobPositionService {
	
	List<JobPositionViewDTO> getAll();

	JobPositionCreateDTO createJobPosition(JobPosition jobPosition);

}
