package in.ranga.IServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ranga.IService.Skservice;
import in.ranga.entity.SkEMployee;
import in.ranga.repo.Skemployeerepo;
@Service
public class ServiceImpl implements Skservice{
	@Autowired
	private Skemployeerepo repo;

	@Override
	public Integer saveEmployee(SkEMployee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp).getEmployeeid();
	}

	@Override
	public List<SkEMployee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public SkEMployee getOneEMployee(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void UpdateEmployee(SkEMployee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
	}

}
