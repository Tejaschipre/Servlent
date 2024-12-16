<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Kiranservlent" method="post">

Enter the First Name:<input type="text" placeholder="Enter the first name" name="fn"> <br>
Enter the Last Name:<input type="text" placeholder="Enter the last name" name="ln"> <br>
Enter the Email:<input type="email" placeholder="Enter the email name" name="em"> <br>
Enter the Mobil_no:<input type="tel" placeholder="Enter the mobil_no" name="te"> <br>
<label>Address</label><textarea rows="10" cols="10"  name="add"></textarea>
 <label>Gender : </label>
        <input type="radio" name="ge" value="male" />Male
        <input type="radio" name="ge" value="female" />Female <br><br>
Enter the DOB:<input type="date" placeholder="Enter the DOB" name="dob"> <br>
Enter the City:<input type="text" placeholder="Enter the city" name="c"> <br>
Enter the State:<input type="text" placeholder="Enter the State" name="s"> <br>
Enter the Country:<input type="text" placeholder="Enter the country" name="co"> <br>
Enter the Age:<input type="text" placeholder="Enter the age" name="a"> <br>
Enter the Degree:<input type="text" placeholder="Enter the Degree" name="d"> <br>

<input type="submit" name="sub">

</form>

</body>
</html>