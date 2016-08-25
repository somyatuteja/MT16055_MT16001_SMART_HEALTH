public class Admin extends Person{
    private int cno;
    private String Qualification;
     Admin(String username,String password,String fname, String lname,String address, String email1,String email2, String photo1, String photo2, String photo3, String aboutme, int cno, String qual)
    {
        super(username, password, fname, lname, address, email1, email2, photo1,  photo2,  photo3, aboutme);
        this.cno=cno;
        this.Qualification=qual;
    }
     String getUsername()
    {
        return username;
    }
     void updateCno(int c)
     {
         this.cno=c;
     }
     void updateQual(String qual)
     {
         this.Qualification=qual;
     
     }
      @Override
     public String toString()
    {
        String s=super.toString();
        StringBuilder st=new StringBuilder();
        st.append(s).append(System.getProperty("line.separator")).append(" cell no: ").append(this.cno).append(" \r\n Qualifications :  ").append(this.Qualification);
        s=st.toString();
        return s;
        
    }
}
