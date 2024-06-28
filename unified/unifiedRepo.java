package Assignment.MedBlocks.demo.unified;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface unifiedRepo extends JpaRepository<unifiedEntity,Long>{

}
