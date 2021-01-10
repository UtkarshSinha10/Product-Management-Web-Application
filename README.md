# Product Management Web Application
 Project includes one to many mapping of customers and products. Different  API calls for adding, retrieving, and updating information of customers and their purchasing in two different databases.
#Java  #SpringBoot  #MySQL(JPA Queries and JOINS)  #APIs

<p aign="center">
 <p>Project Architecture</p><img alt="Project Architecture" src="assets/customerproduct.png" width="700" margin="10px"/>
 <p>Database with their tables</p><img alt="Poject Screenshots" src="assets/1.png" width="700" margin="10px"/>
 <p>Customer table</p><img alt="Poject Screenshots" src="assets/2.png" width="700" margin="10px"/>
 <p>Product table</p><img alt="Poject Screenshots" src="assets/3.png" width="700" margin="10px"/>
 <p>Building and deploying spring boot application on local host 8080</p><img alt="Poject Screenshots" src="assets/4.png" width="700" margin="10px"/>
 <p>Dependencies includes Lombok, MySQL Connector,Spring Web, JPA dependencies</p><img alt="Poject Screenshots" src="assets/5.png" width="700" margin="10px"/>
 <p>Stand-alone application created through Spring Boot Framework</p><img alt="Poject Screenshots" src="assets/6.png" width="700" margin="10px"/>
 <p>Customer class used as entity while creating table in database</p><img alt="Poject Screenshots" src="assets/7.png" width="700" margin="10px"/>
 <p>Product class used as entity while creating table in database</p><img alt="Poject Screenshots" src="assets/8.png" width="700" margin="10px"/>
 <p>Order Request class</p><img alt="Poject Screenshots" src="assets/9.png" width="700" margin="10px"/>
 <p>Order Response class</p><img alt="Poject Screenshots" src="assets/10.png" width="700" margin="10px"/>
 <p>Interface CustomerRepository extending JPARepository interface with explicitly defined query</p><img alt="Poject Screenshots" src="assets/11.png" width="700" margin="10px"/>
 <p>Interface ProductRepository extending JPARepository interface</p><img alt="Poject Screenshots" src="assets/12.png" width="700" margin="10px"/>
 <p>Controller handling different API calls</p><img alt="Poject Screenshots" src="assets/13.png" width="700" margin="10px"/>
 <p>Defining required properties in appicationproperties</p><img alt="Poject Screenshots" src="assets/14.png" width="700" margin="10px"/>
 <p>API call for localhost:8080/findAllOrders with response status 200 and Array of customers and products associated with it</p>
 <img alt="Poject Screenshots" src="assets/15.png" width="700" margin="10px"/>
 <img alt="Poject Screenshots" src="assets/16.png" width="700" margin="10px"/>
 <img alt="Poject Screenshots" src="assets/17.png" width="700" margin="10px"/>
 <img alt="Poject Screenshots" src="assets/18.png" width="700" margin="10px"/>
 
 <p>API call for  localhost:8080/getInfo, returning array of name and product for each product</p>
 <img alt="Poject Screenshots" src="assets/19.png" width="700" margin="10px"/>
 <img alt="Poject Screenshots" src="assets/20.png" width="700" margin="10px"/>
 <p>API call - POST request - localhost:8080/placeOrder with its JSON body</p>
 <img alt="Poject Screenshots" src="assets/21.png" width="700" margin="10px"/>
 <p>Response with status 200 OK </p>
 <img alt="Poject Screenshots" src="assets/22.png" width="700" margin="10px"/>
 <p>API call for localhost:8080/findAllOrders with response status 200 and our newly added customer and related product are inserted in our tables i.e. in database</p>
 <img alt="Poject Screenshots" src="assets/23.png" width="700" margin="10px"/>
 </p>
