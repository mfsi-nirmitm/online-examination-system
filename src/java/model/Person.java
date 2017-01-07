/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author nirmit
 */
public class Person 
{
    private String username;
    private int point;
    public Person(){}
    public Person(String username,int point)
    {
        this.username=username;
        this.point=point;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getUsername()
    {
        return this.username;
    }
    public void setPoint(int point)
    {
        this.point=point;
    }
    public int getPoint()
    {
        return this.point;
    }
    
}
