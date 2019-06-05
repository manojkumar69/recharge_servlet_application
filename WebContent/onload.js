$(window).on("load", loadUserTable);

function loadUserTable(userType=null){
         $.ajax({
               type: "GET",
               url: "/DataServlet",
               data: "name=" + userType,
               success: function(response){
                   var obj = JSON.parse(response);
                   $("#tableId").html("");
                   var tr="<tr><th>Name</th><th>Price</th></tr>";
                   for (var i = 0; i < obj.length; i++){
                         tr+="<tr>";
                         tr+="<td>" + obj[i].name + "</td>";
                         tr+="<td>" + obj[i].price + "</td>";
                         tr+="</tr>";
                   }
                   $("#tableId").append(tr);
               }
         });
 }