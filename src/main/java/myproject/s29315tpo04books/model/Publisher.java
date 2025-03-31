package myproject.s29315tpo04books.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.EAGER)
    private List<Book> bookList = new ArrayList<>();

    public Publisher(String name, List<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    public Publisher() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
