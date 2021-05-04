#!/bin/bash
FILE=teste.java
FILE2=teste.class
FILE3=teste.class

if [ -e "$FILE" ] ; then
echo "o arquivo teste.java existe"
else
echo "o arquivo teste.java não existe"
fi
if [ -e "$FILE2" ] ; then
rm "$FILE2" 
echo "o arquivo .class existe e foi apagado"
else
echo "o arquivo .class não existe e será criado"

javac teste.java
fi
if [ -e "$FILE3" ] ; then
echo "o arquivo .class existe e será executado"
java teste.class

else
echo "o arquivo .class não foi criado!"

fi
