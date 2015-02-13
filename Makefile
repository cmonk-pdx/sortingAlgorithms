JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:  
	$(JC) $(JFLAGS) $*.java

RandomArray: RandomArray.class

clean: 
	rm *.class
