package kodlamaio.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employer")
public class Employer extends User {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_address")
	private String web_address;
	
	@Column(name="phone_number")
	private String phone_number;
	
}
