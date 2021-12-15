package org.feather.controller;

import org.feather.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: lagou-parent
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2021-12-15 20:36
 **/
@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/openstate/{userId}")
    public  Integer findDefaultResumeState(@PathVariable Long userId){
        return  resumeService.findResumeByUserId(userId).getIsOpenResume();
    }
}
