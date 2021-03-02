
import java.util.Collection;
import java.util.Iterator;

public class Client {

private String Name;
private String Surname;
private String Phone;
private Collection<Room> roomlist;
private Collection<Book> booklist;
 
/**
 * Getter of the property <tt>Name</tt>
 *
 * @return Returns the Name.
 * 
 */
public String getName()
{
	return Name;
}

/**
 * Setter of the property <tt>Name</tt>
 *
 * @param Name The Name to set.
 *
 */
public void setName(String Name ){
	this.Name = Name;
}

/**
 * Getter of the property <tt>Surname</tt>
 *
 * @return Returns the Surname.
 * 
 */
public String getSurname()
{
	return Surname;
}

/**
 * Setter of the property <tt>Surname</tt>
 *
 * @param Surname The Surname to set.
 *
 */
public void setSurname(String Surname ){
	this.Surname = Surname;
}
 
/**
 * Getter of the property <tt>Phone</tt>
 *
 * @return Returns the Phone.
 * 
 */
public String getPhone()
{
	return Phone;
}

/**
 * Setter of the property <tt>Phone</tt>
 *
 * @param Phone The Phone to set.
 *
 */
public void setPhone(String Phone ){
	this.Phone = Phone;
}

/**
 * Getter of the property <tt>room</tt>
 *
 * @return Returns the room.
 * 
 */
public Collection<Room> getRoom()
{
	return roomlist;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Room> roomIterator(){
	return roomlist.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isRoomEmpty(){
	return roomlist.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsRoom(Room room){
	return this.roomlist.contains(room);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllRoom(Collection<Room> roomlist){
	return this.roomlist.containsAll(roomlist);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int roomSize(){
	return roomlist.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Room[] roomToArray(){
	return roomlist.toArray(new Room[roomlist.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addRoom(Room room){
	return this.roomlist.add(room);
}

/**
 * Setter of the property <tt>room</tt>
 *
 * @param room the room to set.
 *
 */
public void setRoom(Collection<Room> roomlist){
	this.roomlist = roomlist;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeRoom(Room room){
	return this.roomlist.remove(room);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearRoom(){
	this.roomlist.clear();
}

/**
 * Getter of the property <tt>book</tt>
 *
 * @return Returns the book.
 * 
 */
public Collection<Book> getBook()
{
	return booklist;
}
 
/**
 * Returns an iterator over the elements in this collection. 
 *
 * @return an <tt>Iterator</tt> over the elements in this collection
 * @see	java.util.Collection#iterator()
 * 
 */
public Iterator<Book> bookIterator(){
	return booklist.iterator();
}

/**
 * Returns <tt>true</tt> if this collection contains no elements.
 *
 * @return <tt>true</tt> if this collection contains no elements
 * @see	java.util.Collection#isEmpty()
 *
 */
public boolean isBookEmpty(){
	return booklist.isEmpty();
}

/**
 * Returns <tt>true</tt> if this collection contains the specified element. 
 *
 * @param element whose presence in this collection is to be tested.
 * @see	java.util.Collection#contains(Object)
 *
 */
public boolean containsBook(Book book){
	return this.booklist.contains(book);
}

/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllBook(Collection<Book> book){
	return this.booklist.containsAll(book);
}

/**
 * Returns the number of elements in this collection.
 *
 * @return the number of elements in this collection
 * @see	java.util.Collection#size()
 *
 */
public int bookSize(){
	return booklist.size();
}

/**
 * Returns all elements of this collection in an array.
 *
 * @return an array containing all of the elements in this collection
 * @see	java.util.Collection#toArray()
 *
 */
public Book[] bookToArray(){
	return booklist.toArray(new Book[booklist.size()]);
}


/**
 * Ensures that this collection contains the specified element (optional
 * operation). 
 *
 * @param element whose presence in this collection is to be ensured.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean addBook(Book book){
	return this.booklist.add(book);
}

/**
 * Setter of the property <tt>book</tt>
 *
 * @param book the book to set.
 *
 */
public void setBook(Collection<Book> booklist){
	this.booklist = booklist;
}

/**
 * Removes a single instance of the specified element from this
 * collection, if it is present (optional operation).
 *
 * @param element to be removed from this collection, if present.
 * @see	java.util.Collection#add(Object)
 *
 */
public boolean removeBook(Book book){
	return this.booklist.remove(book);
}

/**
 * Removes all of the elements from this collection (optional operation).
 *
 * @see	java.util.Collection#clear()
 *
 */
public void clearBook(){
	this.booklist.clear();
}

public Room searchRoom(){
	return null;

}

public String getClientID(){
	return "";

}

}
