/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author gelomatias
 */
public class Attribute 
{
    private String name;
    private int pageNum;
    private String value;

    public Attribute(String name, int pageNum, String value) {
        this.name = name;
        this.pageNum = pageNum;
        this.value = value;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getPageNum() 
    {
        return pageNum;
    }

    public void setPageNum(int pageNum) 
    {
        this.pageNum = pageNum;
    }

    public String getValue() 
    {
        return value;
    }

    public void setValue(String value) 
    {
        this.value = value;
    }
    
    
    
}
