package com.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "username")
  private long username;

  @Column(name = "password")
  private long password;

  public User(long id, long username, long password) {
    super();
    this.id = id;
    this.username = username;
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUsername() {
    return username;
  }

  public void setUsername(long username) {
    this.username = username;
  }

  public long getPassword() {
    return password;
  }

  public void setPassword(long password) {
    this.password = password;
  }
}
