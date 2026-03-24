package com.example.springdatajpa.repository;

import com.example.springdatajpa.domain.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface MenuRepository extends JpaRepository<Menu, Long> {

  List<Menu> findByNameContaining(String keyword);

  List<Menu> findByPriceBetween(int min, int max);

  boolean existsByPriceGreaterThan(int price);

  List<Menu> findByCategoryId(Long categoryId);

  Page<Menu> findByCategoryNameAndPriceGreaterThanEqual(
      String categoryName,
      int minPrice,
      Pageable pageable
  );

  Slice<Menu> findSliceByCategoryNameAndPriceGreaterThanEqual(
      String categoryName,
      int minPrice,
      Pageable pageable
  );

  // Search API
  @Query("""
        SELECT m
        FROM Menu m
        JOIN FETCH m.category
        WHERE m.name LIKE %:keyword%
    """)
  List<Menu> findByNameContainingWithCategory(@Param("keyword") String keyword);

  List<Menu> findByCategoryName(String categoryName);

  @Modifying(clearAutomatically = true, flushAutomatically = true)
  @Query("update Menu m set m.price = :price where m.id = :id")
  int updatePrice(@Param("id") Long id, @Param("price") int price);

}

