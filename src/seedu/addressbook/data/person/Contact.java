package seedu.addressbook.data.person;


/**
 * 
 * Person's Contact.
 * (Parent class for Address, Email and Phone)
 * 
 */

public class Contact {
    
    public final String value;
    private boolean isPrivate;

    /**
     * Create a contact.
     */
    
    public Contact(String contact, boolean isPrivate){
        this.isPrivate = isPrivate;
        contact = contact.trim();
        this.value = contact;
    }
    
    @Override
    public String toString(){
        return value;
    }
    
    @Override
    public boolean equals(Object other){
        return other == this || (other instanceof Contact) 
                && this.value.equals(((Contact) other).value);
    }
    
    @Override
    public int hashCode(){
        return value.hashCode();
    }
    
    public boolean isPrivate(){
        return isPrivate;
    }
    
}
