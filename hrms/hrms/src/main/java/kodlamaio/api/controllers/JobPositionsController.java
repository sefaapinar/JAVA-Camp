package kodlamaio.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.business.abstracts.JobPositionsService;
import kodlamaio.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobs")
public class JobPositionsController {
	
	private JobPositionsService jobPositionsService;
	
	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobPositionsService.getAll();
	}
	
	@PostMapping("/add")
	public JobTitle newJobPosition(@RequestBody JobTitle newJobPosition) {
		return this.jobPositionsService.newJobPositions(newJobPosition);
	}
	


}
