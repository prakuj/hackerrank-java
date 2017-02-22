

import java.util.*;
class Sports{

   String get_name()
   {
      return "Generic Sports";
   }
   void get_number_of_team_members()
   {
      System.out.println("Each team has n players in "+get_name());
   }
}

class Soccer extends Sports
{
   String get_name()
   {
      return "Soccer Class";
   }
   //Complete the code
    void get_number_of_team_members()
        {
        System.out.println("Each team has 11 players in "+get_name());
    }
}
public class Main
{
   
   public static void main(String []args)
   {
      Sports C1=new Sports();
      Soccer C2=new Soccer();
      System.out.println(C1.get_name());
      C1.get_number_of_team_members();
      System.out.println(C2.get_name());
      C2.get_number_of_team_members();
   }
}

}

public class Solution{
    
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
