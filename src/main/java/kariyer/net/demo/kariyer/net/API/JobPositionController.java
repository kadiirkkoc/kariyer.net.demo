package kariyer.net.demo.kariyer.net.API;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kariyer.net.demo.kariyer.net.DTO.JobPositionCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobPositionViewDTO;
import kariyer.net.demo.kariyer.net.business.service.JobPositionService;

@RestController
@RequestMapping("/api")
public class JobPositionController {
	
	JobPositionService jobPositionService;
	
	@GetMapping("/v1/job_position/getAll")
	public ResponseEntity<List<JobPositionViewDTO>> getAll(){
		return ResponseEntity.ok(jobPositionService.getAll());
	}
	
	
	@PostMapping("/v1/job_position")
	public ResponseEntity<JobPositionCreateDTO> createJobPosition(){
		return ResponseEntity.ok(jobPositionService.createJobPosition());
	}
}
