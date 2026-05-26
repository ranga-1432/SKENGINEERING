package in.ranga.entity;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee")
public class SkEMployee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employeeid;
	private String employeename;
	private String phone;
	private String dept;
	private Double salary;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joiningDate;
	private String address;
	private String password;
	
}
