package kariyer.net.demo.kariyer.net.business.service;

import java.util.List;

import kariyer.net.demo.kariyer.net.DTO.JobPositionCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobPositionViewDTO;

public interface JobPositionService {
	
	List<JobPositionViewDTO> getAll();

	JobPositionViewDTO createJobPosition(JobPositionCreateDTO jobPositionCreateDTO);

}
