/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * this has been modified by sidhak on 30 jan at 11:53am
 * @author gills
 * hello this commit is for fetch 
 */
public class Student {
    private int sid ;
    private String name;
    private String Address;

    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }
    

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
  
    
}

