class Student {
    int roll_no
    String name
    String address

    Student(){}

    Student(roll_no,name,address)   // whenever we can define constructor then we cannot a
                                   // ble to implement default constructor
    {
        this.roll_no=roll_no
        this.name=name
        this.address=address
    }

     def display()
     {
         println roll_no+"\n"+name+"\n"+address
     }

}
