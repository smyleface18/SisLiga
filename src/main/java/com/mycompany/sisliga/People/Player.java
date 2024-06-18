
package com.mycompany.sisliga.People;


public class Player extends Person implements Goal, Assistence, Card{
    
    private String position;
    private int number;
    private int goals = 0;
    private int cards = 0;
    private int assistance = 0;
    
    public Player(String name, String lastName, int age, String position) {
        super(name, lastName, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGoals() {
        return goals;
    }


    public int getCards() {
        return cards;
    }


    public int getAssistance() {
        return assistance;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void addGoal() {
       this.goals += 1; 
    }

    public void addGoal(int goals) {
       this.goals += goals; 
    }
    @Override
    public void addCard() {
        this.cards += 1;
    }

    public void addCard(int cards) {
        this.cards += cards;
    }
    
    @Override
    public void addAssitence() {
        this.assistance += 1;
    }
    
    public void addAssitence(int assistences) {
        this.assistance += assistences;
    }
    
    
}
