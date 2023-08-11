# What is ORM :-
	-> Full form of ORM is Object Relational Mapping
	-> ORM is the programming approach or functionality used to provide the relationship or mapping between "Object" and "Relational Database" via XML file or annotations
	-> It will map the "object" and "relational database" in such a way that model class (object) becomes the table, 
         properites becomes the column and property value becomes the row of database table
	-> Some common ORM tools are :-
		1. Hibernate
		2. JPA
		3. OpenJPA
		4. TopLink
		5. MyBatis
		6. EclipseLink
		   etc
		   


--ORM1
![ORM_1_lyst7967](https://github.com/Nishita-Maheshwari/SpringORM-HibernateAndJPA/assets/47790697/efc7d072-e769-47e9-9fd1-4f7ad23def91)




--ORM2

![ORM_2_lyst1996](https://github.com/Nishita-Maheshwari/SpringORM-HibernateAndJPA/assets/47790697/9085d94d-2c09-4a01-87a6-a642c5a7040b)





# Hibernate :-
	-> Hibernate is Java ORM tool (framework) which is used to interact with database
	-> It is an open source (free to download), lightweight and hightly performance java framework
	-> Architecture :-


  ![Hibernate_Architecture_lyst4258](https://github.com/Nishita-Maheshwari/SpringORM-HibernateAndJPA/assets/47790697/f9be4b36-3621-4267-baf7-7f5c0026c65d)









  # Hibernate common classes & interfaces :-

	1. Configuration :-
		-> It is a class which is present in "org.hibernate.cfg" package
		-> It is used to configure hibernate configuration file and to get SessionFactory object
		
	2. SessionFactory :-
		-> It is an interface which is present in "org.hibernate" package
		-> It can be treated as like Connection in JDBC
		-> It is used to create Session objects
		
	3. Session :-
		-> It is an interface which is present in "org.hibernate" package
		-> It is used to insert, select, update or delete the values in table
		
	5. Transaction :-
		-> It is an interface which is present in "org.hibernate" package
		-> It defines the unit of work (queries)
		
	6. Dialect :-
		-> It is the class which is present in "org.hibernate.dialect" package
		-> It acts as a bridge between java JDBC type & SQL type. In simple words we can say it specify the database language for different databases
		



# task
![task_lyst6309](https://github.com/Nishita-Maheshwari/SpringORM-HibernateAndJPA/assets/47790697/352b1caf-16a9-490f-9828-d66cd58457d2)









# Spring with Hibernate :-
	-> Why we need Spring to connect with Hibernate :-
		= Because it removes the boiler-plate code i.e. creating Configuration, SessionFactory, Sesison & Transaction objects.
		
	-> Classes used in Spring with Hibernate are :-
		
		1. LocalSessionFactoryBean :-
			= It is class which is present in "org.springframework.orm.hibernate5" package
			= It is used to integrate the application with hibernate
			= It is the FactoryBean that creates Hibernate SessionFactory.
			= We configure all the hibernate configurtion details using this class
		
		2. HibernateTransactionManager
			= It is class which is present in "org.springframework.orm.hibernate5" package
			= This transaction manager is appropriate for applications that use a single Hibernate SessionFactory for transactional data access,
         but it also supports direct DataSource access within a transaction (i.e. plain JDBC code working with the same DataSource)
			= We also use @Transactional annotation
			
		3. HibernateTemplate
			= It is class which is present in "org.springframework.orm.hibernate5" package
			= It is an abstract layer over Hibernate Session
			= It provides the methods for CRUD operations i.e. save(), update(), delete(), get() etc
			








# JPA :-
	-> Full form of JPA is "Java Persistence API"
	
	-> Persistence means "Store Permanently"
	   Entity is an "Object"
	   Persisting an entity means storing the Object/Data in database permanently
	   
	-> JPA is an API which contains some interfaces and classes which are as follows :-
		1. Persistence <class>
			= It contains the static method which is used to obtain EntityManagerFactory instance
		2. EntityManagerFactory <interface>
			= It is used to obtain EntityManager instance
		3. EntityManager <interface>
			= It manages the persistence operations (insert, delete, select, update etc)
		4. EntityTransaction <interface>
			= It is used to control the transactions (set of operations) on entity manager
			etc
		
	-> NOTE :-
		= All above classes and interfaces are present in "javax.persistence" package
		= The "Java Persistence API" name was changed to "Jakarta Persistence API" in 2019
		
	-> JPA is only specification, its implementation is provided by ORM vendors i.e. JBOSS (hibernate), 
      Apache Software Foundation (Open JPA), Eclipse Foundation (EclipseLink) etc
	-> In short, we can say that to use JPA we have to use third party ORM vendor
	
	-> Why we need JPA :-
		1. Database Independent
		2. Improve developer productity
		3. Improved caching
		   etc
	


=> JDBC :-
	-> JDBC is an API which is used to store the data in database
	-> JDBC is only specification, its implementation is provided by database vendors i.e. MySQL, Oracle, Postgres etc
	
=> ORM :-
	-> ORM is programming approach or functionality used to provide the relationship between Objects and Relational Database (by using mapping file)
	
=> Hibernate :-
	-> Hibernate is an ORM tool which is used to store the objects/data in database
	
=> JPA :-
	-> JPA is an API which is used to store the objects/data in database (but it follows ORM approach)
	-> JPA is only specification, its implementation is provided by ORM vendors i.e. JBOSS, Apache Software Foundation, Eclipse Foundation etc
	
====



![java_lyst1243](https://github.com/Nishita-Maheshwari/SpringORM-HibernateAndJPA/assets/47790697/8aa9928f-588f-4b36-8d49-035823f25d26)











#  Spring with JPA :-
	-> Steps :-
		1. Create entity/bean class with getter and setter methods in "in.sp.entity" package (Student.java)
		2. Create mapping file in "in.sp.resources" package (Student.xml)
		3. Create DAO interface in "in.sp.dao" package (StudentDao.java)
		4. Create DAO implemented class in "in.sp.dao" package (StudentDaoImpl.java)
		5. Create Spring configuration file in "in.sp.resources" package (applicationContext.xml)
		6. Create Test application in "in.sp.test" package (Test.java)
		


=> @Repository :-
	-> It is used to indicate that the class provides CRUD operations i.e. select, insert, update, delete
	
	
=> @PersistenceContext :-
	-> It is used to inject an EntityManager object
	
	
=> @Transactional :-
	-> It provides support for transactions
	

=> LocalContainerEntityManagerFactoryBean :-
	-> It is used to manage/set-up EntityManagerFactory configurations


=> HibernateJpaVendorAdapter :-
	-> It will return a Map of vendor-specific JPA properties


=> JpaTransactionManager :-
	-> It is used to support the transactions
