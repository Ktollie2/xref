from subprocess import *



def readFile():
    with open("test.java", "r") as x:
        writeOuput(x)



def writeOuput(y):
    z = open("test.html", "w")
    z.write("<!DOCTYPE html>")
    z.write("\n\t<html>")
    z.write("\n\t\t<code>")
    for lines in y:
        z.write("\n\t\t\t%s" %lines)
        z.write("<br>")
        
    z.write("\n\t\t</code>")
    z.write("\n\t</html>")
readFile()
