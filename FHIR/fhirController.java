package Assignment.MedBlocks.demo.FHIR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Assignment.MedBlocks.demo.unified.unifiedEntity;
import Assignment.MedBlocks.demo.unified.unifiedRepo;

@RestController
@RequestMapping("/fhir")
public class fhirController {

	 @Autowired
	    private unifiedRepo unifiedRepository;

	    @PostMapping("/patients")
	    public unifiedEntity createPatient(@RequestBody unifiedEntity patient) {
	        return unifiedRepository.save(patient);
	    }
}
