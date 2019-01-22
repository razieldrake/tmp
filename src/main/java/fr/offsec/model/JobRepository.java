package fr.offsec.model;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.offsec.domain.CVE;
import fr.offsec.domain.Job;
import fr.offsec.domain.Service;

@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {
	
	Iterable<Job> findAllByID(int idJob);
	Iterable<Job> findAllByJobName(String name);
	Iterable<Job> findAllJobByStatus(String status);
	
}
