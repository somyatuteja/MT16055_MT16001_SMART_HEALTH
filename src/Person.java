
public class Person {
   protected String username;
   protected String password;
   protected String fname;
   protected String lname;
   protected String address;
   protected String email1;
   protected String email2;
   protected String photo1;
   protected String photo2;
   protected String photo3;
   protected String aboutme;
    Person(String username,String password,String fname, String lname,String address, String email1,String email2, String photo1, String photo2, String photo3, String aboutme)
   {
       this.username=username;
     this.aboutme=aboutme;
     this.address=address;
     this.email1=email1;
     this.fname=fname;
     this.lname=lname;
     this.password=password;
     this.photo1=photo1;
     this.photo2=photo2;
     this.photo3=photo3;
     this.email2=email2;
   }
    @Override
    public String toString()
    {
        StringBuilder s=new StringBuilder();
        s.append("Username : ").append(this.username).append("\r\n Password : ").append(this.password).append("\r\n Name : ").append(this.fname).append(" ").append(this.lname).append("\r\n Address : ").append(this.address).append("\n Primary email : ").append(this.email1).append("\n Secondary email : ").append(this.email2).append(" \n About Me : " ).append(this.aboutme);
                return s.toString();
    }
   }

