package com.cg.iter.bookorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.iter.bookorder.entity.BookOrderEntity;


@Repository
public interface BookOrderRepo extends JpaRepository<BookOrderEntity, Long>
{

}
