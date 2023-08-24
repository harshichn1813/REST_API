package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetail")

public class Details {
@Id
private int id;
private String name;
private String stream;
private String mail;
public Details()
{
	super();
}
public Details(int id,String name,String stream,String mail)
{
	this.id = id;
	this.name = name;
	this.stream = stream;
	this.mail= mail;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public String getMailid() {
	return mail;
}
public void setMailid(String mail) {
	this.mail = mail;
}

}