package models;  
  
import javax.persistence.Entity;  
import javax.persistence.Table;  
import play.db.jpa.Model;  
  
@Entity
@Table(name = "account")
public class Account extends Model {

  public String email;
  public String fullname;
  public boolean isAdmin;

  public Account(String email, String fullname, boolean isAdmin) {
    this.email = email;
    this.fullname = fullname;
    this.isAdmin = isAdmin;
  }

} 
