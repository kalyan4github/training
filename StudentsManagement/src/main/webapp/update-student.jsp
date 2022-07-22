<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="in.techdenovo.apps.model.Student"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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

        <div class="row">
            <div class="col"></div>
            <div class="col">
                <form action="update-student" method="post">
                    <% Student student = (Student) request.getAttribute("student");%>
                    <div class="mb-3">
                      <label for="inputFirstName" class="form-label">Id</label>
                      <input type="text" class="form-control" id="inputFirstName" name="id" value="<%=student.getId()%>" readonly>
                    </div>
                    <div class="mb-3">
                      <label for="inputFirstName" class="form-label">First Name</label>
                      <input type="text" class="form-control" id="inputFirstName" name="first-name" value="<%=student.getFirstName()%>">
                    </div>
                    <div class="mb-3">
                        <label for="inputLastName" class="form-label">Last Name</label>
                        <input type="text" class="form-control" id="inputLastName" name="last-name" value="<%=student.getLastName()%>">
                    </div>
                    <div class="mb-3">
                        <label for="inputMobileNo" class="form-label">Mobile No</label>
                        <input type="text" class="form-control" id="inputMobileNo" name="mobile-no" value="<%=student.getMobileNo()%>">
                    </div>
                    <div class="mb-3">
                        <label for="inputCity" class="form-label">City</label>
                        <input type="text" class="form-control" id="inputCity" name="city" value="<%=student.getCity()%>">
                    </div>

                    
                    <button type="submit" class="btn btn-primary">Update Student</button>
                  </form>
            </div>
            <div class="col"></div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>