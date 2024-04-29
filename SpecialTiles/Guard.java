package com.example.mytal.SpecialTiles;

import com.example.mytal.Board;
import com.example.mytal.Enemy;
import com.example.mytal.Player;
import com.example.mytal.Tile;
public class Guard extends Tile
{
    private Enemy Guardian;
    public Guard()
    {
        super(0, "Guard", true, 16);
        Guardian = new Enemy("Guardian", true, 10, Map[16]);
    }
    public void Interaction(Player player)
    {
        if(player.HasTalisman())
        {
            Board.Fight(player, Guardian);
            if (//won)
            //ENDGAME
        }
    }
}
