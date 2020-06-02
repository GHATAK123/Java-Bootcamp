// JDBC stands for java database Connectivity.
//The JDBC API defines interfaces and classes for writing database applications in java by making database connection.
/* JDBC Components:Driver
A JDBC driver is a software component enabling a java application to interact with a database.
** Driver handles the communications with the database server(like Oracle)
** You will interact directly with Driver objects very rarely.
** Instead,you use DriverManager objects,which manages objects of this type.
** It also abstracts the details associated with working Driver objects
*/
/* JDBC Components:DriverManager
DriverManager manages a list of database drivers.
** It matches connection requests from the java application with the proper database driver using communciation sub-protocol.
** The first driver that recognizes a certain sub-protocol under JDBC will be used to establish a database connection.
*/
/*JDBC Components:Connection
Connection interface has all methods for contacting a database.
** The connection object represents communication context,i.e all communication with database is through connection object only.
*/
/* JDBC Components:PreparedStatement
PreparedStatement is an interface for representing SQL statements.
** A SQL statement is precompiled and stored in a PreparedStatement object.
** This object can then be used to efficiently execute this statement multiple times.
*/
/* JDBC Components:ResultSet
ResultSet is an interface to represent a database table.
** These objects hold data reterived from a database after you execute an SQL query using Statement Objects.
** It acts as an iterator to allow you to move through its data.
*/
/* JBDC Components:SQLException
SQLException is a sub-class of Exception class in Java.
** It is an exception that provides information on a database access error or other errors.
*/
/* Steps for Connection:
1.Loading Driver:
** A program can also explicitly load JDBC drivers at any time.
** For Example:the my.sql.Driver is loaded with the following statement:
 ** Class.forName("my.sql.Driver")
2.Establishing Connection:
** When getConnection is called the DriverManager will attempt to locate a suitable driver from amongst those loaded at initialization and those loaded explicitly.
** DriverManager.getConnection(url,user,password). //url:DataBase url. All the arguments are in string format.
** getConnection method returns Connection object on success otherwise null.
3.Preparing Statements:
** Connection object has a method to prepare a statement(sql statement).
** ps=con.prepareStatement(query_string)
** prepareStatement method returns object of PreparedStatement.
** PreparedStatement has Several methods to execute query like execute()[Return boolean like True or False],executeQuery()[For Select Query] and executeUpdate()[for update Query].
4.Executing Statements.
5.Getting Results:
** ResultSet object can be obtained as a returned object by executeQuery() method of PreparedStatement.
** ResultSet Object when not null or not empty, can be iterative over that object and get results.
6.Closing Database Connection:
** Connection object has a method called close() to close the connection.
** con.close().
*/
/* 