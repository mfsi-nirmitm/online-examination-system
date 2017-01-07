/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.List;

/**
 *
 * @author nirmit
 */
public class Exam 
{
    private List<String> ans;
    public void setAns(List<String> ans)
    {
        this.ans=ans;
    }
    public List<String> getAns()
    {
        return this.ans;
    }
    
    private String ques;
    public void setQues(String ques)
    {
        this.ques=ques;
    }
    public String getQues()
    {
        return this.ques;
    }
}
