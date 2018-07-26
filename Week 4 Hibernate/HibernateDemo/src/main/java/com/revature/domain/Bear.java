package com.revature.domain;

import javax.persistence.*;

@NamedQueries({
	@NamedQuery(
			name="findBearByName",
			query="from Bear where bear_name = :nameVar"
	)
})

@Entity
@Table(name = "BEAR")
public class Bear {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bearSeq")
	@SequenceGenerator(allocationSize=1, name="bearSeq", sequenceName="PK_BEAR_SEQ")
	@Column(name = "BEAR_ID")
	private int id;
	
	@Column(name="BEAR_NAME")
	private String name;
	
	@Column(name="BEAR_AGE")
	private int age;
	
	@Column(name="BEAR_WEIGHT")
	private double weight;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="BEAR_CAVE")
	Cave cave;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Cave getCave() {
		return cave;
	}

	public void setCave(Cave cave) {
		this.cave = cave;
	}

	public Bear(int id, String name, int age, double weight, Cave cave) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.cave = cave;
	}

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "Bear [id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + ", cave=" + cave + "]";
//	}
	
	
}
