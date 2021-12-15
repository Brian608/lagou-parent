package org.feather.dao;

import org.feather.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-15 20:26
 **/
public interface ResumeDao extends JpaRepository<Resume,Long> {

}
