import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      SalesManager salesManager = new SalesManager();
      salesManager.Buy(new Customer(1,"Sefa","Pınars", LocalDate.of(2000,4,12),"12345123414"), new Game(1, "League Of Legends",300,"10 Characters free"));
      salesManager.Buy(new Customer(1,"Sefa","Pınars",LocalDate.of(2000,4,12), "1234555321"), new Game(1,"League Of Legends",300,"10 Chararcters Free"), new Campaign(1,"Black Friday",15));


    }

}
