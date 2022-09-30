package kariyer.net.demo.kariyer.net.business.manager;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kariyer.net.demo.kariyer.net.DTO.JobSeekersCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobSeekersViewDTO;
import kariyer.net.demo.kariyer.net.business.service.JobSeekersService;
import kariyer.net.demo.kariyer.net.model.JobSeekers;
import kariyer.net.demo.kariyer.net.repository.JobSeekersRepository;

@Service
public class JobSeekersManager implements JobSeekersService{
	
	JobSeekersRepository jobSeekersRepository;
	
	
	
	private JobSeekersManager(JobSeekersRepository jobSeekersRepository) {
		this.jobSeekersRepository = jobSeekersRepository;
	}



	@Override
	public JobSeekersViewDTO createAccount(JobSeekersCreateDTO jobSeekersCreateDTO) {
		
		JobSeekers jobSeeker = new JobSeekers(jobSeekersCreateDTO.getEmail()
				,jobSeekersCreateDTO.getPassword(),jobSeekersCreateDTO.getRePassword()
				,jobSeekersCreateDTO.getFirstName(),jobSeekersCreateDTO.getLastname()
				,jobSeekersCreateDTO.getNationalId());
			
		jobSeekersRepository.save(jobSeeker);
		
		
		return JobSeekersViewDTO.of(jobSeeker);
	}



	@Override
	public List<JobSeekersViewDTO> getAll() {
		return jobSeekersRepository.findAll().stream().map(JobSeekersViewDTO::of).collect(Collectors.toList());
	}
		
}
