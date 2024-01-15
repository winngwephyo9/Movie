package com.movie.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.model.Comment;

@Repository
public interface CommentInterface extends JpaRepository<Comment, Long> {

}
