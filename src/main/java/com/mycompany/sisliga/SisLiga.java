/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sisliga;

import com.mycompany.sisliga.Game.Game;
import com.mycompany.sisliga.People.Manager;
import com.mycompany.sisliga.People.Player;
import com.mycompany.sisliga.Teams.Team;
import java.util.ArrayList;

/**
 *
 * @author caleb
 */
public class SisLiga {

    public static void main(String[] args) {
        
        Manager xavi = new Manager("Xavi", "nose", 42);
        Manager dudamel = new Manager("dudamel", "nose", 40);
        Team team1 = new Team("FC Barcelona", "Barcelona", xavi);
        Team team2 = new Team("FC Bucaramanga ", "Bucaramanga", dudamel);
        Team team3 = new Team("Santa Fe ", "Bogota", dudamel);
        Team team4 = new Team("FC Colombia", "Colombia", dudamel);
        
        Player player1 = new Player("jose", "rodriguez", 18, "DC");
        player1.addCard();
        player1.addGoal(1);
        Player player2 = new Player("Caleb", "rodriguez", 19, "MC");
        player2.addCard(3);
        player2.addGoal(5);
        Player player21 = new Player("leo", "rodriguez", 17, "IE");
        player21.addCard(2);
        player21.addGoal(8);
        Player player3 = new Player("juan", "rodriguez", 18, "PO");
        player3.addGoal(10);
        player3.addCard();
        Player player4 = new Player("kaka", "rodriguez", 18, "MI");
        player4.addGoal(100);
        player4.addCard();
        
        
        team1.addPlayer(player1);
        team2.addPlayer(player2);
        team2.addPlayer(player21);
        team3.addPlayer(player3);
        team4.addPlayer(player4);
        
        ArrayList<Team> listTeams = new ArrayList<>();
        listTeams.add(team2);
        listTeams.add(team1);
        listTeams.add(team3);
        listTeams.add(team4);
        Game game = new Game(listTeams);
        

        
        game.game(team1, team2);
        game.game(team1, team3);
        game.game(team4, team3);
        game.showTabla();
        game.cardsMax();
        game.goalScorer();
    }
}
