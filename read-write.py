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
    z.write("\n\t\t<p>")
    for lines in y:
        in_comment = False
        for word in lines.split():
            is_keyword = False
            if ((in_comment == True) and ("//" in word) == False):
                z.write("<i>%s</i> " %word)
            elif ("/" in word):
                in_comment = True
                z.write("<i>%s</i> " %word)
            else:
                for i in range(len(keywords)):
                    if(word == keywords[i]):
                        z.write("<b>%s</b> " %word)
                        is_keyword = True
                    elif(i == (len(keywords) - 1) and is_keyword == False):
                        z.write(" %s " %word)
        ##z.write("\n\t\t\t%s" %lines)
        z.write("<br>")
        
    z.write("\n\t\t</p>")
    z.write("\n\t</html>")
readFile()
