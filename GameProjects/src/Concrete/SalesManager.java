package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements SalesService {
    @Override
    public void Buy(Customer customer, Game game) {
        System.out.println(game.getName() + "Game" + customer.getFirstName()+ "Player Named" + game.getPrice() + " SOLD OR PRICE");
    }

    @Override
    public void Buy(Customer customer, Game game, Campaign campaign) {
        double newPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountPercentage() / 100);

        System.out.println(game.getName() + "Game " +customer.getFirstName() + " Player Named"+ "%" + campaign.getDiscountPercentage() + "Discount" + newPrice + "SOLD OR PRICE");
    }
}
