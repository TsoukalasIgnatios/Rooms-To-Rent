package RoomsToRent;

import java.util.Date;

public class Book {

private Date DayOfBooking;
private Date DayOfLeaving;
private double MoneyCost;

public String RoomID;
 /**
 * Getter of the property <tt>RoomID</tt>
 *
 * @return Returns the RoomID.
 * 
 */
public String getRoomID()
{
	return RoomID;
}

/**
 * Setter of the property <tt>RoomID</tt>
 *
 * @param RoomID The RoomID to set.
 *
 */
public void setRoomID(String RoomID ){
	this.RoomID = RoomID;
}

/**
 * Getter of the property <tt>DayOfBooking</tt>
 *
 * @return Returns the DayOfBooking.
 * 
 */
public Date getDayOfBooking()
{
	return DayOfBooking;
}

/**
 * Setter of the property <tt>DayOfBooking</tt>
 *
 * @param DayOfBooking The DayOfBooking to set.
 *
 */
public void setDayOfBooking(Date DayOfBooking ){
	this.DayOfBooking = DayOfBooking;
}

 
/**
 * Getter of the property <tt>DayOfLeaving</tt>
 *
 * @return Returns the DayOfLeaving.
 * 
 */
public Date getDayOfLeaving()
{
	return DayOfLeaving;
}

/**
 * Setter of the property <tt>DayOfLeaving</tt>
 *
 * @param DayOfLeaving The DayOfLeaving to set.
 *
 */
public void setDayOfLeaving(Date DayOfLeaving ){
	this.DayOfLeaving = DayOfLeaving;
}

 
/**
 * Getter of the property <tt>MoneyCost</tt>
 *
 * @return Returns the MoneyCost.
 * 
 */
public double getMoneyCost()
{
	return MoneyCost;
}

/**
 * Setter of the property <tt>MoneyCost</tt>
 *
 * @param MoneyCost The MoneyCost to set.
 *
 */
public void setMoneyCost(double MoneyCost ){
	this.MoneyCost = MoneyCost;
}

public void newBook(){

}

public void printReceipt(){

}

public double costCalculation(){
	return 0;

}

public Boolean searchBook(String RoomID){
	return null;
}
}
