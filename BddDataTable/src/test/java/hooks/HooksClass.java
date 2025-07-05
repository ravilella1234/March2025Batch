package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass 
{
	@Before("@all")
	public void setup(Scenario scenario)
	{
		System.out.println("++ Starting setup Before Hook :"+ scenario.getName());
	}
	
	@After("@all")
	public void killUp(Scenario scenario)
	{
		System.out.println("-- Ending killup After Hook :" +  scenario.getStatus());
	}
}
