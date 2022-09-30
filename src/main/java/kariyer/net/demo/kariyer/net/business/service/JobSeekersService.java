package kariyer.net.demo.kariyer.net.business.service;

import java.util.List;


import kariyer.net.demo.kariyer.net.DTO.JobSeekersCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobSeekersViewDTO;

public interface JobSeekersService {
	
	 JobSeekersViewDTO createAccount(JobSeekersCreateDTO jobSeekersCreateDTO);

	List<JobSeekersViewDTO> getAll();

}
