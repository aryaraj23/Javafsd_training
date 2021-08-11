<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  

<style><%@include file="/main.css"%></style>

<h1>Edit Employee</h1>
       <form:form method="POST" action="/viewemp">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="designation" /></td>
         </tr> 
         <tr>  
          <td>Address :</td>  
          <td><form:input path="address" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input id="submit" type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  

		