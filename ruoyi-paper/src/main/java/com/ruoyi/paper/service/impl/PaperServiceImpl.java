package com.ruoyi.paper.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.paper.mapper.PaperMapper;
import com.ruoyi.paper.domain.Paper;
import com.ruoyi.paper.service.IPaperService;

/**
 * 论文Service业务层处理
 * 
 * @author Julie
 * @date 2025-09-08
 */
@Service
public class PaperServiceImpl implements IPaperService 
{
    @Autowired
    private PaperMapper paperMapper;

    /**
     * 查询论文
     * 
     * @param paperId 论文主键
     * @return 论文
     */
    @Override
    public Paper selectPaperByPaperId(Long paperId)
    {
        return paperMapper.selectPaperByPaperId(paperId);
    }

    /**
     * 查询论文列表
     * 
     * @param paper 论文
     * @return 论文
     */
    @Override
    public List<Paper> selectPaperList(Paper paper)
    {
        return paperMapper.selectPaperList(paper);
    }

    /**
     * 新增论文
     * 
     * @param paper 论文
     * @return 结果
     */
    @Override
    public int insertPaper(Paper paper)
    {
        paper.setCreateTime(DateUtils.getNowDate());
        return paperMapper.insertPaper(paper);
    }

    /**
     * 修改论文
     * 
     * @param paper 论文
     * @return 结果
     */
    @Override
    public int updatePaper(Paper paper)
    {
        paper.setUpdateTime(DateUtils.getNowDate());
        return paperMapper.updatePaper(paper);
    }

    /**
     * 批量删除论文
     * 
     * @param paperIds 需要删除的论文主键
     * @return 结果
     */
    @Override
    public int deletePaperByPaperIds(Long[] paperIds)
    {
        return paperMapper.deletePaperByPaperIds(paperIds);
    }

    /**
     * 删除论文信息
     * 
     * @param paperId 论文主键
     * @return 结果
     */
    @Override
    public int deletePaperByPaperId(Long paperId)
    {
        return paperMapper.deletePaperByPaperId(paperId);
    }
}
