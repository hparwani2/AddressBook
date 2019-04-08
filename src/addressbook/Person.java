/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author Himanshu.Parwani
 */
public class Person {
    private int ID=0;
    private String Name;
    private String Email;
    private int PhoneNo;
    private String AddressLine1;
    private String AddressLine2;
    
    public Person(String Name,String Email,int PhoneNo,String AddressLine1,String AddressLine2)
    {
        this.Name=Name;
        this.Email=Email;
        this.PhoneNo=PhoneNo;
        this.AddressLine1=AddressLine1;
        this.AddressLine2=AddressLine2;  
    }
    public String getName()
    {
        return this.Name;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public int getPhoneNo()
    {
        return this.PhoneNo;
    }
    public String getAddressLine1()
    {
        return this.AddressLine1;
    }
    public String getAddressLine2()
    {
        return this.AddressLine2;
    }
    
}
