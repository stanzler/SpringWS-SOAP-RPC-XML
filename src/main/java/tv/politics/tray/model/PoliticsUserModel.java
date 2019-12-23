package tv.politics.tray.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registrations")
public class PoliticsUserModel {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "firstname", nullable = false)
  private String firstname;
  
  @Column(name = "lastname", nullable = false)
  private String lastname;
  
  @Column(name = "email", unique = true, nullable = false)
  private String email;

  
  public void set_id(Long ids) {

    id = ids;
  }

  public void set_firstname(String fname) {

    firstname = fname;

  }

  public void set_lastname(String lname) {

    lastname = lname;

  }

  public void set_email(String em) {

    email = em;
  }

  public Long get_id() {

    return id;
  }

  public String get_firstname() {

    return firstname;
  }

  public String get_lastname() {

    return lastname;
  }

  public String get_email() {

    return email;
  }

}
