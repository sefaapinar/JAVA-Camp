package kodlamaio.core.adapter;

import java.util.Date;

public class FakeMernisService {
	public boolean ValidateByPersonelInfo(String identification_number, String first_name, String last_name,
			Date birth_date) {
		System.out.println(first_name + " " + last_name + "Personel Doğrulandı");
		return true;
	}

}
