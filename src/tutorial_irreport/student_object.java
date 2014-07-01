/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_irreport;

/**
 *
 * @author Ulil
 */
public class student_object {
    String student_id;
    String student_name;
    String student_class;
    //you must create set parameter procedure and get parameter function, so the report wouldn't get error
    public void setstudent_id(String set)
    {
        student_id=set;
    }   
    public String getstudent_id()
    {
        return student_id;
    }
    
    public void setstudent_name(String set)
    {
        student_name=set;
    }
    
    public String getstudent_name()
    {
        return student_name;
    }
    
    public void setstudent_class(String set)
    {
        student_class=set;
    }
    
    public String getstudent_class()
    {
        return student_class;
    }
    
}
