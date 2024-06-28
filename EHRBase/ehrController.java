package Assignment.MedBlocks.demo.EHRBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Assignment.MedBlocks.demo.unified.unifiedEntity;
import Assignment.MedBlocks.demo.unified.unifiedRepo;

@RestController
@RequestMapping("/ehr/rest")
public class ehrController {

	@Autowired
    private unifiedRepo unifiedRepository;

  @PostMapping("/patient")
    public unifiedEntity createRecord(@RequestBody unifiedEntity record) {
        return unifiedRepository.save(record);
    }
}
