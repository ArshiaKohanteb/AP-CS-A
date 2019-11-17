Installation of images

To make images visible to the Java compiler and JVM from any directory on your computer, perform the following steps:

1. On a PC, download and install Java 6.0 (1.6).  Then copy the file images.jar to the following two directories:

c:\Program Files\Java\jdk1.6.0_16\jre\lib\ext

c:\Program Files\Java\jre1.6.0_16\lib\ext

The version numbers in these paths might be slightly different on your computer.

2. On a Macintosh, copy the file images.jar to the following directory:

Macintosh HD/Library/Java/Extensions

Note: this should be done before installing your favorite IDE.  If your IDE already exists, you might have to uninstall and reinstall it to make this work.  Experiment will tell you.

Alternatively, you can copy the directory images (the byte codes) to your working directory.  A command prompt compile or run will then be able to locate the package, but only from your current working  directory. 

You should also copy the imagedocs directory to you computer for browsable documentation.

The source code for the package is available in the directory imageswithsources.  It's Open Source.

An example test program is available in the directory Test Programs.

Report any suggestions, problems or bugs to klambert@wlu.edu. 
