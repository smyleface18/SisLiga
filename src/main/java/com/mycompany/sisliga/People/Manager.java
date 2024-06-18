
package com.mycompany.sisliga.People;



public class Manager extends Person{
    
    public Manager(String name, String lastName, int age) {
        super(name, lastName, age);
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
