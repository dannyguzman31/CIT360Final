<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Registration</h1>
	   <div class="row">
        <div class="column">
            <img src="office.jpeg" style="width:100%">
        </div>
        <div class="column">
            <form action="register" method="post">
               
                <label for="fname"> First Name: </label>
                 <input type="text" id="f_Name" name="f_Name" placeholder="Your first name..">
               
               <label for="lname"> Last Name: </label>
                 <input type="text" id="l_Name" name="l_Name" placeholder="Your last name..">
               
                <label for="userName">Username: </label>
                <input type="text" id="userName" name="userName" placeholder="Your name..">

                <label for="password1">Password: </label>
                <input type="password" id="password1" name="password1" placeholder="Your password..">

				<label for="password2">Confirm Password: </label>
                <input type="password" id="password2" name="password2" placeholder="Confirm password..">

                <label for="email">Email: </label>
                <input type="text" id="email" name="email" placeholder="Your Email">

                <label for="phone">Phone: </label>
                <input type="text" id="phone" name="phone" placeholder="Your new password">
               
                <label for="phone">Choose Security Question: </label>
               <select id="question" name="questions">
                    <option value="one" name="one">Favorite sport?</option>
                    <option value="two" name="two">Place of birth?</option>
                    <option value="three" name="three">Name of pet?</option>
                </select>
                <input type="text" id="question" name="question" placeholder="Your answer...">

                <input type="submit" value="Register">   
            </form>
        </div>
        </div>
</body>
</html>