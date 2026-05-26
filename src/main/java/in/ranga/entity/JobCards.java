package in.ranga.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobCards {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private LocalDate Date;
	private Integer Job_Card_number;
	private String Customer;
	private String PO_No;
	private String Part_Number;
	private String Grade;
	private String Part_Description;
	private String Proof_Matching;
	private String forging_size;
	private Integer Quantity;
	private String Nos;
	private Double InputWeight;
	private Double Rateperkg;
	private Double Total_Price;
	private LocalDate Delivery_Date;
	private String Routing;
	private String Heat_Treatment;
	private String Hardness;
	private Integer SuppliedQuantity;
	private Integer Balanced_Quantity;
	private String status;
	

}
