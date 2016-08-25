
import java.util.ArrayList;
import java.util.Iterator;

public class Manage {
  static ArrayList<User> arruser=new ArrayList<>();  
  static ArrayList<Admin> arradmin=new ArrayList<>(); 
  static ArrayList<Moderator> arrmod=new ArrayList<>();  
static ArrayList<Person> arrdelper=new ArrayList<>();
 public void createUser(String username,String password,String fname, String lname,String address, String email1,String email2, String photo1, String photo2, String photo3, String aboutme, int karma,String type)
 {
     User u1=new User(username, password, fname, lname, address, email1, email2, photo1,  photo2,  photo3, aboutme,karma,type);
     arruser.add(u1);
 } 
 public void createAdmin(String username,String password,String fname, String lname,String address, String email1,String email2, String photo1, String photo2, String photo3, String aboutme, String qual, int cno)
 {
     Admin a1=new Admin(username, password, fname, lname, address, email1, email2, photo1,  photo2,  photo3, aboutme,cno,qual);
     arradmin.add(a1);
 } 
 public void createMod(String username,String password,String fname, String lname,String address, String email1,String email2, String photo1, String photo2, String photo3, String aboutme, String qual, int cno)
 {
     Moderator m1=new Moderator(username, password, fname, lname, address, email1, email2, photo1,  photo2,  photo3, aboutme,cno,qual);
     arrmod.add(m1);
 } 
 
  public boolean checkUsername(String un)
  {  
 Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{    
   User u=(User) iu.next();
   if(un.equals(u.getUsername()))
    {
        return true;     
    }
}
while(ia.hasNext())
{
   Admin a=(Admin) ia.next();
   if(un.equals(a.getUsername()))
    
   {
       System.out.println("called fun"+a.getUsername());
        return true;
    }
}
while(im.hasNext())
{
   Moderator m=(Moderator) im.next();
   if(un.equals(m.getUsername()))
    {
        System.out.println("called fun"+m.getUsername());
        return true;
    }
}
return false;
  }
 public String getPassword(String un)
 {
Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{    
   User u=(User) iu.next();
   if(un.equals(u.getUsername()))
    {
        return u.password;    
    }
}
while(ia.hasNext())
{
   Admin a=(Admin) ia.next();
   if(un.equals(a.getUsername()))
    
   {
       return a.password;
    }
}
while(im.hasNext())
{
   Moderator m=(Moderator) im.next();
   if(un.equals(m.getUsername()))
    {
       return m.password;
    }
}
return null;    
 }
 String delAccount(String un)
 {
     Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{    
   Person u=(User) iu.next();
   if(un.equals(u.username))
    {
       arrdelper.add(u);
       iu.remove();
       return "SUCCESSFULLY DELETED";
    }
}
while(ia.hasNext())
{
   Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {
arrdelper.add(a);
       ia.remove();     
       return "SUCCESSFULLY DELETED";
    }
}
while(im.hasNext())
{
   Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {
       arrdelper.add(m);
       im.remove(); 
       return "SUCCESSFULLY DELETED";
    }
}
return "THERE WAS SOME ERROR! \n TRY AGAIN";
}
  String updateFirstName(String un,String newdata)
 {
     Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{    
   Person u=(User) iu.next();
   if(un.equals(u.username))
    {
       u.fname=newdata;
       return "SUCCESSFULLY UPDATED";
    }
}
while(ia.hasNext())
{
   Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {
               a.fname=newdata;
               return "SUCCESSFULLY UPDATED";
    }
}
while(im.hasNext())
{ Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {m.fname=newdata; 
      return "SUCCESSFULLY UPDATED"; }
}return "THERE WAS SOME ERROR! \n TRY AGAIN";}
  String updateLastName(String un,String newdata)
 {Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{    
   Person u=(User) iu.next();
   if(un.equals(u.username))
    { u.lname=newdata;
       return "SUCCESSFULLY UPDATED";}}
while(ia.hasNext())
{
   Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {  a.lname=newdata;
               return "SUCCESSFULLY UPDATED";  }}
while(im.hasNext())
{
   Person m=(Moderator) im.next();
   if(un.equals(m.username))
    { m.lname=newdata; 
      return "SUCCESSFULLY UPDATED"; }}
return null;
}
  String changeAddress(String un,String newdata)
 {
     Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{  Person u=(User) iu.next();
   if(un.equals(u.username))
    { u.address=newdata;
       return "SUCCESSFULLY UPDATED"; }
}
while(ia.hasNext())
{ Person a=(Admin) ia.next();
   if(un.equals(a.username))
           { a.address=newdata;
               return "SUCCESSFULLY UPDATED";    }}
while(im.hasNext())
{ Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {m.address=newdata; 
      return "SUCCESSFULLY UPDATED";    }}
return "THERE WAS SOME ERROR! \n TRY AGAIN";}
  String updatePassword(String un,String newdata)
 { Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{  Person u=(User) iu.next();
   if(un.equals(u.username))
    { u.password=newdata;
       return "SUCCESSFULLY UPDATED";
    }
}
while(ia.hasNext())
{
   Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {
               a.password=newdata;
               return "SUCCESSFULLY UPDATED";    }}
while(im.hasNext())
{ Person m=(Moderator) im.next();
   if(un.equals(m.username))
    { m.password=newdata; 
      return "SUCCESSFULLY UPDATED"; }}
return "THERE WAS SOME ERROR! \n TRY AGAIN";}
  String updateAboutMe(String un,String newdata)
 { Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{  Person u=(User) iu.next();
   if(un.equals(u.username))
    { u.aboutme=newdata;
       return "SUCCESSFULLY UPDATED";}}
while(ia.hasNext())
{
   Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {
               a.aboutme=newdata;
               return "SUCCESSFULLY UPDATED";}}
while(im.hasNext())
{ Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {m.aboutme=newdata; 
      return "SUCCESSFULLY UPDATED";
    }} return "THERE WAS SOME ERROR! \n TRY AGAIN";}
  String updatePic(String un,String newdata)
 {
     Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{ Person u=(User) iu.next();
   if(un.equals(u.username))
    {u.photo1=newdata;
       return "SUCCESSFULLY UPDATED"; }}
while(ia.hasNext())
{ Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {  a.photo1=newdata;
               return "SUCCESSFULLY UPDATED";}}
while(im.hasNext())
{Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {m.photo1=newdata; 
      return "SUCCESSFULLY UPDATED";}} return "THERE WAS SOME ERROR! \n TRY AGAIN"; }
  String updateEmail(String un,String newdata)
 {Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{  Person u=(User) iu.next();
   if(un.equals(u.username))
    { u.email2=newdata;
     return "SUCCESSFULLY UPDATED"; }}
while(ia.hasNext())
{ Person a=(Admin) ia.next();
   if(un.equals(a.username))
           { a.email2=newdata;
               return "SUCCESSFULLY UPDATED";  }}
while(im.hasNext())
{ Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {m.email2=newdata; 
      return "SUCCESSFULLY UPDATED"; }
} return "THERE WAS SOME ERROR! \n TRY AGAIN";}
  String getType(String un)
  {
      Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{    
   Person u=(User) iu.next();
   if(un.equals(u.username))
    {
       return "user";
    }
}
while(ia.hasNext())
{
   Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {
              return "admin";
    }
}
while(im.hasNext())
{
   Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {
     return "mod";
    }
}
return null;
  }
String updateNumber(String un, int cno)
{    String type=this.getType(un);
    if(type.equals("USER"))
    {        return "YOU DONT HAVE CELL NO.";}
     if(type.equals("ADMIN"))
     {  Iterator ia=arradmin.iterator();
         while(ia.hasNext())
{   Admin a=(Admin) ia.next();
   if(un.equals(a.username))    {
     a.updateCno(cno);
     return "SUCCESSFULLY UPDATED";}} }
      if(type.equals("MOD"))
     {  Iterator im=arrmod.iterator();
         while(im.hasNext())
{ Moderator a=(Moderator) im.next();
   if(un.equals(a.username))
           {
     a.updateCno(cno);
     return "SUCCESSFULLY UPDATED";
    }}}      return null;}

String updateQual(String un, String qual)
{ String type=this.getType(un);
    if(type.equals("USER"))
    {return "YOU DONT HAVE QUALIFICATIONS"; }
     if(type.equals("ADMIN"))
     {Iterator ia=arradmin.iterator();
         while(ia.hasNext())
{ Admin a=(Admin) ia.next();
   if(un.equals(a.username))
           {     a.updateQual(qual);
     return "SUCCESSFULLY UPDATED";}} }
      if(type.equals("MOD"))
     { Iterator im=arrmod.iterator();
         while(im.hasNext())
{ Moderator a=(Moderator) im.next();
   if(un.equals(a.username))
           { a.updateQual(qual);
     return "SUCCESSFULLY UPDATED";
    }}     }
return "THERE WAS SOME ERROR! \n TRY AGAIN";}

String getPerson(String un)
{
    Iterator iu=arruser.iterator();
Iterator ia=arradmin.iterator();
Iterator im=arrmod.iterator();
while(iu.hasNext())
{    
   Person u=(User) iu.next();
   if(un.equals(u.username))
    {
       return u.toString();
       
    }
}
while(ia.hasNext())
{
   Person a=(Admin) ia.next();
   if(un.equals(a.username))
           {
               return a.toString();
    }
}
while(im.hasNext())
{
   Person m=(Moderator) im.next();
   if(un.equals(m.username))
    {
     return m.toString();
    }
}
return null;
}

}