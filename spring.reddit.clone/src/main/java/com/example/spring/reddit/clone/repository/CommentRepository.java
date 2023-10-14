package com.example.spring.reddit.clone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.reddit.clone.model.Comment;
import com.example.spring.reddit.clone.model.Post;
import com.example.spring.reddit.clone.model.User;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);

}
