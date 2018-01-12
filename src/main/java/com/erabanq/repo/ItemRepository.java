package com.erabanq.repo;

import com.erabanq.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


//@PreAuthorize("hasRole('ROLE_USER')")
public interface ItemRepository extends CrudRepository<Item, Long> {

    @Override
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    <S extends Item> S save(S s);


    @Override
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteById(Long aLong);


//    @Modifying
//    @Transactional
//    @Query("DELETE FROM Answer a WHERE a.question.id = :questionId)")
//    void deleteAllByQuestionId(@Param("questionId") Long questionId);

//    @Query("SELECT i FROM Interview i WHERE i.state = :state)")
//    Set<Interview> find(@Param(State.class) State state);
//
//    Set<Interview> findByState(@Param(State.class) State state);

}

