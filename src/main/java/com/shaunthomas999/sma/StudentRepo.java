package com.shaunthomas999.sma;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by shaunthomas on 30/07/2017.
 */
public interface StudentRepo extends PagingAndSortingRepository<Student, Long> {
}
