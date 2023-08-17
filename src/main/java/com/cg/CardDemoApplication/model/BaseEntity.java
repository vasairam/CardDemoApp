package com.cg.CardDemoApplication.model;



import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;


@Getter
public class BaseEntity {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transid")
    private Long id;

    @Column(name="transid")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
