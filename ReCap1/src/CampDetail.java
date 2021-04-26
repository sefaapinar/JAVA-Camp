public class CampDetail {
    int id;
    String Name;
    String info;
    String time;

    static int numberOfCamp=0;
    public CampDetail(int id, String name,String info,String time){
        this.id=id;
        this.info=info;
        this.Name=name;
        this.time=time;
        numberOfCamp++;
    }


}
