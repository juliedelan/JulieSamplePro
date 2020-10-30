package JJavaJuliePro1;

import java.util.*;

// Permission object class
class Permission {
	  public Permission() {}
	  public Permission(String role, String name, boolean active) {
	    this.role = role;
	    this.name = name;
	    this.active = active;
	  }

	  public String role;
	  public String name;
	  public boolean active;
	}// end Permission class


//User object class
	class User {
	  public User() {}
	  public User(int id, String name, List<String> roles) {
	    this.id = id;
	    this.name = name;
	    this.roles = roles;
	  }
	  public int id;
	  public String name;
	  public List<String> roles;
	}// end user class

	class Authorization {
	  public List<Permission> permissions; // List of Permission object
	  public List<User> users;  // List of Users object

	  public Authorization(List<Permission> permissions, List<User> users) {
	    this.permissions = permissions;
	    this.users = users;
	  }

	  public String[] listPermissions(int userId) {
	    // TODO: fill this out!
		  List<String> myUserRoles;
		  List<String> myUserPermissions; // string to store permissions
	    int user_id=userId ;
	    myUserRoles= users.get(user_id).roles;// store all roles for this user ID
	     int m= myUserRoles.size();
	    if( m == 0)
	    {
	    System.out.println("This user has No roles assigned");
	    return null;
	    }//end if
	    	      
	    else 
	    {
	    	  int j =0; //permission list index
	    	  
	    	  for (int k =0; k<myUserRoles.size(); k++) 
	    	  {
	    		  String s= myUserRoles.get(k).toString(); // user has one role
	    	      int i =0;
	    	      while ( i<permissions.size())
	    	      {// itterate through permission object list
	    	    	 Permission P= permissions.get(i); // get each permissin object
	    	    	 if (P.role == s) 
	    	    	 {  // if find the searching role
	    	    		 myUserPermissions.add(j, (P.name.toString())); //get the permission name
	    	    		     	 j++;
	    	    		     	 i++;
	    	    	 }//end if
	    	    	 else {
	    	    		 i++;
	    	    	 	  }//end else
	    	      }// end while
	    	  }// end for 
	    	  
	    	  return myUserPermissions;
	    	  
	    }//end else
	         
	  }//end List permission method

	  public boolean checkPermitted(String permissionName, int userId) {
	    // TODO: fill this out!
	    throw new RuntimeException("Please remove this when you implement this function");
	  	}
	}