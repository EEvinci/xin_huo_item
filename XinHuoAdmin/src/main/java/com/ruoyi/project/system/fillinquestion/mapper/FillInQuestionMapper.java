package com.ruoyi.project.system.fillinquestion.mapper;

import java.util.List;
import com.ruoyi.project.system.fillinquestion.domain.FillInQuestion;

/**
 * 管理填空题Mapper接口
 * 
 * @author ruoyi
 * @date 2022-11-18
 */
public interface FillInQuestionMapper 
{
    /**
     * 查询管理填空题
     * 
     * @param id 管理填空题主键
     * @return 管理填空题
     */
    public FillInQuestion selectFillInQuestionById(String id);

    /**
     * 查询管理填空题列表
     * 
     * @param fillInQuestion 管理填空题
     * @return 管理填空题集合
     */
    public List<FillInQuestion> selectFillInQuestionList(FillInQuestion fillInQuestion);

    /**
     * 新增管理填空题
     * 
     * @param fillInQuestion 管理填空题
     * @return 结果
     */
    public int insertFillInQuestion(FillInQuestion fillInQuestion);

    /**
     * 修改管理填空题
     * 
     * @param fillInQuestion 管理填空题
     * @return 结果
     */
    public int updateFillInQuestion(FillInQuestion fillInQuestion);

    /**
     * 删除管理填空题
     * 
     * @param id 管理填空题主键
     * @return 结果
     */
    public int deleteFillInQuestionById(String id);

    /**
     * 批量删除管理填空题
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFillInQuestionByIds(String[] ids);
}
