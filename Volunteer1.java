package mylesBAnotherYype;
/*
 * Myles Benson
 * APCS
 * 3/15
 */
public class Volunteer1 extends StaffMember {
	
	//---------------------------------------------------------------
	public Volunteer1 (String eName, String eAddress, String ePhone)
	{
	super (eName, eAddress, ePhone);
	}
	//---------------------------------------------------------------
	// Returns a zero pay value for this volunteer.
	//---------------------------------------------------------------
	public double pay()
	{
	return 0.0;
	} 

}