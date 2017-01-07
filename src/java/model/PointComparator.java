/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Comparator;

/**
 *
 * @author nirmit
 */
public class PointComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2) 
    {
        int point1=o1.getPoint();
        int point2=o2.getPoint();
        return point2-point1;
    }
    
}
