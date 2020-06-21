package net.manage.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String address;
    private String emailId;
    private Long mobileNum;
    
    
    public Employee() {
        
        // TODO Auto-generated constructor stub
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the emailId
     */
    public String getEmailId() {
        return emailId;
    }
    /**
     * @param emailId the emailId to set
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    /**
     * @return the mobileNum
     */
    public Long getMobileNum() {
        return mobileNum;
    }
    /**
     * @param mobileNum the mobileNum to set
     */
    public void setMobileNum(Long mobileNum) {
        this.mobileNum = mobileNum;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address
                + ", emailId=" + emailId + ", mobileNum=" + mobileNum + "]";
    }
    
    

}
