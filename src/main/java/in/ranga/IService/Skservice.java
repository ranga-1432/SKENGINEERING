package in.ranga.IService;

import java.util.List;

import in.ranga.entity.SkEMployee;

public interface Skservice {
	Integer saveEmployee(SkEMployee emp);
	List<SkEMployee> getAllEmployees();
	SkEMployee getOneEMployee(Integer id);
	void deleteEmployee(Integer id);
	void UpdateEmployee(SkEMployee emp);
	

}
