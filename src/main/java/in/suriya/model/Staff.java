package in.suriya.model;

public class Staff {
	 private long mobNo;
     private String password;

    public Staff(long mobNo,String password){
    	this.setMobNo(mobNo);
    	this.setPassword(password);
    }

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
     
}
