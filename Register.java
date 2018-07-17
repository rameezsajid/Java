package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.List;

/**
 * A Register has a list of names,
 * this class takes the information of the name from the Name class.
 *
 *
 * @author Rameez
 */

public class Register implements Iterable<Name>{
	//Fields
	private ArrayList<Name> names;


	//constructors
	/** Default constructor that creates a new ArrayList of names.
	 *
	 * The register will hold a list of names.
	 */
	public Register(){
		names = new ArrayList<>();
	}


	//methods
	/** Adds a name to the register.
	 *
	 * @param name the name that will appear on the register.
	 */
	public void addName(Name name) {
		names.add(name);
	}


	/** Removes name from the register.
	 *
	 * @param index of the arrayList
	 *
	 * @return removes the name.
	 */
	public Name removeName(int index){
		return names.remove(index);
	}


	/** Returns the name from the register.
	 *
	 * @param index of the arrayList
	 *
	 * @return the name from the register.
	 */
	public Name getName(int index){
		return names.get(index);
	}


	/** Returns integer of the size of the register.
	 *
	 * @return size of the register.
	 */
	public int registerSize() {
		return names.size();
	}


	/** Clears the register.
	 *
	 */
	public void clearRegister(){
		names.clear();
	}


	/** Checks if register is empty.
	 *
	 * @return boolean expression stating of register is empty.
	 */
	public boolean isRegisterEmpty(){
		return names.isEmpty();
	}


	/** Returns textual information of the Register.
	 *
	 * @return textual information of the register.
	 */
	public String toString() {
		return "Register:[" + names + "]";
	}


	/** Accepts a string to search player name.
	 * Then searches register by first name to check if
	 * first name exists.
	 *
	 * @param searchFistName accepts a string.
	 *
	 * @return boolean expression stating if fist name exists.
	 */
    public boolean searchRegisterByFirstName(String searchFistName) {
    	searchFistName = "Fred";

        for (Name name : names){
              if (searchFistName.equals(name.getFirstName())){
                return true;
              }
           }
        return false;
     }


	/** This method implements the Iterable interface.
	 *
	 * @return defines iterator method.
	 */
	@Override
	public Iterator<Name> iterator(){
		return names.iterator();
	}


	/** This method sorts the internal collection of the register
	 * into its natural order.
	 *
	 */
	public void sortRegister(){
		Collections.sort(names);
	}


	/** This method counts the the amount of times a character has
	 * Occurred in a string.
	 *
	 * @param ch represents char which accepts char argument
	 *
	 * @return count which is the amount of occurrences it has counted
	 */
	public int countFamilyNameOccurrences(char ch){
		   char locateChar = 'B';
		   String s = "";
		   int count = 0;
		   for(int i = 0; i < s.length(); i++)
		  {
		  if(s.charAt(i) == locateChar)
		  count+=1;
		  }
		return count;
   }

	public boolean containsName(Name n){

		n = new Name();

       for (Name name : names){
              if (n.equals(name.getFullName())){
                return true;
             }
           }
        return false;

	}



}
