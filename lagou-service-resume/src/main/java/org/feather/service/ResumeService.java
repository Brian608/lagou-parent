package org.feather.service;

import org.feather.pojo.Resume;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-15 20:30
 **/
public interface ResumeService {

    /**
     * 通过userid查询简历
     * @param userId
     * @return
     */
    Resume findResumeByUserId(Long userId);
}
