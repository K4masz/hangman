package Data.intefaces;

import Data.model.Player;

import java.util.List;

public interface PlayerDAO {
    List<Player> getAllPlayers();
    Player getPlayer(int id);
    void addPlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayer(Player player);
}
