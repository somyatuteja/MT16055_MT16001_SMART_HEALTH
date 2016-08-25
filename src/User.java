
public class User extends Person {
    private int karma;
    private String type;
    User(String username,String password,String fname, String lname,String address, String email1,String email2, String photo1, String photo2, String photo3, String aboutme, int karma, String type)
    {
       super(username, password, fname, lname, address, email1, email2, photo1,  photo2,  photo3, aboutme);
       this.karma=karma;
       this.type=type;
    }
    String getUsername()
    {
        return username;
    }
        @Override
     public String toString()
    {
        String s=super.toString();
        StringBuilder st=new StringBuilder();
        st.append(s).append(System.getProperty("line.separator")).append(" karma: ").append(this.karma).append(" \r\n type : ").append(this.type);
        s=st.toString();
        return s;
        
    }
    
    
    }    

