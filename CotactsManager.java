
 class Contact{
	 
 		
		   String name;
		   String email;
		   String phoneNumber;
		

 }


class CotactsManager {
		   Contact [] myFriends;
		   int friendsCount;

		      CotactsManager(){
		      friendsCount = 0;
		      myFriends = new Contact[500];
		   }
		      
		   void addContact(Contact contact){
		      myFriends[friendsCount] = contact;
		      friendsCount++;
		   }

		   Contact searchContact(String searchName){
		      for(int i=0; i<friendsCount; i++){
		         if(myFriends[i].name.equals(searchName)){
		            return myFriends[i];
		         }
		      }
		      return null;
		   }

	
public static void main(String [] args){
		  
		   CotactsManager myCotactsManager = new CotactsManager();
		   
		   
		    Contact EmpMaria = new Contact();
		    EmpMaria.name = "Maria";
		    EmpMaria.phoneNumber = "0012223333";
		    myCotactsManager.addContact(EmpMaria);
		   

		    Contact EmpMagdalena = new Contact();
		    EmpMagdalena.name = "Elena";
		    EmpMagdalena.phoneNumber = "987654321";
		    myCotactsManager.addContact(EmpMagdalena);
		    
		    
		   
		   Contact EmpMarta = new Contact();
		   EmpMarta.name = "Marta";
		   EmpMarta.phoneNumber = "5554440001";
		   myCotactsManager.addContact(EmpMarta);

		   
		   Contact result = myCotactsManager.searchContact("Maria");
		   System.out.println(result.phoneNumber);

		}
}


