package com.morething.demo.serviceImpl;

import com.morething.demo.mapper.ConsumerMapper;
import com.morething.demo.service.ConsumerService;
import com.morething.demo.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService{
	private ConsumerMapper consumerMapper;

	@Autowired
	public void setConsumerMapper(ConsumerMapper consumerMapper){
		this.consumerMapper = consumerMapper;
	}

	public Consumer selectByPhone(int phone){
		return consumerMapper.selectByPhone(phone);
	}

}
