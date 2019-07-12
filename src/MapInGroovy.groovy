class MapInGroovy {
    def map=[:]

    def addInMap()
    {
        map.put(1,"data1")
        map.put(2,"data2")
        map.put(3,"data3")
        map[4]="data4"
        map.length="data5"
        map<<[6:"data6"]
        map.abc="data7"

    }

    def displayMap()
    {
        println map
    }

    def retriveFromMap()
    {
        println map["length"]
        println map[2]

        println map.abc

        println map.get(6)

    }
}
