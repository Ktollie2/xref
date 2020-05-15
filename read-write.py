from subprocess import *



def readFile():
    with open("AsemotaDice.java", "r") as x:
        writeOuput(x)



def writeOuput(y):

    keywords = ["abstract", "assert", "boolean", "break", "byte","case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", 'native', "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"]
    is_keyword = False
    z = open("test.html", "w")
    z.write("<!DOCTYPE html>")
    z.write("\n\t<html>")
    z.write("\n\t\t<code>")
    for lines in y:
        for word in lines.split():
            is_keyword = False
            for i in range(len(keywords)):
                if(word == keywords[i]):
                    z.write("<b>%s</b> " %word)
                    is_keyword = True
                elif(i == (len(keywords) - 1) and is_keyword == False):
                    z.write(" %s " %word)
        ##z.write("\n\t\t\t%s" %lines)
        z.write("<br>")
        
    z.write("\n\t\t</code>")
    z.write("\n\t</html>")
readFile()
