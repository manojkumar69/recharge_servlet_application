<%@page language="java" import="java.util.*" %>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Java Servlet</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
		<script src="//code.jquery.com/jquery-1.10.2.js"></script>
		<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
		<script src="autocompleter.js"></script>
		<script src="onload.js"></script>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
		<!-- User defied css -->
		<link rel="stylesheet" href="style.css">
		
	</head>
	
	<body >
		<br />
		<br />
		<div class="container">
			<form >
				<div class="form-group">
					<div class="search-container">
						<div class="ui-widget">
							<input type="text" id="search" name="search" class="search" />
						</div>
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</form>
		</div>
		
		
		<div class="container">          
		  <table id="tableId"  class="table table-hover">
		  </table>
		</div>
	</body>
</html>
