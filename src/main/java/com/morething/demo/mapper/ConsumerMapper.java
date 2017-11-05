package com.morething.demo.mapper;

import com.morething.demo.model.*;
import org.springframework.context.annotation.Bean;


public interface ConsumerMapper {
	Consumer selectByPhone(int phone);
}
