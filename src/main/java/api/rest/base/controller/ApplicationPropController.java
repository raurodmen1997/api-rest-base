package api.rest.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.rest.base.domain.ApplicationProp;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = { "http://localhost:4200" })
public class ApplicationPropController {
	
	
	@Value("${application.version}")
	private String version;
	
	@Value("${application.description}")
	private String description;
	
	@Value("${application.name}")
	private String name;
	

	
	@GetMapping("/application")
	public ApplicationProp applicationProperties(){
		return new ApplicationProp(this.version, this.description, this.name);
		
	}
	
	
}
