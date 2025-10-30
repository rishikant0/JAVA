public class Access{
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.name ="Rishikant kumar";
        System.err.println(myAcc.name);
        myAcc.setpass("risjoaQ@c");
       
    }
}


class BankAccount{
    public String name;
    private  String Password; 
    void setpass(String pass){
        Password = pass;
    }
}