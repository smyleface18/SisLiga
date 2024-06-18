
package com.mycompany.sisliga.Teams;

import com.mycompany.sisliga.People.Manager;
import com.mycompany.sisliga.People.Player;
import java.util.ArrayList;
import java.util.Collections;


public class Team implements ChangeManager{
    
    private String name;
    private String city;
    private Manager maneger;
    private ArrayList<Player> listPlayers = new ArrayList<>();
    private int score = 0;

    public Team(String name, String city, Manager maneger) {
        this.name = name;
        this.city = city;
        this.maneger = maneger;
    }
    
    public void addPlayer(Player player){
        listPlayers.add(player);
    }
    
    public void deletPlayer(Player player){
        listPlayers.remove(player);
    }



    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Manager getManeger() {
        return maneger;
    }

    public ArrayList<Player> getListPlayers() {
        return listPlayers;
    }
    
    public void addScore(int score){
        this.score += score;
    }

    @Override
    public void changeManager(Manager manger) {
        this.maneger = maneger;
    }

    public int getScore() {
        return score;
    }
    
    public int totalCards(){
        int totalCards = 0;
        for (Player player : listPlayers) {
            totalCards += player.getCards();
        }
        return totalCards;
    }
    
    public Player goalScorer(){
        Collections.sort(listPlayers, (player1,player2) -> player2.getGoals() - player1.getGoals());
        return listPlayers.get(0);
    }
}
