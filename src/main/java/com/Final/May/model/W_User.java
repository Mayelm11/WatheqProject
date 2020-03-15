package com.Final.May.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Setter
@Getter
public class W_User implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
 
//  @Column (name="userId")
//  @NotNull(message = " cannot be Empty ")
//  @Size(min=10, max=10)
//   private String userId;
// 
  
  @Column(name = "email", nullable = false, unique=true)
  @Email(message = "email should be a valid email")
private String email;
  
  @Column(name = "phoneNumber" ,nullable = false, unique=true)
  @NotNull(message = "Phone number cannot be empty")
   private String phoneNumber;
  
  @Column(name = "address" ,nullable = false)
  @NotNull(message = " cannot be Empty ")
   private String address;
  
  @Column(name = "password" ,nullable = false)
  @NotNull(message = " cannot be Empty ")
   private String password;


 public W_User() {
  super();
 }//end User()

 public W_User( String email, String phone_number, String address, String password) {
  super();
  this.email = email;
  this.phoneNumber = phone_number;
  this.address = address;
  this.password = password;
 }//end User()


 
 @Override
 public String toString() {
  return "User [email=" + email + ", phoneNumber=" + phoneNumber + ", address="
    + address + ", password=" + password + "]";
 }


  

}

