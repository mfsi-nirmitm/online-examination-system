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
public class Pair 
{
    private String first;
    private String second;
    public Pair(){}
    public Pair(String first , String second)
    {
        this.first=first;
        this.second=second;
    }
    public String getFirst()
    {
       return this.first;
    }
    public void setFirst(String first)
    {
        this.first=first;
    }
    public String getSecond()
    {
        return this.second;
    }
    public void setSecond(String second)
    {
        this.second=second;
    }
}
