package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SalesService {
    void Buy(Customer customer, Game game);
    void Buy(Customer customer, Game game, Campaign campaign);
}
