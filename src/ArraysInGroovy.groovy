class ArraysInGroovy {

    def array1=new String[3]

    String[] array2=["one","two","three"]

    def  array3=["data1","data2","data3","data4"] as String[]

     def setarray1()
     {

         array1[0]="first"
         array1.putAt(1,"secound")
         array1[2]="third"
     }

    def array4=[1,10,44,55,2,45,100] as Integer[]

}
