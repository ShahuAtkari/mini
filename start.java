/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author integral-computer
 */
public class start {
     public static void main (String [] args)
    {
  splash_form sm= new splash_form();
    sm.setVisible(true);
    Newlogin nl = new Newlogin();
   
   
    try 
    {
    for(int i=0;i<=100;i++)
    {
    Thread.sleep(99);
   
    if(i==100)
    {
     nl.setVisible(true);
     sm.setVisible(false);
    }
    }
      }
    catch(Exception e)
    {
    }
    }
}
