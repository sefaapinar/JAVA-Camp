package kodlamaio.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="verification_codes")
@NoArgsConstructor
@AllArgsConstructor
public class VerificationCode {

	@Id
	@GeneratedValue //artış
	@Column(name="id")
	private int id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="is_verified")
	private boolean is_verified;
	
	@Column(name="user_id")
	private int user_id;
	
	public VerificationCode(int user_id, String code, boolean is_verified) {
		super(); //üst sınıfın nesnelerini yaratabiliriz.
		this.user_id=user_id;
		this.is_verified=is_verified;
		this.code =code;
	}
}
