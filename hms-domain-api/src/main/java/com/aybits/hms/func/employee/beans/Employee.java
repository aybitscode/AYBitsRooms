package com.aybits.hms.func.employee.beans;

import com.aybits.hms.arch.util.HMSJSONParser;
import com.aybits.hms.func.common.beans.ContactDetails;
import com.aybits.hms.func.common.beans.HMSAddress;
import com.aybits.hms.func.identificationparam.beans.IdentificationParam;
import com.aybits.hms.func.common.beans.Status;
import com.aybits.hms.func.login.beans.LoginAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;

@JsonRootName("employee")
public class Employee {
    @JsonProperty("emp_id")
        private String empId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("login_attributes")
        private LoginAttributes loginAttributes;
    @JsonProperty("emp_role")
        private Role role;
    @JsonProperty("contact_details")
        private ContactDetails contactDetails;
    @JsonProperty("employee_address")
        private HMSAddress employeeAddress;
    @JsonProperty("identification_param")
        private IdentificationParam identificationParam;
    @JsonProperty("employee_status")
        private Status employeeStatus;
    @JsonProperty("date_modified")
        private Date dateModified;
    @JsonProperty("date_created")
        private Date dateCreated;
    @JsonProperty("date_deleted")
        private Date dateDeleted;
    @JsonProperty("hms_hotel_id")
        private Integer hotelId;

    public Employee(){
        super();
    }

    public Employee(String empId, LoginAttributes loginAttributes, Role role,
                    ContactDetails contactDetails, HMSAddress employeeAddress,
                    IdentificationParam identificationParam,
                    Status employeeStatus, Date dateModified, Date dateCreated, Date dateDeleted,
                    Integer hotelId) {
        this.empId = empId;
        this.loginAttributes = loginAttributes;
        this.role = role;
        this.contactDetails = contactDetails;
        this.employeeAddress = employeeAddress;
        this.identificationParam = identificationParam;
        this.employeeStatus = employeeStatus;
        this.dateModified = dateModified;
        this.dateCreated = dateCreated;
        this.dateDeleted = dateDeleted;
        this.hotelId = hotelId;
    }

    public String getEmpId() {
            return empId;
        }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public HMSAddress getHMSAddress() {
        return employeeAddress;
    }

    public void setHMSAddress(HMSAddress hmsAddress) {
        this.employeeAddress = hmsAddress;
    }

    public IdentificationParam getIdentificationParam() {
        return identificationParam;
    }

    public void setIdentificationParam(IdentificationParam identificationParam) {
        this.identificationParam = identificationParam;
    }

    public LoginAttributes getLoginAttributes() {
        return loginAttributes;
    }

    public void setLoginAttributes(LoginAttributes loginAttributes) {
        this.loginAttributes = loginAttributes;
    }

    public HMSAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(HMSAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Status getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(Status employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return HMSJSONParser.convertObjectToJSON((Object)this);
    }
}
