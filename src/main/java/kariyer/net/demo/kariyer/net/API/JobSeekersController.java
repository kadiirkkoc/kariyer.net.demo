package kariyer.net.demo.kariyer.net.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kariyer.net.demo.kariyer.net.DTO.JobSeekersCreateDTO;
import kariyer.net.demo.kariyer.net.DTO.JobSeekersViewDTO;
import kariyer.net.demo.kariyer.net.business.service.JobSeekersService;

@RestController
@RequestMapping("/api")
public class JobSeekersController {
	
	JobSeekersService jobSeekersService;
	
	@Autowired
	public JobSeekersController(JobSeekersService jobSeekersService) {
		this.jobSeekersService=jobSeekersService;
	}
	
	@GetMapping("/v2/getAll")
	public ResponseEntity<List<JobSeekersViewDTO>> getAll(){
		return ResponseEntity.ok(jobSeekersService.getAll());
	}
	
	@PostMapping("/v2/createAccount")
	public ResponseEntity<JobSeekersViewDTO> createAccount(@RequestBody JobSeekersCreateDTO jobSeekersCreateDTO){
		return ResponseEntity.ok(jobSeekersService.createAccount(jobSeekersCreateDTO));
	}

}
