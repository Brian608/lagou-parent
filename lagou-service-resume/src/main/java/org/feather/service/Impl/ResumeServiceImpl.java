package org.feather.service.Impl;

import org.feather.dao.ResumeDao;
import org.feather.pojo.Resume;
import org.feather.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-15 20:32
 **/
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;
    /**
     * 通过userid查询简历
     *
     * @param userId
     * @return
     */
    @Override
    public Resume findResumeByUserId(Long userId) {
        Resume resume=new Resume();
        resume.setUserId(userId);
        resume.setIsDefault(1);
        Example< Resume> example=Example.of(resume);
        return resumeDao.findOne(example).get();
    }
}
