package in.ranga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.ranga.IServiceImpl.ServiceImpl;
import in.ranga.entity.SkEMployee;
import in.ranga.repo.Skemployeerepo;

@Controller
@RequestMapping("/sk")
public class Skcontroller {
	@Autowired
	private ServiceImpl service;
	@Autowired
	private Skemployeerepo repo;
	@GetMapping("register")
	public String regpage() {
		return "EmployeeReg";
	}
	@GetMapping("login")
	public String loginPage() {
		return "Emplogin";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute SkEMployee emp,Model model) {
		Integer id = service.saveEmployee(emp);
		String msg = "Employee "+id+" created";
		model.addAttribute("message", msg);
		return "redirect:/sk/login";
	}
	@PostMapping("/login")
	public String login(@RequestParam("phone") String phone,@RequestParam("password") String password,Model model) {
		System.out.println(phone);
		System.out.println(password);
		SkEMployee emp=repo.findByPhone(phone);
		if (emp!=null && emp.getPassword().equals(password)) {
			model.addAttribute("msg","Login Successfully");
			return "redirect:/sk/all";
		}
		model.addAttribute("msg", "Invalid Phone or Password");

		return "redirect:/login";
	}
	@GetMapping("/all")
	public String getAll(@RequestParam(required=false) String message,Model model) {
		List<SkEMployee> listofemp=service.getAllEmployees();
		model.addAttribute("emps", listofemp);
		model.addAttribute("msg",message);
		return "EmployeeData";
	}
	@GetMapping("/edit")
	public String edit(@RequestParam Integer id,Model model) {
		SkEMployee emp =service.getOneEMployee(id);
		model.addAttribute("Employee", emp);
		return "EmployeeEdit";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id,RedirectAttributes attributes) {
		service.deleteEmployee(id);
		attributes.addAttribute("msg","employee ' "+id+" ' deleted");
		return "redirect:all";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute SkEMployee emp,RedirectAttributes attributes) {
		service.UpdateEmployee(emp);
		attributes.addAttribute("msg","Employee ' "+emp.getEmployeeid()+"' updated");
		return "redirect:all";
	}

}
