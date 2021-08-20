package testcase;

import org.testng.annotations.Test;

public class Attributes {
	@Test(invocationCount =3)
	public void creadlead() {
		System.out.println("createlead");

	}
	@Test(priority= -1)
public void editlead() {
	System.out.println("editlead");

}
	@Test(priority = 2)
public void deletelead() {
	System.out.println("deletelead");

}
	@Test(dependsOnMethods = "mergelead")
public void duplicatelead() {
	System.out.println("duplicatelead");

}
	@Test
public void mergelead() {
		System.out.println("mergelead");

}
}
