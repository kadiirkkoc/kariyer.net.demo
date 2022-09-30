package kariyer.net.demo.kariyer.net.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kariyer.net.demo.kariyer.net.DTO.JobPositionCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobPositionViewDTO;
import kariyer.net.demo.kariyer.net.business.service.JobPositionService;

@RestController
@RequestMapping("/api")
public class JobPositionController {
	
	
	JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		this.jobPositionService=jobPositionService;
	}
	
	@GetMapping("/v1/job_position/getAll")
	public ResponseEntity<List<JobPositionViewDTO>> getAll(){
		return ResponseEntity.ok(jobPositionService.getAll());
	}
	
	
	@PostMapping("/v1/createJobPosition")
	public ResponseEntity<JobPositionViewDTO> createJobPosition(@RequestBody JobPositionCreateDTO jobPos){
		return ResponseEntity.ok(jobPositionService.createJobPosition(jobPos));
	}
	/*
	@PostMapping("/v1/abc")
	public ResponseEntity<JobSeekersViewDTO> createJobSeekers(@RequestBody JobSeekersCreateDTO jscDTO){
		return ResponseEntity.ok(jobSeekersService.register(jscDTO));
	}
}*/
}