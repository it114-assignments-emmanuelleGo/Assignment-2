/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public abstract class PersonBase implements Person, Studying{
    private String name;
    private Integer age;
     
    public PersonBase() { };
    
    public PersonBase(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }
   
    
    public String getName() { return name; }
    public Integer getAge() { return age; }
}
