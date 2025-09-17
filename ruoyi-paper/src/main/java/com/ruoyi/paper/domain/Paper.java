package com.ruoyi.paper.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 论文对象 biz_paper
 * 
 * @author Julie
 * @date 2025-09-08
 */
public class Paper extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 论文ID */
    private Long paperId;

    /** 论文标题 */
    @Excel(name = "论文标题")
    private String title;

    /** 关键词 */
    @Excel(name = "关键词")
    private String keywords;

    /** 摘要 */
    @Excel(name = "摘要")
    private String abstractText;

    /** 发表日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发表日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishDate;

    /** 期刊/会议名称 */
    @Excel(name = "期刊/会议名称")
    private String journal;

    /** DOI号 */
    @Excel(name = "DOI号")
    private String doi;

    /** 论文链接 */
    @Excel(name = "论文链接")
    private String url;

    /** 附件存储路径 */
    @Excel(name = "附件存储路径")
    private String filePath;

    /** 作者用户ID */
    @Excel(name = "作者用户ID")
    private Long userId;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 删除标志（0代表存在 1代表删除） */
    private String delFlag;

    public void setPaperId(Long paperId) 
    {
        this.paperId = paperId;
    }

    public Long getPaperId() 
    {
        return paperId;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setKeywords(String keywords) 
    {
        this.keywords = keywords;
    }

    public String getKeywords() 
    {
        return keywords;
    }

    public void setAbstractText(String abstractText) 
    {
        this.abstractText = abstractText;
    }

    public String getAbstractText() 
    {
        return abstractText;
    }

    public void setPublishDate(Date publishDate) 
    {
        this.publishDate = publishDate;
    }

    public Date getPublishDate() 
    {
        return publishDate;
    }

    public void setJournal(String journal) 
    {
        this.journal = journal;
    }

    public String getJournal() 
    {
        return journal;
    }

    public void setDoi(String doi) 
    {
        this.doi = doi;
    }

    public String getDoi() 
    {
        return doi;
    }

    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    public void setFilePath(String filePath) 
    {
        this.filePath = filePath;
    }

    public String getFilePath() 
    {
        return filePath;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("paperId", getPaperId())
            .append("title", getTitle())
            .append("keywords", getKeywords())
            .append("abstractText", getAbstractText())
            .append("publishDate", getPublishDate())
            .append("journal", getJournal())
            .append("doi", getDoi())
            .append("url", getUrl())
            .append("filePath", getFilePath())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
