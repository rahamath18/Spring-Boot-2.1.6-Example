Spring Boot 2.1.6 Example Application 
-------------------------------------

1. Install JDK 1.8
2. Apache Maven 3.5.4

$ mvn dependency:tree
$ mvn eclipse:eclipse
	
Run application in eclipse or with following mvn command

$ mvn spring-boot:run

Start with browser at end of server start
	http://localhost:8080
	
	
Executable jars and Java
------------------------
$ mvn package

# to see all files in jar
$ jar tvf target/Spring-Boot-2-1-6-Example-0.0.1-SNAPSHOT.jar

# to run application
$ java -jar target/Spring-Boot-2-1-6-Example-0.0.1-SNAPSHOT.jar