package com.tamerb.data.repository;

import com.tamerb.data.entity.BlogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// JpaRepository
// CrudRepository
// PagingAndSortingRepository

@Repository
public interface IBlogRepository extends CrudRepository<BlogEntity,Long> {
     BlogEntity findBlogEntityByBlogEntityEmbeddableHeader(String header);
}
