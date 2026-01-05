publc class ClassExample{
  //data member
  int rollNo = 01;
  String name = "Ambaa";
  //Member Function
  void show(){
    System.out.println("Rollno: "+ rollNo );
    System.out.println("Name: "+ name );}
  public static void main(String []args){
    //object creation
    ClassExample obj = new ClassExample();
    obj.show(); //call method using obj
  }
}  
