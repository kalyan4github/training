<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="in.techdenovo.apps.model.Student"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Data</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <div class="container">

            <h1>Displaying Student List</h1>

            <table border ="1" width="500" align="center">
               <tr bgcolor="00FF7F">
                <th><b> Id</b></th>
                <th><b>First Name</b></th>
                <th><b> Last Name</b></th>
                <th><b> Mobile No</b></th>
                <th><b> City</b></th>
              </tr>
              <%-- Fetching the attributes of the request object
                   which was previously set by the servlet
                    "StudentServlet.java"
              --%>
              <%ArrayList<Student> std =
                  (ArrayList<Student>)request.getAttribute("Students");
              for(Student student:std){%>
                  <tr>
                      <td><%=student.getId()%></td>
                      <td><%=student.getFirstName()%></td>
                      <td><%=student.getLastName()%></td>
                      <td><%=student.getMobileNo()%></td>
                      <td><%=student.getCity()%></td>
                  </tr>
                  <%}%>
              </table>
    </div>
</body>
</html>