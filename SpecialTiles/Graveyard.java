package com.example.mytal.SpecialTiles;

import com.example.mytal.Board;
import com.example.mytal.Player;
import com.example.mytal.Tile;

public class Graveyard extends Tile
{
    public Graveyard()
    {
        super(0, "Graveyard", true, 14);
    }
    public void Interaction(Player player, int dice)
    {
        if (player.Tendency == 0)
        {
            if (dice == 5)
            {
                player.SetCurrGold(player.Curr_Gold++);
            }
            if (dice == 6)
            {
                Board.DrawSpell(player);
            }
        }
        if (player.GetTendency() == 1) {
            // Check if the player wants to heal (condition not specified)
            while (/* condition to continue healing */) {
                if (player.GetCurrGold() > 0 && player.Curr_lifePoints < player.GetStartLifePoints()) {
                    // Perform healing and deduct gold if conditions are met
                    player.SetLifePoints(player.Curr_lifePoints + 1);
                    player.SetCurrGold(player.GetCurrGold() - 1);
                } else {
                    // Stop healing if conditions are no longer met
                    break;
                }
            }
        }
        else player.SetLifePoints(player.Curr_lifePoints--);
    }
}
