/* File:      FloraClassLoader.java
**
** Author(s): Aditi Pandit
**
** Contact:   flora-users@lists.sourceforge.net
** 
** Copyright (C) The Research Foundation of SUNY, 2005, 2006
** 
** FLORA-2 is free software; you can redistribute it and/or modify it under the
** terms of the GNU Library General Public License as published by the Free
** Software Foundation; either version 2 of the License, or (at your option)
** any later version.
** 
** FLORA-2 is distributed in the hope that it will be useful, but WITHOUT ANY
** WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
** FOR A PARTICULAR PURPOSE.  See the GNU Library General Public License for
** more details.
** 
** 
** You should have received a copy of the GNU Library General Public License
** along with FLORA-2; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
**
**
** 
*/

package net.sourceforge.flora.javaAPI.src;
 

/* Class to load the java classes corresponding to flora classes
   into the JVM. Used by the Protege interface only */
public class FloraClassLoader
{
 
    String floraFilesDir = "";
    String floradir = "";   
    String javaClassPath = "";
    
    String floraLoadClassName = "";
	
    FloraSession session;
    
    /* Constructor function */
    /* sessionpar : FloraSession to load flora classes from */
    public FloraClassLoader(FloraSession sessionpar)
    {
    	session = sessionpar;

	/*
	// This query is used in the deprecated method loadFloraClass
    	String query = "[flrjava>>write_java_mod].";
	session.ExecuteCommand(query);
	*/
		
	floradir = System.getProperty("FLORADIR");
       
    	return;
    }

    /* Set the directory which contains the generated java and class
    ** files corresponding to the FLORA classes
    **
    ** floraDirPar : path of the FLORA directory
    */
    public void setFloraDir(String floraDirPar)
    {
	floraFilesDir = floraDirPar;
    }

    /* Set the javaClassPath to be used when compiling
    ** the java files generated by the %write predicate
    ** javaClassPathPar : classpath to be used.
    ** It must contain the javaAPI code
    */
    public void setJavaClassPath(String javaClassPathPar)
    {
	javaClassPath = javaClassPathPar;
    }

    /* Write java code for floraClass, compile it, and load into JVM 
    ** floraFileName   : Flora file to load from
    ** floraClassName  : Name of flora class to be loaded
    ** floraModuleName : Name of flora module to load into
    */
    /*
    // THIS METHOD IS NOT USED!!!
    public Class loadFloraClass(String floraFileName, String floraClassName, String floraModuleName)
	throws ClassNotFoundException
    {
    	floraLoadClassName = floraClassName;
    	String floraQuery;
		
	// Creating the java file
	try {
	    String osname = (System.getProperty("os.name")).split(" ")[0].toUpperCase();
	    if (osname.startsWith("WINDOWS"))
		floraQuery =
		    "%write("+floraClassName+ "," +floraModuleName+ ",''"+floraFilesDir+"\\\\" + floraClassName + ".java'')@write_java_mod.";	
	    else
		floraQuery =
		    "%write("+floraClassName+ "," +floraModuleName+ ",''"+floraFilesDir+File.separator + floraClassName + ".java'')@write_java_mod.";	
	    session.ExecuteCommand(floraQuery);
	}
	catch(Exception e) {
	    e.printStackTrace();
	    return null;
	}
       	
	// Compiling it to get the class file
	String javaDir = System.getProperty("JAVA_BIN");
	
	File javaFile =
	    new File(floraFilesDir + File.separator + floraClassName + ".java");
	File classPathDir = new File(javaClassPath);
	
	String javaCompileCmd = "";
	try {
	    javaCompileCmd =
		javaDir + File.separator
		+ "javac -classpath " + classPathDir.getCanonicalPath() + " "
		+ javaFile.getCanonicalPath();
	}
	catch(Exception e) {
	    System.out.println("j2flora2: Class load failed to construct compile string");
	    return null;
	}
			
	System.out.println("Compile command:"+javaCompileCmd); 

	Runtime rjavac = Runtime.getRuntime();
	Process pjavac = null;
			
	try {
	    pjavac = rjavac.exec(javaCompileCmd);	
	    pjavac.waitFor();
	}
	catch(Exception e) {
	    e.printStackTrace();
	    return null;
	}
	
	if (pjavac.exitValue()!=0) {
	    System.out.println("FLORA-2 class loader: Compile command failed");
	    return null;
	}

	// Using the Class.forName method to load a class
	Class floraClass = null;
       
	String name = floraClassName;
	try {
	    floraClass = ClassLoad(name);	
	}
	catch(Exception e) {
	    e.printStackTrace();
	    return null;
	}
		
	return floraClass;
    }
    */


    /* Use Class.forName java function to load the particular
    ** class into JVM
    */
    /*
    private Class ClassLoad(String ClassName)
	throws ClassNotFoundException
    {
	
	Class floraClass = null;
	try {
	    floraClass = Class.forName(ClassName);
	}
	catch(Exception e) {
	    throw(new ClassNotFoundException("j2flora2: Loading failed for class "+ClassName));
    	}
    	return floraClass;
    }
    */
}