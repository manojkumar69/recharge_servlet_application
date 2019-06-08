$(window).on("load", loadUserTable);

function loadUserTable(){
	
	var obj = "";
	$.ajax({
			url:'DataServlet',
			data: "name="+obj,
			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
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
}