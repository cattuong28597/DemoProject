package com.cg.repository;

import com.cg.model.Order;
import com.cg.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

    List<OrderDetail> findAllByDeletedIsFalse();

    List<OrderDetail> findAllByOrder(Order order) ;
}
