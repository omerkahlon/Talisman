package com.example.mytal;

import com.example.mytal.SpecialTiles.Church;
import com.example.mytal.SpecialTiles.City;
import com.example.mytal.SpecialTiles.Cliffs;
import com.example.mytal.SpecialTiles.Forest;
import com.example.mytal.SpecialTiles.Graveyard;
import com.example.mytal.SpecialTiles.Inn;
import com.example.mytal.SpecialTiles.Village;
import com.example.mytal.SpecialTiles.Guard;

import java.util.ArrayList;

public class Board
{
    public Tile[] Map = new Tile[24];
    public Board()
    {
        Map[0] = new City();
        Map[1] = new Tile(1, "Fields", false, 1);
        Map[2] = new Tile(1, "Hills", false, 2);
        Map[3] = new Tile(1, "Plains", false, 3);
        Map[4] = new Tile(1, "Grove", false, 4);
        Map[5] = new Tile(1, "Plains", false, 5);
        Map[6] = new Inn();
        Map[7] = new Tile(1, "Fields", false, 7);
        Map[8] = new Tile(2, "Ruins", false, 8);
        Map[9] = new Tile(1, "Plains", false, 9);
        Map[10] = new Forest();
        Map[11] = new Tile(1, "Fields", false, 11);
        Map[12] = new Village();
        Map[13] = new Tile(1, "Fields", false, 13);
        Map[14] = new Graveyard();
        Map[15] = new Tile(1, "Grove", false, 15);
        Map[16] = new Guard();
        Map[17] = new Tile(1, "Hills", false, 17);
        Map[18] = new Church();
        Map[19] = new Tile(1, "Fields", false, 19);
        Map[20] = new Cliffs();
        Map[21] = new Tile(1, "Plains", false, 21);
        Map[22] = new Tile(1, "Grove", false, 22);
        Map[23] = new Tile(1, "Fields", false, 23);
    }

    public void takeTurn(Player player, Board board)
    {
        // Player moves
        Dice D6 = new Dice();
        int PlayerBonus = D6.Roll();
        int currentTileIndex = player.CurrTile.MapIndex; // Get current tile index
        // Calculate new tile positions based on player bonus (steps)
        int newPositionClockwise = (currentTileIndex + PlayerBonus) % Map.length;
        int newPositionCounterClockwise = (currentTileIndex - PlayerBonus + Map.length) % Map.length;
        // Get the new tiles from the map array
        Tile tileClockwise = Map[newPositionClockwise];
        Tile tileCounterClockwise = Map[newPositionCounterClockwise];
        //left of right?
        if (left)
            player.SetTile(tileCounterClockwise);
        else player.SetTile(tileClockwise);
        // Check if there are other characters on the same tile
        ArrayList<Player> otherPlayers = newTile.Players;
        if (!otherPlayers.isEmpty()) {
            // Initiate combat
            for (Player enemy : otherPlayers)
            {
                //wants to combat?
                if (wantsToCombat) {
                    Board.FightPlayers(player, enemy);
                }
            }
        } else {
            // Draw a card
            DrawCard(player);
        }
        if (player.CurrTile.IsSpecial)
            player.CurrTile.Interaction();
    }
    public static void Fight(Player player, Enemy enemy)
    {
        Dice D6 = new Dice();
        int PlayerBonus = D6.Roll();
        int EnemyBonus = D6.Roll();
        if (enemy.IsStrength)
        {
            if(player.StrengthPoints + PlayerBonus > enemy.Power + EnemyBonus)
                player.SetCurrGold(player.Curr_Gold++);
            else player.LostLifePoints();
        }
        else {
            if(player.SkillPoints + PlayerBonus > enemy.Power + EnemyBonus)
                player.SetCurrGold(player.Curr_Gold++);
            else player.LostLifePoints();
        }
    }
    public static void FightPlayers(Player p1, Player p2)
    {
        Dice D6 = new Dice();
        int p1Bonus = D6.Roll();
        int p2Bonus = D6.Roll();
        if(p1.StrengthPoints + p1Bonus > p2.StrengthPoints + p2Bonus)
            p2.LostLifePoints();
        else p1.LostLifePoints();
    }
    public void DrawCard(Player player)
    {

    }
    public static void DrawSpell(Player player)
    {

    }
}
