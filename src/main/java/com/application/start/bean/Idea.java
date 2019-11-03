package com.application.start.bean;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.sql.Timestamp;

@Entity
@Table(name="idea")
public class Idea {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	@NotNull
	@Size(min=5,message="Name should atleast contain 5 characters")
	private String name;
	@NotNull
	@Size(min=50,message="description should atleast contain 50 characters")
	@Column(name="description")
	private String description;
	@Column(name="category_id")
	private int category_id;
	@Column(name="meta_title")
	private String meta_title;
	@Column(name="meta_description")
	private String meta_description;
	@Column(name="created_timestamp")
	@NotNull
	private Timestamp created_timestamp;
	@Column(name="last_updated_timestamp")
	@NotNull
	private Timestamp last_updated_timestamp;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeta_title() {
		return meta_title;
	}
	public void setMeta_title(String meta_title) {
		this.meta_title = meta_title;
	}
	public String getMeta_description() {
		return meta_description;
	}
	public void setMeta_description(String meta_description) {
		this.meta_description = meta_description;
	}
	public Timestamp getCreated_timestamp() {
		return created_timestamp;
	}
	public Timestamp getLast_updated_timestamp() {
		return last_updated_timestamp;
	}
	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategory_id() {
		return category_id;
	}
}
