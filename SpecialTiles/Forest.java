package com.example.mytal.SpecialTiles;

import com.example.mytal.Enemy;
import com.example.mytal.Board;
import com.example.mytal.Player;
import com.example.mytal.Tile;

public class Forest extends Tile
{
    public Forest()
    {
        super(0, "Forest", true, 10);
    }
    public void Interaction(Player player, int dice)
    {
        switch (dice) {
            case 1:
                player.LostLifePoints();
                break;
            case 2:
                Board.Fight(player, new Enemy("Thief", true, 4, player.CurrTile));
                break;
            case 3:
                player.SetSkillPoints(player.SkillPoints--);
                break;
            case 6:
                player.SetSkillPoints(player.SkillPoints++);
                break;
        }
    }
}
