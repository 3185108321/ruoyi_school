package com.ruoyi.paper.service;

import java.util.List;
import com.ruoyi.paper.domain.Paper;

/**
 * 论文Service接口
 * 
 * @author Julie
 * @date 2025-09-08
 */
public interface IPaperService 
{
    /**
     * 查询论文
     * 
     * @param paperId 论文主键
     * @return 论文
     */
    public Paper selectPaperByPaperId(Long paperId);

    /**
     * 查询论文列表
     * 
     * @param paper 论文
     * @return 论文集合
     */
    public List<Paper> selectPaperList(Paper paper);

    /**
     * 新增论文
     * 
     * @param paper 论文
     * @return 结果
     */
    public int insertPaper(Paper paper);

    /**
     * 修改论文
     * 
     * @param paper 论文
     * @return 结果
     */
    public int updatePaper(Paper paper);

    /**
     * 批量删除论文
     * 
     * @param paperIds 需要删除的论文主键集合
     * @return 结果
     */
    public int deletePaperByPaperIds(Long[] paperIds);

    /**
     * 删除论文信息
     * 
     * @param paperId 论文主键
     * @return 结果
     */
    public int deletePaperByPaperId(Long paperId);
}
