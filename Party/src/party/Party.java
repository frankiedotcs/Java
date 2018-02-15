/*
Name: Elizabeth Ruttenbur
Assignment: Arrays... UGH

 */

package party;

/**
 *
 * @Elizabeth Ruttenbur
 */
public class Party {
 
    private int maxGuests = 0;
    private String host;
    String [] guests;
    private boolean isOnList = false;
    String partyGuest;
   
    
public Party(int maxGuests, String host){
       this.maxGuests = maxGuests;
       this.host = host;
       
    }

public String getHost(){
    return host;
    
}

public void setHost(String host){
    this.host = host;
}


public String addGuest(String partyGuest){
       guests = new String [3];
       guests[0] = this.partyGuest;
       guests[1] = this.partyGuest;
       guests[2] = this.partyGuest;
       
       
        
    return this.partyGuest;   
}
public boolean isOnList(boolean isOnList, int i){


    for ( i = 0; i < guests.length; i++){
    
        if (guests[ i ]  == this.partyGuest)
               
        return isOnList = true;     
           
        else
        

return isOnList = false;}

}
//*****************************************************************************    
public void printParty(String guests, boolean isOnList){
    
    System.out.println("Guest list for David Beckham's party: ");
    if (isOnList = false);
    System.out.println(guests + "is already on the list.");
    System.out.println(guests);
}
}
