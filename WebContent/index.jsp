<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#startbar").click(function() {
			$("#dropdownstuff").slideDown("Slow");
		});
		$("#stop").click(function() {
			$("#dropdownstuff").stop();
		});
	});
</script>
<style>
#dropdownstuff, #startbar {
	padding: 5px;
	font-size: 18px;
	text-align: center;
	background-color: lightblue;
	color: white;
	border: solid 3px white;
	border-radius: 3px;
}

#dropdownstuff {
	padding: 50px;
	display: none;
}
</style>
<meta charset="ISO-8859-1">
<title>Worst Calculator</title>
</head>
<body>
	<h1>Worst Calculator</h1>
	<div id="startbar">Click to see the First Number input field</div>
	<div id="dropdownstuff">
		<form action="getWorstCalculator" method="post">
			Enter your first number: <input type="text" name="firstNumber"
				size="10"> <input type="submit" value="secondNumber" />
		</form>
	</div>
</body>
</html>
