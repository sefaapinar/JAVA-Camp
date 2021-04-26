public class CampManager {
    public void campTur(){
        System.out.println("KODLAMA.IO Sitesinde TOPLAM KAMP"+CampDetail.numberOfCamp+"VARDIR.");
    }
    public void infoOfCamp(CampDetail campDetail){
        System.out.println(campDetail.Name+"Kamp Eğitmenin Adı:"+campDetail.info);
    }
    public void campSay(CampDetail[]campDetails){
        for (CampDetail campDetail : campDetails){
            System.out.println("Kamp Adı : "
                    +campDetail.Name+"Kamp Bilgisi: " +
                    ""+campDetail.info+"Kamp Süresi:" +
                    " "+campDetail.time+"Kamp Numarası"+campDetail.id);
        }
    }
}
