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
@NoArgsConstructor //Boş ctor oluşturuyor.
@AllArgsConstructor //Dolu ctor oluşturuyor.
@Entity
@Table(name="job_positions")  //veri tabanında tablo ismi.
public class JobPositions {
	
	
	@Id //veri tabanında kendisi oluşan değer.
	@GeneratedValue //idendtity değer olmasını sağlar.
	@Column(name="id")
	private int id;
	
	@Column(name="position")
	private String position;
}












