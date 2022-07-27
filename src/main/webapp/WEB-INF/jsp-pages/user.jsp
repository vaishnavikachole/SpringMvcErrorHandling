<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!doctype html>
<html>
  <head>

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  
    <title>User</title>
  </head>
  <body>
  
    <div class="container mt-5">
      <h1 class="text-center">
        Registration Form
      </h1>
      <div class="alert alert-danger" role="alert">
        <form:errors path="student.*" />
      </div>
        
    <form action="/userform" method="post">  
        <div class="form-group">
          <label for="userName">User Name</label>
          <input type="text" 
          name="userName" 
          class="form-control" 
          id="name" 
          placeholder="Enter name">
        </div>

        <div class="form-group">
            <label for="emailId"> Email Id</label>
            <input type="email" class="form-control" 
            name="emailId" id="emailId" placeholder="enter Email Id">
        </div>

        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" class="form-control" 
          name="password"
          id="password" placeholder="enter Password">
        </div>

        <div class="form-group">
          <label for="id">User Id</label>
          <input type="text" class="form-control" 
          name="id"
          id="userId" placeholder="enter user id">
        </div>
       
        <div class="container text-center">
        <button type="submit" class="btn btn-primary">Sign Up</button>
        </div>
    </form>
    </div>

  </body>
</html>