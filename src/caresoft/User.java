package caresoft;

public class User {
    protected Integer id;
    protected int pin;
    
    // constructor
    public User(Integer id) {
    	this.id = id;
    }
    
    // set/get ID
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	// set/get pin
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
    

}

