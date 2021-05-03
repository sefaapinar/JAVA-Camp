package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println("Game System Added !" + game.getName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Game System Updated !" + game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game System Deleted !" + game.getName());
    }
}
