package com.movie.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "movie_id")
  private long movieId;

  public Comment(long id, long movieId, long commenterEmail, long commentText) {
    super();
    this.id = id;
    this.movieId = movieId;
    this.commenterEmail = commenterEmail;
    this.commentText = commentText;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getMovieId() {
    return movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }

  public long getCommenterEmail() {
    return commenterEmail;
  }

  public void setCommenterEmail(long commenterEmail) {
    this.commenterEmail = commenterEmail;
  }

  public long getCommentText() {
    return commentText;
  }

  public void setCommentText(long commentText) {
    this.commentText = commentText;
  }

  @Column(name = "commenter_email")
  private long commenterEmail;

  @Column(name = "comment_text")
  private long commentText;
}
