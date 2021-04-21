package com.taohan.online.exam.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taohan.online.exam.po.ExamChooseInfo;

/**
  *
  * <p>Title: ExamChooseInfoMapper</p>
  * <p>Description: </p>
  * @author: taohan
  * @date: 2018-8-25
  * @time: 上午10:33:21
  * @version: 1.0
  */

@Repository
public interface ExamChooseInfoMapper {

	ExamChooseInfo getChooseWithIds(Map<String, Object> map);
	
	int updateChooseWithIds(ExamChooseInfo examChoose);
	
	int addChoose(Map<String, Object> map);
	
	List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map);
	
	List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map);
}
