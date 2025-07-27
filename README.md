Library Management System (Java + Swing + MySQL):
A simple library management desktop application built using Java Swing for the GUI and MySQL as the backend database. The system allows administrators to manage books, students, and book issues and returns efficiently through an easy-to-use interface.

Features:
User Authentication: Simple sign-in screen for admin login.
Book Management: Add new books, view the book list.
Student Registration: Register students with details like name, course, and year.
Issue Book: Issue books to registered students and set a return date.
Return Book: Mark issued books as returned by students.
Dashboard: Central menu for quick navigation of all features.
Beautiful UI: Each window has a custom background image.

Technologies Used:
Java Swing: For crafting the graphical user interface.
MySQL: As the database for storing books, students, and transactions.
JDBC: For connecting Java with MySQL

Project Structure:
Library-Management-System/
│
├── src/
│   ├── AddBook.java
│   ├── IssueBook.java
│   ├── ReturnBook.java
│   ├── Login.java
│   ├── Dashboard.java
│   └── ...
│
├── images/
│   └── (all UI icons and backgrounds)
│
├── nbproject/
│   └── (NetBeans project settings)
│
├── README.md
└── build.xml


Database Setup:
1. Install MySQL (e.g., using XAMPP or standalone).
2. Create database and tables:

CREATE DATABASE library;
USE library;

CREATE TABLE books (
  book_id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255),
  author VARCHAR(255),
  publisher VARCHAR(255),
  quantity INT
);

CREATE TABLE students (
  student_id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  course VARCHAR(100),
  year INT
);

CREATE TABLE issued_books (
  issue_id INT AUTO_INCREMENT PRIMARY KEY,
  student_id INT,
  book_id INT,
  issue_date DATE,
  return_date DATE,
  FOREIGN KEY (student_id) REFERENCES students(student_id),
  FOREIGN KEY (book_id) REFERENCES books(book_id)
);

How to Run:
1. Requirements
Java JDK 8 or higher.
MySQL Server.
MySQL JDBC Driver (Connector/J) added to your project build path.

2. Clone and Compile
  git clone <your-repo-url>
# Add the MySQL JDBC driver .jar to your lib or project settings

cd <project-root>
# Compile all .java files, e.g.:
javac -cp .;path/to/mysql-connector-java-8.x.xx.jar library/*.java

3. Run the Application:
   java -cp .;path/to/mysql-connector-java-8.x.xx.jar library.SignIn

Login Credentials:
    Username: admin
    Password: admin123

4. Notes
 1. Make sure images used for background (/images/addbook.jpg, /images/homepage.jpg, etc.) exist  2. in the specified path inside src/library/images/.
 3. Adjust window dimensions in the code if needed for your display.
 4. Add the JDBC driver to your IDE (like NetBeans or Eclipse), if using.

TECH STACK:

  | Layer    | Technology                        |
  | -------- | --------------------------------- |
  | Frontend | Java Swing (JFrame, JPanel)       |
  | Backend  | JDBC for MySQL/SQLite integration |
  | IDE      | NetBeans                          |
  | Language | Java                              |



Screenshots:

SignIn: 
<img width="1578" height="846" alt="image" src="https://github.com/user-attachments/assets/5809870b-4020-4dd1-8a02-a32a6af135f5" />

Dashboard:
<img width="1177" height="703" alt="image" src="https://github.com/user-attachments/assets/05d5e890-5b24-4bed-a87d-0e8ae9752709" />

IssueBook:
<img width="495" height="402" alt="image" src="https://github.com/user-attachments/assets/3031365a-2170-4ff2-a7af-b7ae8746b434" />

ReturnBook:
<img width="500" height="400" alt="image" src="https://github.com/user-attachments/assets/c852a18d-4238-49ee-93db-b1045cabcef6" />

AddBook:
<img width="1196" height="683" alt="image" src="https://github.com/user-attachments/assets/5290a07d-41ad-414c-b303-6e76bf0657f4" />

StudentRegstration:
<img width="1477" height="847" alt="image" src="https://github.com/user-attachments/assets/b8cbd33e-c0d1-4189-a09d-ac436377eac5" />
