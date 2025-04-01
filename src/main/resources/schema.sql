DROP TABLE IF EXISTS book_author;
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS publisher;

CREATE TABLE publisher (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL
);

CREATE TABLE author (
        id INT AUTO_INCREMENT PRIMARY KEY,
        first_name VARCHAR(255) NOT NULL,
        last_name VARCHAR(255) NOT NULL
);

CREATE TABLE book (
        id INT AUTO_INCREMENT PRIMARY KEY,
        title VARCHAR(255) NOT NULL,
        price DOUBLE,
        publisher_id INT NOT NULL,
        CONSTRAINT fk_book_publisher FOREIGN KEY (publisher_id) REFERENCES publisher(id) ON DELETE CASCADE
);

CREATE TABLE book_author (
        book_id INT NOT NULL,
        author_id INT NOT NULL,
        PRIMARY KEY (book_id, author_id),
        CONSTRAINT fk_ba_book FOREIGN KEY (book_id) REFERENCES book(id) ON DELETE CASCADE,
        CONSTRAINT fk_ba_author FOREIGN KEY (author_id) REFERENCES author(id) ON DELETE CASCADE
);
