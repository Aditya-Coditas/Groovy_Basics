class LoopsInGroovy {

    def uptoLoop()
    {
        0.upto(5)
                {
                    println"In upto "+"${it}"    //${it} will contain count of th loop
                }
    }

    def stepLoop()
    {
        0.step(6,2){    //initialvalue.step(tillNum,Increment val)
            println "In step "+"${it}"
        }
    }

    def timesloop(){
        3.times {
            println "In times "+"${it}"
        }
    }

}
