package com.testsb.services;

import com.testsb.models.Groupgroup;
import com.testsb.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

    private GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Groupgroup getById(Integer id) {
        return groupRepository.findOne(id);
    }
}