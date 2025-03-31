package myproject.s29315tpo04books;

import myproject.s29315tpo04books.model.Author;
import myproject.s29315tpo04books.model.Publisher;
import myproject.s29315tpo04books.repository.AuthorRepository;
import myproject.s29315tpo04books.repository.BookRepository;
import myproject.s29315tpo04books.repository.PublisherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class S29315Tpo04BooksApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(S29315Tpo04BooksApplication.class, args);
        BookRepository bookRepository = context.getBean(BookRepository.class);
        PublisherRepository publisher = context.getBean(PublisherRepository.class);
        AuthorRepository author = context.getBean(AuthorRepository.class);
    }

}
