package models;  
  
import javax.persistence.Entity;  
import play.db.jpa.Model;  
  
@Entity  
public class Data extends Model {  
  public String url;  
  
  public Data(String url) {  
    this.url= url;  
  }  
} 
