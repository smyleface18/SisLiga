

package com.mycompany.sisliga.Game;

import com.mycompany.sisliga.People.Player;
import com.mycompany.sisliga.Teams.Team;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Game {
    
    ArrayList<Team> listTeams = new ArrayList<>();
    
    public Game(ArrayList<Team> listTeams) {
        this.listTeams = listTeams;
    }
    
    public void game(Team team1, Team team2){
        Scanner Read = new Scanner (System.in);
        System.out.println("Cantidad de goles que anoto el equipo local (el primer equipo que se envio de parametro)");
        int Goalteam1 = Read.nextInt();
        System.out.println("Cantidad de goles que anoto el equipo visitante");
        int Goalteam2 = Read.nextInt();
        
        if(Goalteam1 > Goalteam2){
            team1.addScore(3);
        }
        else if(Goalteam2 > Goalteam1){
            team1.addScore(3);
        }
        else if(Goalteam2 == Goalteam1){
            team1.addScore(1);
            team2.addScore(1);
        }         
    }
    
    public void showTabla(){
        
        Collections.sort(listTeams, (t1, t2) -> t2.getScore() - t1.getScore());
        for (Team team : listTeams) {
            System.out.println(team.getName()+" "+team.getScore());
        }
    };
    
    public void cardsMax(){
        Collections.sort(listTeams, (t1, t2) -> t2.totalCards() - t1.totalCards());
        Team team1 = listTeams.get(0);
        System.out.println(team1.getName()+" Card: "+ team1.totalCards());

    }
    public void goalScorer(){
        ArrayList<Player> listGoalsPlayers = new ArrayList<>();
        for (Team team : listTeams) {
            listGoalsPlayers.add(team.goalScorer());
        }
        
        Collections.sort(listGoalsPlayers, (p1, p2) -> p2.getGoals() - p1.getGoals());
        Player player1 = listGoalsPlayers.get(0);
        System.out.println("El maximo goleador de la liga es: "+player1.getName()+" con "+ player1.getGoals()+" goles");
    }
    
    
}
