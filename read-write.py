from subprocess import *



def readFile():
    with open("test.java", "r") as x:
        writeOuput(x)



def writeOuput(y):
    z = open("test.html", "w")
    for lines in y:
        z.write(lines)
        
    
readFile()
