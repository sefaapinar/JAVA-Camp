package kodlamaio.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor //Boş bir ctor oluşturmaya yarar.
@Table(name="candidate_users")

public class Candidate extends User {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="national_identity")
	private String national_identity;
	
	@Column(name="birth_year")
	private String birth_year;
	
	@Column(name="verify")
	private boolean verify;
	
	
	public Candidate(int id,String name, String surname, String national_identity, String birth_year, boolean verify) {
		super();
		this.id=id;
		this.name = name;
		this.surname = surname;
		this.national_identity = national_identity;
		this.birth_year = birth_year;
		this.verify = verify;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNational_identity() {
		return national_identity;
	}

	public void setNational_identity(String national_identity) {
		this.national_identity = national_identity;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
