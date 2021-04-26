public class Main {
    public static  void main(String[] args){

        CampManager campManager=new CampManager();
        CampDetail campDetail1=new CampDetail(1,"C# kursu","Engin Demiroğ","430 Saat");
        CampDetail campDetail2=new CampDetail(2,"C++ kursu","Engin Demiroğ","400 Saat");
        CampDetail campDetail3=new CampDetail(3,"Python kursu","Engin Demiroğ","550 Saat");

        CampDetail [] campDetails ={campDetail1,campDetail2,campDetail3};
        campManager.campSay(campDetails);
        campManager.campTur();
        campManager.infoOfCamp(campDetail1);
    }
}
