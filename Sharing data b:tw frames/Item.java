
public class Item {
private int MyUserID;
private String MyName;
private double MyGPA;


public Item () 
{
	MyUserID = 0;
	MyName = "default";
	MyGPA = 0;
	
}

public Item(String name, int ID, double GPA)
{
	super();
	MyUserID = ID;
	MyName = name;
	MyGPA = GPA;
}

public String getMyName() {
	return MyName;
}

public void setMyName() {
	this.setMyName();
}

public int getMyUserID(){
	return MyUserID;
}

public void setMyUserID(){
	this.setMyUserID();
}

public double getMyGPA() {
	return MyGPA;
}

public void setMyGPA(){
	this.setMyGPA();
}

}