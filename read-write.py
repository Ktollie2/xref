from subprocess import *



def createFile():
    with open("test.java", "r") as x:
        writeOuput(x)



def writeOuput(y):
    for line in y:
        print(line)
        
    
createFile()
