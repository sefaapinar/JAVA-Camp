package kodlamaio.core.adapter;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class MernisServiceAdapter implements ValidationService{

	@Override
	public boolean validateByMernis(String identification_number, String first_name, String last_name,
			Date birth_date) {
		
		FakeMernisService client = new FakeMernisService();
		
		boolean result = true;
		try {
			result = client.ValidateByPersonelInfo(identification_number,first_name,last_name,birth_date);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
