package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public class PlayerX extends Player{

    public PlayerX(String name, String surname, PlayerType type) {
        super(name, surname, type);
    }

    public Shape shape() {
        return Shape.X;
    }

}
