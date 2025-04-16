package icici.loans.personalloans;

import java.io.File;
import java.util.Arrays;

public class ProjectDetails 
{
	//To get current Method Name
	public String getCurrentMethodName() 
	{
		//System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }
	
	public String className()
	{		
		System.out.println("Current Method Name is :" + getCurrentMethodName());
		return this.getClass().getSimpleName();
	}
	
	public String packageName()
	{
		//System.out.println("Current Method Name is :" + getCurrentMethodName());
		return this.getClass().getPackageName();
	}
	
	
	public String[] projectName(String projectPath)
	{
		File f = new File(projectPath);
		String name1 = f.getName();
		String name2 = f.getParent();
		return new String[] {name1,name2};
	}
	
	
	public String getLastNameFromPackage()
	{
		String p = this.getClass().getPackageName();
		String[] partName = p.split("\\.");
		System.out.println(partName.length);
		if(partName.length>=3)
			return partName[2];
		else
			return "String is not present at index";		
	}
	
	public static void main(String[] args) 
	{
		//To get Project Working Directory Dynamically
		String projectWorkingDirectory = System.getProperty("user.dir");
		System.out.println("Project Working Directory : " + projectWorkingDirectory);
		
		//To get current UserName
		String userName = System.getProperty("user.name");
		System.out.println("Current User Name is : " + userName);
		
		//To get Current Os Name
		String osName = System.getProperty("os.name");
		System.out.println("Os Name is :" + osName);
		
		//To get current Os Version
		String osversion = System.getProperty("os.version");
		System.out.println("Os version is :" + osversion);
		
		
		
		ProjectDetails obj = new ProjectDetails();
		
		String methodName = obj.getCurrentMethodName();
		System.out.println("Method Name is : " +  methodName);
		
		String cName = obj.className();
		System.out.println("Class Name is : " + cName);
		
		String packName = obj.packageName();
		System.out.println("Package Name is : " +  packName);
		
		String[] pName = obj.projectName(projectWorkingDirectory);
		for(String name:pName)
		{
			System.out.println(name);
		}
		
		String lastPackageName = obj.getLastNameFromPackage();
		System.out.println("lastPackageName : " + lastPackageName);
		
		/*
		//To get current Class Name
		String cName = obj.className();
		System.out.println("Class Name is : " + cName);
		
		//To get current Package Name
		String packName = obj.packageName();
		System.out.println("Package Name is : " +  packName);
		
		// To get the Project Name
		String[] projectName = obj.projectName(projectWorkingDirectory);
		//System.out.println("Project Name is : " + projectName);
		System.out.println("Project Name is : " + Arrays.toString(projectName));
		
		// To get last Name from the packageName
		//String lastNamePack = obj.getLastNameFromPackage();
		//System.out.println("Last Name From Package is : " + lastNamePack);*/		
	}
}
