class ListInGroovy {
    def list1=[]
    def list2=new ArrayList<String>()
    def list3=[1,2,3,4,5,6,7,8]

    def addValue()
    {
        list2.add("data1")
        list2.add("data2")
        list2.add("data3")

        list1.add(1)
        list1.add("data")
        list1.add(44.44)

        list3 << 9
        list3 << 10
        list3 <<11

        list2.push("data4")
        list2.push("data5")

        list2.putAt(3,"data6")

    }

    def retriveValFromList()
    {
        println "In list1 The 2nd value is "+list1[1]

        println "In list2 The 2nd value is "+list2.get(1)

        println "In list3 The 2nd value is "+list3.getAt(1)

        println "In list3 The 7nd value is "+list3[-5]   // it will fetch value at
                                                         //list3[list3.size()+(negative value)]
    }

    def display()
    {
        println list1
        println list2
        println list3
    }
}
