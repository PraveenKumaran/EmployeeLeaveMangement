/**
 * 
 */
package com.praveen.employeeleavemanagement.services.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.employeeleavemanagement.domains.Leave;
import com.praveen.employeeleavemanagement.repository.LeaveRepository;
import com.praveen.employeeleavemanagement.services.LeaveService;

/**
 * @author Madan
 *
 */
@Service
@Transactional
public class LeaveServiceImpl implements LeaveService {
	
	@Autowired
	private LeaveRepository repository;

	@Override
	public List<Leave> findAll() {
		return repository.findAll();
	}

	@Override
	public Leave findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Leave save(Leave t) {
		return repository.save(t);
	}
	
	@Override
	public void delete(Leave t) {
		repository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);	
	}

}
