/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class Professor extends PersonBase {
    private String title;
    
    public Professor (String name, Integer age, String title) {
        super(name, age);
        this.title = title;
    }
    
    public String getName() {
        return title + super.getName();
    }
    
    public String studyFor(String study){
        return study;
    }
}
