package com.application.start.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="meta_title")
	private String meta_title;
	@Column(name="meta_description")
	private String meta_description;
	@Column(name="created_timestamp")
	private Timestamp created_timestamp;
	@Column(name="last_updated_timestamp")
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
	public void setCreated_timestamp(Timestamp created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	public Timestamp getLast_updated_timestamp() {
		return last_updated_timestamp;
	}
	public void setLast_updated_timestamp(Timestamp last_updated_timestamp) {
		this.last_updated_timestamp = last_updated_timestamp;
	}
	public int getId() {
		return id;
	}
}
