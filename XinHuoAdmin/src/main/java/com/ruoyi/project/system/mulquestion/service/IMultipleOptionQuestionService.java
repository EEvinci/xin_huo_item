package com.ruoyi.project.system.mulquestion.service;

import java.util.List;
import com.ruoyi.project.system.mulquestion.domain.MultipleOptionQuestion;

/**
 * 管理多选题Service接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface IMultipleOptionQuestionService 
{
    /**
     * 查询管理多选题
     * 
     * @param id 管理多选题主键
     * @return 管理多选题
     */
    public MultipleOptionQuestion selectMultipleOptionQuestionById(String id);

    /**
     * 查询管理多选题列表
     * 
     * @param multipleOptionQuestion 管理多选题
     * @return 管理多选题集合
     */
    public List<MultipleOptionQuestion> selectMultipleOptionQuestionList(MultipleOptionQuestion multipleOptionQuestion);

    /**
     * 新增管理多选题
     * 
     * @param multipleOptionQuestion 管理多选题
     * @return 结果
     */
    public int insertMultipleOptionQuestion(MultipleOptionQuestion multipleOptionQuestion);

    /**
     * 修改管理多选题
     * 
     * @param multipleOptionQuestion 管理多选题
     * @return 结果
     */
    public int updateMultipleOptionQuestion(MultipleOptionQuestion multipleOptionQuestion);

    /**
     * 批量删除管理多选题
     * 
     * @param ids 需要删除的管理多选题主键集合
     * @return 结果
     */
    public int deleteMultipleOptionQuestionByIds(String ids);

    /**
     * 删除管理多选题信息
     * 
     * @param id 管理多选题主键
     * @return 结果
     */
    public int deleteMultipleOptionQuestionById(String id);
}
