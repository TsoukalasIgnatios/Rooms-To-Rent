

public class Admin {

private int AdminID;
private String Password;
private String Username;
private String addAdvertisment;

 
/**
 * Getter of the property <tt>AdminID</tt>
 *
 * @return Returns the AdminID.
 * 
 */
public int getAdminID()
{
	return AdminID;
}

/**
 * Setter of the property <tt>AdminID</tt>
 *
 * @param AdminID The AdminID to set.
 *
 */
public void setAdminID(int AdminID ){
	this.AdminID = AdminID;
}
 
/**
 * Getter of the property <tt>Username</tt>
 *
 * @return Returns the Username.
 * 
 */
public String getUsername()
{
	return Username;
}

/**
 * Setter of the property <tt>Username</tt>
 *
 * @param Username The Username to set.
 *
 */
public void setUsername(String Username ){
	this.Username = Username;
}

public String getPassword()
{
	return Password;
}
public void setPassword(String Password ){
	this.Password = Password;
}

public Customer addCustomer(){
	return null;
}
public String getAddAdvertisment()
{
	return addAdvertisment;
}

public void setAddAdvertisment(String addAdvertisment ){
	this.addAdvertisment = addAdvertisment;
}
public String login(){
	return "";
}

public boolean checkPass(){
	return false;
}

public boolean setLoginStatus(){
	return false;
}

public void ShowMessage(){
}
}
