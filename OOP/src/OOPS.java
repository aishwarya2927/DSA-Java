public class OOPS {
    public static void main(String[] args) {

//        class and Object
        Pen p = new Pen();    //Pen object created
        p.setColor("Blue");
        System.out.println(p.color);
//         or
        p.color = "Yellow";
        System.out.println(p.color);

        p.setTip(5);
        System.out.println(p.tip);


//        Access Specifier

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aishh";
//      myAcc.password = "adjijif";  ----> Not allowed as it is private
        myAcc.setPassword("absjfrfj");

//        Getters and Setters
        p.setTip(6);
        p.setColor("Orange");
        System.out.println(p.getColor());
        System.out.println(p.getTip());
    }
}

class BankAccount {
  public String username;
 private String password;
 public void setPassword(String pswd){
     password = pswd;
 }
}

//CLass and object
class Pen{
    String color;
    int tip;

//    Getters and Setters
    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float perc ;

    void cal(int phy, int che, int math){
        perc = ( phy + che + math )/3;
    }
}


