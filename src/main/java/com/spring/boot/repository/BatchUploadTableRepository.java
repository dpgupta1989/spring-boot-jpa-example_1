package com.spring.boot.repository;

import com.spring.boot.entity.BatchUploadTable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dpgupta on 11/1/2018.
 */
public interface BatchUploadTableRepository extends JpaRepository<BatchUploadTable, Integer>{
}
