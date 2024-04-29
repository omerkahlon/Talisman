package com.example.mytal.SpecialTiles;

import com.example.mytal.Player;
import com.example.mytal.Tile;

public class Cliffs extends Tile
{
    public Cliffs()
    {
        super(0, "Cliffs", true, 20);
    }
    public void Interaction(Player player, int dice)
    {
        switch (dice) {
            case 1:
                player.LostLifePoints();
                break;
            case 2:
                player.SetStrengthPoints(player.SkillPoints--);
                break;
            case 3:
                player.SetSkillPoints(player.SkillPoints++);
                break;
            case 4:
                player.SetStrengthPoints(player.StrengthPoints++);
                break;
            case 5:
                player.SetLifePoints(player.Curr_lifePoints++);
                break;
            case 6:
                //DrawSpell
                break;
        }
    }
}
