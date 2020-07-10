package pl.yellowduck.netflix90.resources;

import lombok.Getter;

public class Actor extends Person {

  public Actor(String firstname, String lastname, Gender gender) {
    super(firstname, lastname, gender);
  }

  @Override
  public void introduce() {
    // like this
//    if(Gender.MALE.equals(gender)) {
//      System.out.println("My name is " + firstname + " " + lastname + ". I am actor.");
//    } else {
//      System.out.println("My name is " + firstname + " " + lastname + ". I am actress.");
//    }

    switch (this.gender) {
      case MALE:
        System.out.println("My name is " + getFirstname() + " " + getLastname() + ". I am actor.");
        break;
      case FEMALE:
        System.out.println("My name is " + getFirstname() + " " + getLastname() + ". I am actress.");
        break;
    }
  }

  @Override
  public String toString() {
    return "Actor: " + getFirstname() + " " + getLastname();
  }
}
