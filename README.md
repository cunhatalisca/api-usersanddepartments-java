<h2>Hello, welcome to my repository</h2>
<p>This is a my fisrt API in SpringBoot </p>

<h2> 🗂️ Table of Contents </h2>
  <li><a href="#technologiesUsed">Technologies Used</a></li>
  <li><a href="#endpoints">Endpoints</a></li>
  <li><a href="#observations">Observations</a></li>
  <li><a href="#contact">Contact</a></li>

<h2 id="technologiesUsed">🖥️ Technologies Used</h2>
<ul>
  <li>Java</li>
  <li>Spring</li>
  <li>JPA / Hibernate</li>
  <li>H2 Database</li>
</ul>

<h2 id="endpoints">🌐 Endpoints</h2>

<h3>Users</h3>

|   Endpoints   |  Parameters  |    Verb    |
| :---         |     :---:      |          ---: |
| /users       |   *  |   POST    |
| /users  |   *  | GET    |
| /clients/{id}   |   *  | GET    |

<details>
    <summary>CREATE NEW USER - /clients </summary>
    
  ### Description
  
  - Create a new user and stores it in the database.
  
  ### Response Codes
  
  - `201`: CREATED.
  
  ### Request Example
  
  - POST - /users
  - HTTP/1.1
  - Host: localhost:8080
  - Content-Type: application/json
  
  ```json
{
	"name": "gabriel",
	"email": "gabriel@test.com",
  "department": {
      "id": 1
  }
}
  ```
    
  </details>
  
  <details>
    <summary> DETAIL CLIENT - /customers/{id}

 </summary>
    
  ### Description
  
  Details a user contained in the database according to its ID.
  
  ### Request Example
  
  - GET - /users/1
  - HTTP/1.1
  - Host: localhost:8080
  
  ### Response Example
  
  - HTTP/1.1 200 OK
  - Content-Type: application/json
  ```json
{
	"id": 1,
	"nome": "gabriel",
	"email": "gabriel@test.com",
	"department": {
      "id": 1,
      "department": "informática"
  }
}
  ```
    
  </details>

  <h2 id="observations">❗Observações</h2>
  <p>This is my first Spring Boot project. I created this application to start my studies. I hope to improve over time!</p>
  
  <h2 id="contact">📞Contact</h2>
  <ul>
    <li>Email: gabrielvlog11@hotmail.com</li>
    <li>LinkedIn: <a href="https://www.linkedin.com/in/gcunhaa18/">Gabriel Cunha</a></li>
  </ul>
