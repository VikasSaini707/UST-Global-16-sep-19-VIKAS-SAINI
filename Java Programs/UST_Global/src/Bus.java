
public class Bus {
	int seats;
	String color;
	
	Bus(int seats,String color)
	{
		this.seats=seats;
		this.color=color;
	}
	
	Bus()
	{
		this(40);
	}
	Bus(int seats)
	{
		this(seats,"red");
	}
	
	void details()
	{
		System.out.println("Welcome to redbus, but seat capacity is "+seats+" and color is "+color);
	}
}
