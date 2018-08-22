CSCB07F16Seminar
Code and powerpoints for CSCB07 seminars in Summer 2018
I don't know how you could use this for whatever code, but please do not copy and paste any of my code to your assignments or whatever you're doing. If you get in crap it's not my fault.
Also, this is Java 1.6 or 1.8.

Either copy the files / code to a folder for IDE or just use terminal and run
$ javac Dad.java Rar.java
$ java Rar
to see the end result. Make sure they're in the same folder.

readme (lowercased) shows an example file of what would be in a conflicting svn file.

run ./conflict after chmod (UNIX only) to simulate an svn conflict. Note that it does not actually parse your input and just outputs canned responses. Correct order of input:
svn update
p
// fix your file, then do this input
svn resolve readme
svn status
svn commit -m "your message here"
end (or anything you want really)
