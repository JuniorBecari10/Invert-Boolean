@echo off

cd src
javac -d ../bin invert/main/Main.java

cd ../bin
java invert.main.Main
