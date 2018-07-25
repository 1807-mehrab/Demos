package com.revature.domain;

import javax.persistence.*;

@Entity
@Table(name="ANIMAL")
@Inheritance(strategy=InheritanceType.JOINED)
public class Animal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="animSeq")
	@SequenceGenerator(allocationSize=1, name="animSeq", sequenceName="PK_ANIM_SEQ")
	@Column(name="ANIMAL_ID")
	protected int id;
	
	@Column(name="ANIMAL_NAME")
	protected String name;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ANIMAL_CAVE")
	Cave cave;

}
