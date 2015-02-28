# sortingAlgorithms
Testing time efficiency of Merge sort, Quick sort, and Heap sort


To import Repo as an Eclipse Project:

1. Create local repo (if you don't haveone already). Pull the IDESorting branch
2. In Eclipse, go File > Import > Git > Projects from Git 
        Clone URI > Next > Enter URI: https://github.com/asasha/sortingAlgorithms.git and all the other jazz
	This will link Egit to the local/remote repo, but it won't show up as a project yet
3. Go to Window > Open Perspective > Other > Git
4. Open the Git Repositories Tab (Window > View > Show View > Other > Git > Git Repositories)
5. Right Click the sortingAlgorithms Repo, click Import Projects
6. Select Import Existing Eclipse Projects, click Next & Finish

Now when you go to the project Explorer, the files will be there!  Woot!

To run the file, run the testSuite with a file name argument (e.g. src/tst_data/10_Almost_Sorted.csv) and you should see output!


If you get a non fast-forward rejection when committing, make sure your local/remote branches are merged:
  http://stackoverflow.com/questions/19474186/egit-rejected-non-fast-forward

To run all the JUnit tests at once, Run the AllTests as a Junit Test. This is a Junit Test Suite which will execute all the tests at once.