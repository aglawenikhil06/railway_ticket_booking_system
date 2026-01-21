package railwayTicketBooking;

public class Passanger {

	 private String name;
	 private String age;
	 private int seatNum;
	public Passanger(String name, String age, int seatNum) {
		super();
		this.name = name;
		this.age = age;
		this.seatNum = seatNum;
	}
	public Passanger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	@Override
	public String toString() {
		return "Passanger [name=" + name + ", age=" + age + ", seatNum=" + seatNum + "]";
	}
	
}
