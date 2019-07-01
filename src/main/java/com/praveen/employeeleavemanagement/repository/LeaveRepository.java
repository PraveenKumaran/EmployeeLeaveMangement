/**
 * 
 */
package com.praveen.employeeleavemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praveen.employeeleavemanagement.domains.Leave;

/**
 * @author Madan
 *
 */
public interface LeaveRepository extends JpaRepository<Leave, Long> {

}
