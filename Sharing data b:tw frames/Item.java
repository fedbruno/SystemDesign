
public class Item {
private String myName;
private int myNum;

public Item()
	{
		myName = "default";
		myNum = 0;
	}

public Item(String name, int num) {
	super();
	myName = name;
	myNum = num;
}

public String getMyName() {
	return myName;
}

public void setName(String name) {
	this.myName = name;
}

public int getMyNum() {
	return myNum;
}

public void setNum(int num) {
	this.myNum = num;
}


/*
public Item()
	{
		myName = "default";
		myNum = 0;
	} //Item()
// doesn't return an instance

public void setName(String name)
	{
		myName = name;
	}

public String getName()
	{
		return myName;
	}
//getters return value, setters don't

public void setNum(int num)
	{
		myNum = num;
	}

public int getNum()
	{
		return myNum;
	}	
*/
}