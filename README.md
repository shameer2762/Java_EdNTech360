# Java_GFG
This repository contains java related content for beginners and multiple hands-on codes
Definition of Java:
Java is an object-oriented, cross-platform programming language. It is widely used for developing various applications, including web, mobile, desktop, and enterprise software. Java is also used for developing games and other multimedia applications.

## 1.	History of Java?

	Developed By:	James Gosling, Mike Sheridan, and Patrick Naughton
	Developed At: 	Sun Microsystems 
	Year:	1991
	First Publication:	Java 1.0 in 1996
	Why & How Java Name Choose	: 
Java is an island in Indonesia where the first coffee was produced (called Java      coffee). It is a kind of espresso bean. Java's name was chosen by James Gosling while having a cup of coffee near his office.	
								
	Key Features of Java:	Object-Oriented,
							Cross-Platform,
							Write Once, Run Anywhere (WORA),
							Secure,
							Portable,
							Robust,
							Scalable
									
## 2.	Features of JAVA?

	Object-Oriented:  Java is an object-oriented programming language, which means that it uses objects to represent data and behavior. Objects are made up of classes, and classes are made up of methods and field
	Cross-Platform: Java is a cross-platform programming language, which means that it can be run on different platforms, such as Windows, Mac, and Linux. This makes Java a great choice for developing applications that need to be run on multiple platforms.
	 Write Once, Run Anywhere (WORA): Java is a write once, run anywhere (WORA) programming language, which means that Java code can be compiled once and run on any platform that has a Java Virtual Machine (JVM). This makes Java a great choice for developing applications that need to be run on a variety of platforms.
	Secure: Java is a secure programming language, which means that it is designed to prevent malicious code from being executed. This makes Java a great choice for developing applications that need to be secure.
	Portable: Java is a portable programming language, which means that Java code can be easily moved from one platform to another. This makes Java a great choice for developing applications that need to be portable.
	Robust: Robust is a term used to describe a computer program that performs in several ways and has a very low failure rate. Robust computer applications often perform well under both ordinary and unusual conditions
	
The English mining of Robust is strong. Java is robust because:

 	It uses strong memory management.
 	There is a lack of pointers that avoid security problems.
 	Java provides automatic garbage collection which runs on the Java Virtual Machine to get rid of objects which are not being used by a Java application anymore.
 	There are exception-handling and the type checking mechanism in Java. 

All these points make Java robust.

	Scalable: Java is a scalable programming language, which means that it can be used to develop applications that can handle large amounts of data and traffic. This makes Java a great choice for developing applications that need to be scalable.

## 3.	Why is JAVA called as platform-independent language?
	
Source code: Source code in Java is the human-readable text of a Java program, stored in a file (.java) that can be opened in any plain text editor. It contains instructions, declarations, functions, loops, and other statements that can act as instructions to the program on how to function.

>> Source code is not understandable to the machine.
>> We need to convert this source code to Byte Code
>> This conversion can be done by translators.
>> There are two types of translators in Java 
1.	Compiler: 
•	It can understand source code
•	It will convert source code to Byte Code (or) JVM understandable code (or) intermediate code.
•	If any syntactical errors in the source code then the compiler will throw compile time errors.
•	The output of the compiler will create a .class file for all the classes present in the source code separately. 

Compilation:  						

2.	JVM:
•	It will convert byte code to executable code.
•	The executable code can run in any operating system whether it is Windows or Linux or macOS or Solaris.
•	One JVM will not be suitable to convert Byte code to all operating systems. We have different JVMs for converting the code for different operating systems.

Flow:


Here Java Software application is platform independent and can run in any operating system.

## 4.	JDK, JRE, JVM ??

JDK:

1)	JDK stands for “Java Development Kit”. (JDK)
2)	It is a software development environment that provides a complete development environment in which we create, compile & execute a Java program.
3)	It has a physical existence
4)	It is a combination of JRE + Development tools (compilers & Debuggers).
JRE:
1)	JRE stands for “Java Runtime Environment”. (JRE)
2)	The Java runtime environment is a set of software tools that are used for developing Java applications. 
3)	It is used to provide the runtime environment. 
4)	It is the implementation of JVM. 
5)	It is a physical existence
6)	It is a combination of JVM and libraries to run the application. 
JVM: 
1)	JVM stands for “Java Virtual Machine”. (JVM)
2)	It is a specification that provides a runtime environment in which Java byte code can be executed. 
3)	It is used to convert Byte Code into Machine Code. 
4)	It does not physically exist. 
5)	It contains only a runtime environment for executing the Java byte code.

JDK = { JRE } + Development tools (compilers, debuggers, etc.., ) 
JRE = { JVM } + Libraries & jar files
JVM = Java Virtual Machine
	
 
                    

