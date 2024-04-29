package com.example.mytal.SpecialTiles;

import com.example.mytal.Board;
import com.example.mytal.Enemy;
import com.example.mytal.Player;
import com.example.mytal.Tile;

public class Inn extends Tile
{
    public Inn()
    {
        super(0, "Inn", true, 6);
    }
    public void Interaction(Player player, int dice)
    {
        switch (dice) {
            case 1:
                player.LostLifePoints();
                break;
            case 2:
                Board.Fight(player, new Enemy("Farmer", true, 3, player.CurrTile));
                break;
            case 3:
                player.SetCurrGold(player.Curr_Gold--);
                break;
            case 4:
                player.SetCurrGold(player.Curr_Gold++);
                break;
            case 5:
                player.SetCurrGold(player.Curr_Gold+2);
                break;
            case 6:
                Board.DrawSpell(player);
                break;
        }
    }
}
