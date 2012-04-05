package models;  
  
import javax.persistence.Entity;  
import javax.persistence.Table;  
import javax.persistence.Id;  
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import play.db.jpa.Model;  
import play.db.jpa.GenericModel;
  
@Entity
@Table(name = "account")
public class Account extends GenericModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  public String email;
  public String fullname;
  public boolean isAdmin;

  public Account(String email, String fullname, boolean isAdmin) {
    this.email = email;
    this.fullname = fullname;
    this.isAdmin = isAdmin;
  }

} 
