/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Hi
 */
public class Studenttester {
    public static void main(String[] args) {
        Student [] sl= new Student[5];
        
        sl[0]= new Student();
        sl[0].setName("Amandeep");
        sl[1]= new Student();
        sl[1].setName("Amandeep1");
        sl[2]= new Student();
        sl[2].setName("Amandeep2");
        sl[3]= new Student();
        sl[3].setName("Amandeep3");
        sl[4]= new Student();
        sl[4].setName("Amandeep4");
    
        for(int i=0;i<sl.length;i++)
        System.out.println(sl[i].getName());
    
}
}
