<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


 <link rel="stylesheet" href="webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    
    
         
<style>

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
.footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: blue;
  color: white;
  text-align: center;
}
</style>


<style >
.header {
  padding: 30px;
  text-align: center;
  background: #1abc9c;
  color: white;
  font-size: 30px;
}

</style>



<div class="header">
  <h1>PROJECT</h1>
   <ul>
  <li><a href="showFormForAdd">ADD</a></li>
  <li><a href="/todo/listToDo">LIST</a></li>
 
  
</ul>
</div>




<div class="footer">
  <p>SPRING MINI PROJECT</p>
</div>

<title>TODO LIST</title>
</head>
<body>




<div id="wrapper">
    </div>
    <input type="button" onclick="window.location.href='showFormForAdd'; return false"
    class="add-button" value="Add New ToDo">
<br/><br/>


<div id="container">
    <div id="content">
        <table class="table">
            <thead class="thead-dark">
            <tr>
             <th scope="col">List of TODO's</th>
            </tr>
            <tr>
                <th scope="col">DESCRIPTION</th>
                <th scope="col">TARGET DATE</th>
                 <th scope="col">    OPERATIONS </th>
              
            </tr>

            <c:forEach var="tempToDo" items="${todos}">
            <c:url var="updateLink" value="/todo/showFormForUpdate">
                <c:param name="todoId" value="${tempToDo.id}" ></c:param>
            </c:url>
            <c:url var="deleteLink" value="/todo/delete">
                <c:param name="todoId" value="${tempToDo.id}" />
            </c:url>
              
            <tr>
            
          
            
                <td> ${tempToDo.desc} </td>
                
                <td> ${tempToDo.tdate} </td>
                
                <td>
                    <a href="${updateLink}">Update</a></td>
                    
                <td>    <a href="${deleteLink}">Delete</a>
                </td>
                

            </tr>

            </c:forEach>

        </table>

    </div>

</div>
    
</body>
</html>