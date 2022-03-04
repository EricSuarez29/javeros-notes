package com.javeros.notesapp.models;

import java.io.Serializable;
import java.time.LocalDate;

//@Entity
//@Table(name = "notes")
public class Note implements Serializable {

	private static final long serialVersionUID = 1L;

	//@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(nullable = false, length = 30)
    private String title;

    //@Column(length = 255)
    private String description;

    //@Column(name = "create_at")
    private LocalDate createAt;

    //@PrePersist
    public void init(){
        this.createAt = LocalDate.now();
    }
    
    public Note() {}

	public Note(Long id, String title, String description, LocalDate createAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.createAt = createAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}
    
    
}
