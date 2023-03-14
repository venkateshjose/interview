package ClassNotFoundException;

class GFG {
	
	/* NoClassDefFoundError */
	 
    // Main driver method
    public static void main(String args[])
    {
        // Creating object of class 1
        // inside main() in class2
        GeeksForGeeks geeks = new GeeksForGeeks();
 
        // Calling method of above class
        geeks.greeting();
    }
}