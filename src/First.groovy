class First {
    def name                                   //dynamic variable binding
    int num                                    //static variable binding
    static void main(String[] arg)
    {
        int c,l=0,f=0;
        Scanner sc=new Scanner(System.in)
        while(1)
        {
            println "\n 1. Objects In Groovy " +
                    "\n 2. Loops In Groovy " +
                    "\n 3. Array In Groovy " +
                    "\n 4. List In Groovy " +
                    "\n 5. Map In Groovy" +
                    "\n 6. Files In Groovy" +
                    "\n 7. Exit"
            println "Enter Your Choice "
            c=sc.nextInt()
            switch(c)
            {
                case 1:println "==========Object Creation=========="
                       def fi=new First()
                       fi.setName("Aditya")
                       fi.setNum(10)
                       println "Hello  "+fi.getName()+" Your no is "+fi.getNum()
                    println"-------------------------------------"
                       println "Setting Up Values Using getters and setters"
                       def stud1=new Student()
                       stud1.setName("Ron")
                       stud1.setAddress("Kothroud Pune")
                       stud1.setRoll_no(1)
                       stud1.display()
                    println"-------------------------------------"
                       println "Setting Up Values Using Constructor "
                    // def stud2=new Student(roll_no: 2,name: "Chang",address: "Koregaon park") // Named Argument Constructor
                       def stud2=new Student(2,"chang","koreganpark ")
                       stud2.display()
                       println"==================================="
                    break
                case 2:println "==========Loops In Groovy =========="
                        LoopsInGroovy loops=new LoopsInGroovy()
                        while(l<4) {
                            println "\n 1. Up to Loop" +
                                    "\n 2. Step Loop" +
                                    "\n 3. Times Loop" +
                                    "\n 4. Exit from loops\n"
                            println "Enter Your Choice "
                            l = sc.nextInt()
                            switch (l)
                            {
                                case 1:loops.uptoLoop()
                                       println"-------------------------------------"
                                       break
                                case 2:loops.stepLoop()
                                       println"-------------------------------------"
                                       break;
                                case 3:loops.timesloop()
                                       println"-------------------------------------"
                                       break
                            }
                        }
                     println"==================================="
                    break
                case 3: println "==========Arrays In Groovy =========="
                        ArraysInGroovy a=new ArraysInGroovy()
                        a.setarray1()
                        println "size of 1st array"+ a.getArray1().length
                        println a.getArray1()
                        println "size of 2nd array"+a.getArray2().length
                        println a.getArray2()
                        println "size of 3rd array"+a.getArray3().size()
                        println a.getArray3()
                        println "size of 4th array"+a.getArray4().length
                        println a.getArray4()
                        println "The minimum value is "+a.getArray4().min()
                        println "The maximum value is "+a.getArray4().max()
                        println"=========================================="
                        break
                case 4:println "============List In Groovy ==============="
                       ListInGroovy li=new ListInGroovy()
                       li.addValue()
                       li.display()
                       li.retriveValFromList()
                       println"==========================================="
                       break
                case 5:println "============Map In Groovy ==============="
                       MapInGroovy map=new MapInGroovy()
                       map.addInMap()
                       map.displayMap()
                       map.retriveFromMap()
                       println"==========================================="
                       break
                case 6:println "============Map In Groovy ==============="
                       ReadingFileInGroovy file=new ReadingFileInGroovy()
                       while(f<6)
                       {
                           println "\n 1. Read File " +
                                   "\n 2. Read File Line By Line " +
                                   "\n 3. Read File Word By Word " +
                                   "\n 4. Copy File" +
                                   "\n 5. File Operations" +
                                   "\n 6. Exit From File\n"
                           println"Enter Your Choice "
                           f=sc.nextInt()
                           switch(f)
                           {
                               case 1:file.readFile()
                                      println"-------------------------------------"
                                      break
                               case 2:file.readFileLineByLine()
                                      println"-------------------------------------"
                                      break
                               case 3:file.readFileWordByWord()
                                      println"-------------------------------------"
                                      break
                               case 4:file.writeIntoFile()
                                      println"-------------------------------------"
                                      break
                               case 5:file.fileOperations()
                                      println"-------------------------------------"
                                      break
                           }
                       }
                      println"==========================================="
                    break
                case 7:System.exit(0)

            }
        }
    }
}
