# synconexthire
Java Servlet Web Application


The above application should be imported in a eclipse ide,

Whether any third party libraries need to be download if the user does't have it before,

http://www.java2s.com/Code/Jar/m/Downloadmysqlconnectorjavajar.htm   - You can find the Myswl Connector in this link
http://www.java2s.com/Code/Jar/g/Downloadgson222jar.htm              - Google GSON jar available at this location


Note: The java servlet uses akax in the jsp side to post the request from ajax call and get the response for the same, and all the server calls in this application is performed using jquery and ajax 


All this jars should needs to pushed in catalina home and jdk,jre lib paths, FOR OTHER THIRD Party lib jars try importing the project and it can be identified at that time

1. Please download the application and import it in eclipse java ide
if it ask for any third party libraries kindly download the jar file from online and add the jar in the build path external jar options

2. try downloading apache tomcat from the official apache website and add the path in the eclipse server setup (add catalina jar to the home)

3. it is required to set the path of the jre in you workspace and all the apache tomcat jar required and mysql, google gson,etc.,

4. once you complete building the application try to refresh the application and setup the application server to hold on

5. in the build path add the external jar path of the servlet-api.jar which is available in the location of apache tomcat lib

6. there is an database sql file present in the repository, kindly import the sql in the mysql workbench 

7. try running the application and try to give the name of the network provider you want to search

8. the autocomplete suggestion will be availble in the module 

9. also the rating radio buttons available at the bottom, click the radio button in which you want to sort the network list

10. For all the modules the screenshots are available in the repository with the folder name screenshotss


Files Assosiated for the functionalities are
src/com/dao - CONTAINS THE FILE FOR DB CONNECTION AND RETURN SEARCH LIST FOR AUTO COMPLETE
src/com/servlet - CONTAINS THE SERVLET FOR SORTING, DISPLAY ALL THE DATA, SEARCHING, AUTO COMPLETE
src/entities - CONTAINS THE ENITITY TO RETURN THE VALUES WITH CORRESPONDING GETTER AND SETTER
src/model - CONTAINS THE MODEL TO RETURN TURN THE DATABASE TABLE TO OBJECT ENTITY LIST WHICH FURTHER CONVERTS TO GSON.TOJSON

WebContent - CONTAINS THE autocomplete jquery ajax call, and when you enter the page all the list should be displayed for that onload jquery file executes at the refresh time
WebContetn/style and index.jsp are the CSS and index of the application


HappyCoding :)
