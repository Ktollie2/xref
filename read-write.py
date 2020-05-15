from subprocess import *



def readFile():
    with open("AsemotaDice.java", "r") as x:
        writeOuput(x)



def writeOuput(y):
    z = open("test.html", "w")
    z.write("<!DOCTYPE html>")
    z.write("\n\t<html>")
    z.write("\n\t\t<code>")
    for lines in y:
        for word in lines.split():
            if(word == "int"):
                z.write("<b>%s</b> " %word)
            else:
                z.write(" %s " %word)
        ##z.write("\n\t\t\t%s" %lines)
        z.write("<br>")
        
    z.write("\n\t\t</code>")
    z.write("\n\t</html>")
readFile()
