[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[MYSQL_BADGE]: https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white
[PRS_BADGE]:https://img.shields.io/badge/PRs-welcome-green?style=for-the-badge


<h1 align="center" style="font-weight: bold;">CRUD - Spring Boot 💻</h1>

![spring][SPRING_BADGE]
![java][JAVA_BADGE]
![MySQL][MYSQL_BADGE]
![prs][PRS_BADGE]

<details open="open">
<summary>Table of Contents</summary>
  
- [🚀 Getting started](#started)
  - [Prerequisites](#prerequisites)
  - [Cloning](#cloning)
  - [Environment Variables](#environment-variables)
  - [Starting](#starting)
- [📍 API Endpoints](#routes)
  - [GET /authenticate](#get-auth-detail)
  - [POST /authenticate](#post-auth-detail)
- [🤝 How to Reach Me](#reach)
- [📌 Obs](#obs)
  
</details>

<p align="center">
  <b>A CRUD Spring Boot application for managing an investment aggregator.</b>
</p>

<h2 id="started">🚀 Getting started</h2>

<h3>Prerequisites</h3>

- [Java](https://www.oracle.com/br/java/technologies/downloads/)
- [Docker](https://www.docker.com/)

<h3>Cloning</h3>

```bash
git clone https://github.com/monosodrac/CRUD_SpringBoot.git
```

<h3>Environment Variables</h2>

```yml
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
spring.datasource.username=springuser
spring.datasource.password=ThePassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
```

<h3>Starting</h3>

```bash
docker-compose up
./mvnw spring-boot:run
``````


<h2 id="routes">📍 API Endpoints</h2>
​

| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>POST /v1/users</kbd>     | create user [request details](#post-auth-detail)
| <kbd>GET /v1/users/{userId}</kbd>     | retrieves user info see [response details](#get-auth-detail)
| <kbd>GET /v1/users</kbd>     | retrieves all users info
| <kbd>PUT /v1/users/{userId}</kbd>     | update user info see [request details](#put-auth-detail)
| <kbd>DELETE /v1/users/{userId}</kbd>     | delete user

<h3 id="post-auth-detail">POST /v1/users</h3>

**REQUEST**
```json
{
	"username": "John Doe",
	"email": "johndoe@exemplo.com",
	"password": "123"
}
```

<h3 id="get-auth-detail">GET /v1/users/{userId}</h3>

**RESPONSE**
```json
{
	"userID": "62711516-5fd6-4742-916d-bea982b0b3bb",
	"username": "John Doe",
	"email": "johndoe@exemplo.com",
	"password": "123",
	"creationTimestamp": "2025-09-30T22:10:36.314338Z",
	"updateTimestamp": "2025-09-30T22:10:36.314338Z"
}
```

<h3 id="put-auth-detail">PUT /v1/users/{userId}</h3>

**REQUEST**
```json
{
	"username": "John Doe Second",
	"password": "123"
}
```

<h2 id="reach">🤝 How to reach me</h2>

<table>
  <tr>
    <td align="center">
      <a href="https://linktr.ee/monosodrac">
        <img src="https://avatars.githubusercontent.com/u/141099551?v=4" width="100px;" alt="Mono Cardoso Profile Picture"/><br>
        <sub>
          <b>Mono</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<h2 id="obs">📌 Obs</h2>

This project was developed based on the video from the channel [Build & Run](https://www.youtube.com/watch?v=Tnl4YnB6E54&t=151s).
