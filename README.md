<p align="center">
  <img alt="Library System" src=".github/banner.svg" width="400px"/>
</p>

<p align="center">
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/rafaelfachinelli/sistemadebiblioteca?color=3498db&style=for-the-badge">
  <img alt="Last commit" src="https://img.shields.io/github/last-commit/rafaelfachinelli/sistemadebiblioteca?color=3498db&style=for-the-badge">
  <a href="https://rafaelfachinelli.com">
    <img alt="Developed by Rafael Fachinelli" src="https://img.shields.io/badge/Developer-Rafael_Fachinelli-3498db?style=for-the-badge">
  </a>
  <img alt="License" src="https://img.shields.io/badge/License-MIT-3498db?style=for-the-badge">
</p>

<p align="center">
  <a href="#information_source-about">About</a> •
  <a href="#memo-tasks">Tasks</a> •
  <a href="#arrow_forward-run">Run</a> •
  <a href="#hammer_and_wrench-technologies">Technologies</a> •
  <a href="#boy-author">Author</a> •
  <a href="#balance_scale-license">License</a>
</p>

---

## :information_source: About

📚 A library system for lending and returning books, built in Java with Spring Boot by Joabe Benção, Lucas Fernandes and Rafael Fachinelli in a FATEC course, to get familiar with web development on the Java platform.

The library clerk registers, searches, edits and deletes books and users, and records loans and returns. Pages are rendered with Thymeleaf, data is stored with Spring Data JPA in an H2 database, and access is protected with Spring Security.

The work followed an adaptation of Scrum: each sprint lasted four classes and ended with a review with the teacher and a team retrospective. Requirements were written as user stories with acceptance test cases (given / when / then).

Built in 2020.

---

## :memo: Tasks

<div align="center">
<details>
<summary>Click to view</summary>

|State|Task|
|:---:|:---|
|:heavy_check_mark:|REQ01: register a book|
|:heavy_check_mark:|REQ02: search a book|
|:heavy_check_mark:|REQ03: edit a book|
|:heavy_check_mark:|REQ04: delete a book|
|:heavy_check_mark:|REQ05: register a user|
|:heavy_check_mark:|Loans and returns|
|:heavy_check_mark:|Login with Spring Security|

</details>
</div>

---

## :arrow_forward: Run

You need Java 11+. In the [`scel/`](scel/) folder:

```bash
# Start the application (H2 in-memory database)
./mvnw spring-boot:run
```

> The app opens at <http://localhost:8080>.

---

## :hammer_and_wrench: Technologies

<div align="center">

|Server|Web|
|:---:|:---:|
|[Java](https://dev.java/)|[HTML5](https://developer.mozilla.org/en-US/docs/Web/HTML)|
|[Spring Boot](https://spring.io/projects/spring-boot)|[Bootstrap](https://getbootstrap.com/)|
|[Spring Data JPA](https://spring.io/projects/spring-data-jpa)|[JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript)|
|[Spring Security](https://spring.io/projects/spring-security)||
|[Thymeleaf](https://www.thymeleaf.org/)||
|[H2](https://www.h2database.com/)||
|[Maven](https://maven.apache.org/)||

</div>

---

## :boy: Author

<div align="center">

<a href="https://rafaelfachinelli.com">
  <img src="https://github.com/rafaelfachinelli.png" width="100px" alt="Rafael Fachinelli"/>
  <br/>
  <sub><b>Rafael Fachinelli</b></sub>
</a>

Tech Lead and software engineer. Get in touch!

[![Portfolio](https://img.shields.io/badge/-rafaelfachinelli.com-3498db?style=flat-square&logo=googlechrome&logoColor=white)](https://rafaelfachinelli.com)
[![LinkedIn](https://img.shields.io/badge/-Rafael_Fachinelli-0a66c2?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/rafaelfachinelli/)
[![GitHub](https://img.shields.io/badge/-rafaelfachinelli-000?style=flat-square&logo=github&logoColor=white)](https://github.com/rafaelfachinelli)
[![E-mail](https://img.shields.io/badge/-rafael.l.a.fachinelli@gmail.com-ea4335?style=flat-square&logo=gmail&logoColor=white)](mailto:rafael.l.a.fachinelli@gmail.com)

</div>

---

## :balance_scale: License

This project is under the [MIT license](./LICENSE).
