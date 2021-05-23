package kodlamaio.core.adapter;

import java.rmi.RemoteException;

import kodlamaio.core.Service.MernisService;
import kodlamaio.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class mernisAdapter implements MernisService{

	@Override
	public boolean TCKontrol(Candidate candidate) {

        KPSPublicSoapProxy kpsPublic;
        try {
            kpsPublic = new KPSPublicSoapProxy();
            boolean durum = kpsPublic.TCKimlikNoDogrula(
                    Long.parseLong(candidate.getIdentificationNumber()), 
                            candidate.getFirstName(), 
                            candidate.getLastName(), 
                            //Integer.parseInt(candidate.getBirthDate())
                            1992
                            );

            return durum;

        } catch (RemoteException | NumberFormatException e1) {

            e1.printStackTrace();
        }



        return false;

    }
}
