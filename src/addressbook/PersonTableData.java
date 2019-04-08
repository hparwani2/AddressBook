/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Himanshu.Parwani
 */
public class PersonTableData {
    
    
        private SimpleStringProperty Name;
	private SimpleStringProperty email;
	private SimpleIntegerProperty phoneNo;
        private SimpleStringProperty AddressLine1;
        private SimpleStringProperty AddressLine2;
        
        
        public PersonTableData(Person person)
        {
            this.Name = new SimpleStringProperty(person.getName());
            this.email = new SimpleStringProperty(person.getEmail());
            this.phoneNo = new SimpleIntegerProperty(person.getPhoneNo());
            this.AddressLine1 = new SimpleStringProperty(person.getAddressLine1());
            this.AddressLine2 = new SimpleStringProperty(person.getAddressLine2());
        }
    
        public String getName()
        {
            return Name.get();
        }
        public String getEmail()
        {
            return email.get();
        }
        public String getAddressLine1()
        {
            return AddressLine1.get();
        }
        public String getAddressLine2()
        {
            return AddressLine2.get();
        }
         public int getPhoneno()
        {
            return phoneNo.get();
        }
        
}
