package com.phonebook.main;



import java.time.LocalDateTime;



public class Organization extends Contact {

String website;



public Organization(String name, String phonebook, LocalDateTime createdat, String website) {
super(name, phonebook, createdat);
this.website = website;
}



@Override
public String toString() {
return "Organization [website=" + website + ", getName()=" + getName() + ", getPhonebook()=" + getPhonebook()
+ ", getCreatedat()=" + getCreatedat() + ", verifier()=" + verifier() + ", getClass()=" + getClass()
+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}






}