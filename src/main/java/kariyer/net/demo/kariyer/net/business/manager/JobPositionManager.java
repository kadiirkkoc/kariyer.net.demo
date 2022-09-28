package kariyer.net.demo.kariyer.net.business.manager;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kariyer.net.demo.kariyer.net.DTO.JobPositionCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobPositionViewDTO;
import kariyer.net.demo.kariyer.net.business.service.JobPositionService;
import kariyer.net.demo.kariyer.net.repository.JobPositionRepository;

@Service
public class JobPositionManager implements JobPositionService{
	
	JobPositionRepository jpRepository;
	
	@Autowired
	private JobPositionManager(JobPositionRepository jpRepository) {
		this.jpRepository = jpRepository;
	}
	
	@Override
	public List<JobPositionViewDTO> getAll() {
		return jpRepository.findAll().stream().map(JobPositionViewDTO::of).collect(Collectors.toList());
	}

	@Override
	public JobPositionCreateDTO createJobPosition(JobPosition jobPosition) {
		
		return null;
	}



	
	


}
