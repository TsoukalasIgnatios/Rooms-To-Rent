package RoomsToRent;

public class Room {

private int NumOfPersons;
private String RoomId;
private boolean IsAvailable;
private double RentPrice;
 
 
/**
 * Getter of the property <tt>NumOfPersons</tt>
 *
 * @return Returns the NumOfPersons.
 * 
 */
public int getNumOfPersons()
{
	return NumOfPersons;
}

/**
 * Setter of the property <tt>NumOfPersons</tt>
 *
 * @param NumOfPersons The NumOfPersons to set.
 *
 */
public void setNumOfPersons(int NumOfPersons ){
	this.NumOfPersons = NumOfPersons;
}


/**
 * Getter of the property <tt>RoomId</tt>
 *
 * @return Returns the RoomId.
 * 
 */
public String getRoomId()
{
	return RoomId;
}

/**
 * Setter of the property <tt>RoomId</tt>
 *
 * @param RoomId The RoomId to set.
 *
 */
public void setRoomId(String RoomId ){
	this.RoomId = RoomId;
}

/**
 * Getter of the property <tt>IsAvailable</tt>
 *
 * @return Returns the IsAvailable.
 * 
 */
public boolean getIsAvailable()
{
	return IsAvailable;
}

/**
 * Setter of the property <tt>IsAvailable</tt>
 *
 * @param IsAvailable The IsAvailable to set.
 *
 */
public void setIsAvailable(boolean IsAvailable ){
	this.IsAvailable = IsAvailable;
}



 
/**
 * Getter of the property <tt>RentPrice</tt>
 *
 * @return Returns the RentPrice.
 * 
 */
public double getRentPrice()
{
	return RentPrice;
}

/**
 * Setter of the property <tt>RentPrice</tt>
 *
 * @param RentPrice The RentPrice to set.
 *
 */
public void setRentPrice(double RentPrice ){
	this.RentPrice = RentPrice;
}

public RoomsToRent.Room searchRoom(){
	return null;

}

public void returnBook(){
}

}
