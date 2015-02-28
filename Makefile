JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:  
	$(JC) $(JFLAGS) $*.java

RandomArray: RandomArray.class

MergeSort: Mergesort.class

QuickSort: Quicksort.class

HeapSort: Heapsort.class

TestSuite: SortingTestSuite.class

clean: 
	rm *.class
