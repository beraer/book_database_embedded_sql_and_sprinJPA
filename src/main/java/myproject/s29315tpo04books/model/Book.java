package myproject.s29315tpo04books.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Double price;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Author> authorList = new ArrayList<>();

    public Book(String title, Double price, Publisher publisher, List<Author> authorList) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.authorList = authorList;
    }

    public Book() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }
}

