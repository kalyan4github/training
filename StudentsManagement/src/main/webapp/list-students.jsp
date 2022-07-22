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
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">Student Management</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">Home</a>
                  </li>

                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Students
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <li><a class="dropdown-item" href="add-student">Add Student</a></li>
                      <li><a class="dropdown-item" href="students">List All Student</a></li>
                      <li><hr class="dropdown-divider"></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
    <div class="container">

            <h1>Displaying Student List</h1>
            <table border ="1" width="500" align="center">
               <tr bgcolor="00FF7F">
                <th><b> Id</b></th>
                <th><b>First Name</b></th>
                <th><b> Last Name</b></th>
                <th><b> Mobile No</b></th>
                <th><b> City</b></th>
                <th>Action</th>
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
                      <td style="text-align:center;">
                        <a href="update-student?id=<%=student.getId()%>" class="btn btn-info">
                           <i class="fa-solid fa-pen-to-square"></i>
                        </a>
                      </td>
                  </tr>
                  <%}%>
              </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>