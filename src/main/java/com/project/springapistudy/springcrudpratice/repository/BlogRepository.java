package com.project.springapistudy.springcrudpratice.repository;

import com.project.springapistudy.springcrudpratice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
