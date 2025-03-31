DROP TABLE IF EXISTS book_author_list;
DROP TABLE IF EXISTS book_authorlist;
DROP TABLE IF EXISTS Book_authorList;
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS Book;
DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS Author;
DROP TABLE IF EXISTS publisher;
DROP TABLE IF EXISTS Publisher;

CREATE TABLE IF NOT EXISTS publisher (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS author (
        id INT AUTO_INCREMENT PRIMARY KEY,
        first_name VARCHAR(255),
        last_name VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS book (
        id INT AUTO_INCREMENT PRIMARY KEY,
        title VARCHAR(255),
        price DOUBLE PRECISION,
        publisher_id BIGINT,
        CONSTRAINT FK_publisher
            FOREIGN KEY (publisher_id)
            REFERENCES publisher (id)
    );

CREATE TABLE IF NOT EXISTS book_author_list (
        book_id INT,
        author_list_id INT,
        PRIMARY KEY(book_id, author_list_id),
            CONSTRAINT FK_book FOREIGN KEY (book_id) REFERENCES book (id),
            CONSTRAINT FK_author FOREIGN KEY (author_list_id) REFERENCES author (id)
    );