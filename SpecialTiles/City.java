package com.example.mytal.SpecialTiles;

import com.example.mytal.Board;
import com.example.mytal.Player;
import com.example.mytal.Tile;

public class City extends Tile
{
    public City()
    {
        super(0, "City", true, 0);
    }
    public void Interaction(Player player, int dice)
    {
        switch (dice) {
            case 1:
                player.LostLifePoints();
                break;
            case 2:
                player.SetStrengthPoints(player.StrengthPoints--);
                break;
            case 3:
                player.SetSkillPoints(player.SkillPoints--);
                break;
            case 4:
                player.SetSkillPoints(player.SkillPoints++);
                break;
            case 5:
                player.SetStrengthPoints(player.StrengthPoints++);
                break;
            case 6:
                Board.DrawSpell(player);
                break;
        }
    }
}
