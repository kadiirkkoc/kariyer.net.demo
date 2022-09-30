package kariyer.net.demo.kariyer.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kariyer.net.demo.kariyer.net.model.JobSeekers;

@Repository
public interface JobSeekersRepository extends JpaRepository<JobSeekers, Long>{

}
