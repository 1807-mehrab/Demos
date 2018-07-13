package com.revature;

import java.util.List;

import com.revature.beans.Bear;
import com.revature.dao.BearDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BearDao dao = new BearDao();
        List<Bear> bears = dao.getAllBears();
        for (Bear b : bears) {
        	System.out.println(b);
        }
        
        System.out.println(dao.getBear(2));
        dao.feedBear(2, 2, 5);
        System.out.println(dao.getBear(2));
    }
}
