CREATE DATABASE library_management;
USE library_management
CREATE TABLE books (
    book_id INT IDENTITY(1,1) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author_id INT,
    isbn VARCHAR(20) UNIQUE,
    published_year INT,
    category VARCHAR(100),
    available_copies INT DEFAULT 0
);
CREATE TABLE members (
    member_id INT IDENTITY(1,1) PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE,
    phone_number VARCHAR(15),
    address VARCHAR(255),
    join_date DATE DEFAULT GETDATE()
);
CREATE TABLE authors (
    author_id INT IDENTITY(1,1) PRIMARY KEY,
    full_name VARCHAR(255) NOT NULL,
    bio TEXT
);


