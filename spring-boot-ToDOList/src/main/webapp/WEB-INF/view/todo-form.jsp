<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
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
<title>TODO FORM</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
       <table class="table"></table>
       <table>
            <thead class="thead-dark">
            <tr>
             <th scope="col">Add TO DO</th>
            </tr>
            </thead>
          </table>
    </div>
  </div>  
    
    <div id="container">
   

    <form:form action="saveToDo" modelAttribute="toDo" method="POST">
        <form:hidden path="id" />
        
        <div class="form-group">
            <label>DESCRIPTION:</label>
            <form:input  path="desc"/>

        </div>
        <br/>
        
          <div class="form-group">
            <label>Target Date:</label>
            <form:input type="date" path="tdate"/>

        </div>
        <br/>
        
         <input type="submit" value="Save" class="save"/>
        
        </form:form>
    <p>
    
        <a href="${pageContext.request.contextPath}/todo/listToDo"> Back to List</a>
    </p>
  
    
</div>
</body>
</html>