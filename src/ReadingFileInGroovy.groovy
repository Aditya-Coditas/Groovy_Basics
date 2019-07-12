class ReadingFileInGroovy {

    def file=new File("file.txt");
    def readFile()
    {
        println file.text+"\n\n"
    }

    def readFileLineByLine()
    {
        println "first Line is "+file.readLines()[0]
        println "Secound Line is "+file.readLines()[1]


        println"\n\n getting all lines from the file"

        file.readLines().each{    // getting each line in the file
            line -> println line
        }
    }

    def readFileWordByWord()
    {
        file.readLines().each {
            line -> line.tokenize().each {
                word -> if(word.matches("data."))
                {
                    println word
                }
             }
        }
    }

    def writeIntoFile()
    {
        def str
        File f=new File("create.txt")
        def list=file.readLines()
        for(def i=0;i<list.size();i++) {
            if(i==0)
            f.write(list[i])
            else
                f << "\n"+list[i]   //<< this will append the data into file
        }
    }

    def fileOperations()
    {
        println "Absolute Path         : "+file.absolutePath
        println "Size of the File      : "+file.size()
        println "Is This a File        : "+"${file.isFile()}"
        println "Is This a Directory   : "+"${file.isDirectory()}"
    }
}
