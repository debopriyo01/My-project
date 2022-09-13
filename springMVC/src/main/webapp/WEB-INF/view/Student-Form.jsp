<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="prossess" modelAttribute="student">
    <br>
    <br>
    First Name : <form:input path="First_Name"/>
    Last Name: <form:input path="Last_Name"/>
    
    <br>
    <br>
   
   Country:
  <form:input type="select" path="country" required="required" autocomplete="off"/>
  <form:options items="${student.countries}"/>
   
  <br>
  <br>
 
Favorite Language:
java<form:input type="radiobutton" path="favorietLanguage" required="required" autocomplete="off" value="java" />
java<form:input type="radiobutton" path="favorietLanguage" required="required" autocomplete="off" value="java" />
java<form:input type="radiobutton" path="favorietLanguage" required="required" autocomplete="off" value="java" />
java<form:input type="radiobutton" path="favorietLanguage" required="required" autocomplete="off" value="java" />
java<form:input type="radiobutton" path="favorietLanguage" required="required" autocomplete="off" value="java" />
 

 <br>
 <br>
 
Operetion System:
java<form:input type="checkbox" path="prerationSystem" required="required" autocomplete="off" value="java" />
java<form:input type="radiobutton" path="prerationSystem" required="required" autocomplete="off" value="java" />
java<form:input type="radiobutton" path="prerationSystem" required="required" autocomplete="off" value="java" />
java<form:input type="checkbox" path="prerationSystem" required="required" autocomplete="off" value="java" />
   
   
 <input type="submit" value="Submit"/>
   
</form:form>
</body>
</html>