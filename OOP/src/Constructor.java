public class Constructor {
    public static void main(String[] args) {
//        Parameterised Constructor
        Students s1 = new Students("Aishh", 5);
        System.out.println(s1.name);
        System.out.println(s1.roll);


//        Default constructor
//        Student s2 = new Student();
    }




}

class Students {
    String name;
    int roll;

    Students(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
//    Students(){
//        System.out.println("This is default constructor");
//    }


}
