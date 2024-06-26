package com.example.talisman.SpecialTiles;

import com.example.talisman.Board;
import com.example.talisman.Player;
import com.example.talisman.Tile;

public class Village extends Tile
{
    public Village()
    {
        super(0, "Village", true, 12);
    }
    public void Interaction(Player player, int dice)
    {
        switch (dice) {
            case 1:
                player.SetTendancy(0);
                break;
            case 4:
                player.SetTendancy(2);
                break;
            case 5:
                player.SetSkillPoints(player.SkillPoints++);
                break;
            case 6:
                Board.DrawSpell(player);
                break;
        }
    }
}
