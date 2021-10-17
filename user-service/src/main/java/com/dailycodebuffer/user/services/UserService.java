package com.dailycodebuffer.user.services;

import com.dailycodebuffer.user.VO.Department;
import com.dailycodebuffer.user.VO.ResponceTemplateVO;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("in saveUser of userService");
        return userRepository.save(user);
    }

    public ResponceTemplateVO getUserWithDepartment(Long userId) {
        log.info("in restTemplateVo of userService");
        ResponceTemplateVO vo = new ResponceTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);

        vo.setDepartment(department);
        vo.setUser(user);
        return vo;

    }
}
