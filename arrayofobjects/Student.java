/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markcollection;

/**
 *
 * @author uwilljo
 */
public class Student {
    public int id;
    public String name;
     private int [] marks;
  
    // Student class constructor
    Student(String name,int [] marks)
    {
        this.name = name;
        this.marks = marks;
    }
    public double getAverage(){
        double avg = 0;
        int sum = 0;
        
        for(int i:marks){
            sum+=i;
        }
        
        avg = sum/marks.length;
        
        return avg;
    }
    
    //int double
    
    public double getGrade(){
        
        double avg = getAverage();
        
        double grade = 0;
        
        if(avg>=90)
            grade = 1.1;
        else if(avg>= 70 && avg <90)
            grade = 2.1;
        else if (avg >=50 && avg <70)
            grade = 2.2;
        else 
            grade = 3.0;
        
        return grade;
            
    }
  
    // display() method to display
    // the student data
    public void display()
    {
        System.out.println("Student Avg mark is: " + getAverage() + " "
                           + "and Student name is: "
                           + name);
        System.out.println();
    }
}
