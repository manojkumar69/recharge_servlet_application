<%@page language="java" import="java.util.*" %>
<html>
   <head>
      <meta charset="ISO-8859-1">
      <title>Synconext Hire Assignment</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
      <script src="//code.jquery.com/jquery-1.10.2.js"></script>
      <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
      <script src="autocompleter.js"></script>
      <script src="onload.js"></script>
      <script type="text/javascript">
         $(document).ready(function(){
         	$('#bttHello').click(function(){
         		var search = $('#search').val();
         		
         		//alert(search);
         		$.ajax({
         			data: {'name' : search},
         			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
         			url:'DataServlet',
         			dataType:'text',
      				type:'POST',
      				headers :{
      				Accept:"application/json; charset=utf-8",
      						"Content-Type" : "application/x-www-form-urlencoded; charset=utf-8"
      				},
      				success: function(result,textStatus, request){
      					//alert(request.getResponseHeader('Content-Type'));
      					console.info(result);
	         			var data = $.parseJSON(result);
	      	            var table_body = '<thead><tr><th>name</th><th>price</th></tr></thead><tbody>';
	     	         
	      	            for(i =0;i<data.length;i++)
	      	            {
		      	            table_body+='<tr>';
		      	            table_body +='<td>';
		      	            table_body +=data[i].name;
		      				table_body +='</td>';
		     	                   
		      				table_body +='<td>';
		      				table_body +=data[i].price;
		      				table_body +='</td>';
		     	                
		      				table_body+='</tr>';
	      	           }
	      	            table_body+='</tbody>';
	      	           // document.getElementById('result').innerHTML = table_body;
	      	            $('#result').html(table_body);
          				
          			},
          			error: function (xhr, textStatus, errorThrown) {
          	            alert(textStatus);
          	        }
        		})
         	});
         });
         
         $(document).ready(function() {
        	  $("#checkbox_div input:radio").click(function() {

        		  var radioValue = $("input[name='sort']:checked").val();
        		  $.ajax({
           			data: {'name' : radioValue},
           			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
           			url:'Sorting',
           			dataType:'text',
        				type:'POST',
        				headers :{
        				Accept:"application/json; charset=utf-8",
        						"Content-Type" : "application/x-www-form-urlencoded; charset=utf-8"
        				},
        				success: function(result,textStatus, request){
        					//alert(request.getResponseHeader('Content-Type'));
        					console.info(result);
  	         			var data = $.parseJSON(result);
  	      	            var table_body = '<thead><tr><th>name</th><th>price</th></tr></thead><tbody>';
  	     	         
  	      	            for(i =0;i<data.length;i++)
  	      	            {
  		      	            table_body+='<tr>';
  		      	            table_body +='<td>';
  		      	            table_body +=data[i].name;
  		      				table_body +='</td>';
  		     	                   
  		      				table_body +='<td>';
  		      				table_body +=data[i].price;
  		      				table_body +='</td>';
  		     	                
  		      				table_body+='</tr>';
  	      	           }
  	      	            table_body+='</tbody>';
  	      	           // document.getElementById('result').innerHTML = table_body;
  	      	            $('#result').html(table_body);
            				
            			},
            			error: function (xhr, textStatus, errorThrown) {
            	            alert(textStatus);
            	        }
          		});
        	    
        	   });
        	  
        	 // $("input:radio:first").prop("checked", true).trigger("click");
        	  
        	});
      </script>
      <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
      <!-- User defied css -->
      <link rel="stylesheet" href="style.css">
   </head>
   <body >
      <br />
      <div class="container">
      <div class="form-horizontal">
      <fieldset>
      <div class="form-group">
      <div class="col-sm-10">
      	<input type="text" id="search" name="search" value="" class="search" />
      </div>
      </div>
	 	<button type="submit" id="bttHello" class="btn btn-default">search</button>
	 	<br/>
	 	<br/>
	 	
	 	<div class="container">
			<table id="result"  class="table table-condensed">
      		</table>
	 	</div>
      </fieldset>
      </div>
      <div id="checkbox_div">
      <b><p>Sort By</p></b>
      
      <input type="radio" name="sort" value="Price" > Price<br>
  	  <input type="radio" name="sort" value="Rating" > Rating<br>
      </div>
      </div>
      
      
      
         	

         
         
      
   </body>
</html>