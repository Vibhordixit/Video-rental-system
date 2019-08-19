package VideoRentalSystem;

public class Video {
	String videoName;
	boolean checkout;
	int rating;
	public Video() {
	}
	public Video(String name)
	{
		this.videoName=name;
	}
	public String getName()
	{
		return videoName;
	}
	public void doCheckout()
	{
		this.checkout=true;
			System.out.println("Video "+'"'+ getName()+'"' +" checked out successfully.");
		
	}
	public void doReturn()
	{
		this.checkout=false;
		System.err.println("Video "+'"'+ getName()+'"' +" returned successfully.");
		
	}
	public void receiveRating(int rating)
	{
		this.rating=rating;
	}
	public int getRating()
	{
		return rating;
	}
	public boolean getCheckout()
	{
		return checkout;
	}
}