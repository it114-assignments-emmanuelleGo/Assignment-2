/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ejgo
 */
public class Student extends PersonBase{
    private String grade;
    private String id;
    
    public Student() { }
    
    public Student(String name, Integer age){
        super(name, age);
    }
    
    public Student(String name, Integer age, String grade){
        super(name, age);
        this.grade = grade;
    }
    
    public Student(String name, Integer age, String grade, String id){
        super(name, age);
        this.grade = grade;
        this.id = id;
    }
    
    public String getGrade() { return grade; }
    
    public String getID() { return id; }
    
    public String studyFor(String study){
        return study;
    }
}
