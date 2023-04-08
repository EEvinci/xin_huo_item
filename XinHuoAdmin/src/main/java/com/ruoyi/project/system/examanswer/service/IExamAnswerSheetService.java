package com.ruoyi.project.system.examanswer.service;

import java.util.List;
import com.ruoyi.project.system.examanswer.domain.ExamAnswerSheet;

/**
 * 答卷管理Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface IExamAnswerSheetService 
{
    /**
     * 查询答卷管理
     * 
     * @param id 答卷管理主键
     * @return 答卷管理
     */
    public ExamAnswerSheet selectExamAnswerSheetById(String id);

    /**
     * 查询答卷管理列表
     * 
     * @param examAnswerSheet 答卷管理
     * @return 答卷管理集合
     */
    public List<ExamAnswerSheet> selectExamAnswerSheetList(ExamAnswerSheet examAnswerSheet);

    /**
     * 新增答卷管理
     * 
     * @param examAnswerSheet 答卷管理
     * @return 结果
     */
    public int insertExamAnswerSheet(ExamAnswerSheet examAnswerSheet);

    /**
     * 修改答卷管理
     * 
     * @param examAnswerSheet 答卷管理
     * @return 结果
     */
    public int updateExamAnswerSheet(ExamAnswerSheet examAnswerSheet);

    /**
     * 批量删除答卷管理
     * 
     * @param ids 需要删除的答卷管理主键集合
     * @return 结果
     */
    public int deleteExamAnswerSheetByIds(String ids);

    /**
     * 删除答卷管理信息
     * 
     * @param id 答卷管理主键
     * @return 结果
     */
    public int deleteExamAnswerSheetById(String id);
}
