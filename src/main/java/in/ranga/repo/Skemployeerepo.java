package in.ranga.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ranga.entity.SkEMployee;



public interface Skemployeerepo extends JpaRepository<SkEMployee, Integer>{
	SkEMployee findByPhone(String phone);

}
