package ite.homework;

/**
 * @author Wissam
 * this is the first question in the home work
 * 
 * i put it in a folder named ite.homework cuz its our domain lololo p.s we don't have a domain but that
 * is the right thing to do
 * 
 * i put  "public" to the class to make it accessible cuz it has the main method and it is the only class in the package
 * 
 * i put private to all class member and made a setter and getter to all of them cuz its the hole idea of OOP way (encapsulation and privacy)
 *  
 * i made a doc for main method 
 * 
 * i made the "ClassVariable" in upper case cuz it's static 
 */

public class Variables {
	public Variables() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	/**
	 * this is a classVariable
	 */
	private static int CLASSVARIABLE ;
	
	public static int getCLASSVARIABLE() {
		return CLASSVARIABLE;
	}
	public static void setCLASSVARIABLE(int cLASSVARIABLE) {
		CLASSVARIABLE = cLASSVARIABLE;
	}


	/**
	 * this is an instaceVariable
	 */
	private int instanceVariable;	
	public int getInstanceVariable() {
		return instanceVariable;
	}
	public void setInstanceVariable(int instanceVariable) {		
		this.instanceVariable = instanceVariable;
	}
	
	
	
	/**
	 * its the main method of the application 
	 * it print "Hello, World" 
	 */
	public static void main(String[] args) {
		System.out.println(getCLASSVARIABLE());
		setCLASSVARIABLE(1);
		System.out.println(getCLASSVARIABLE());
		
		Variables testVariable = new Variables() ;
		System.out.println(testVariable.getInstanceVariable());
		testVariable.setInstanceVariable(1);
		System.out.println(testVariable.getInstanceVariable());
		
		int localVariable  ;
		localVariable = 9 ;
		System.out.println(localVariable);
		
		
		System.out.println("Hello, World");
	}





	

}
