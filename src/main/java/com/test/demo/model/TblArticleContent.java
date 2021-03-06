package com.test.demo.model;

import java.util.Date;

public class TblArticleContent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_content.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_content.article_id
     *
     * @mbggenerated
     */
    private Long articleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_content.create_by
     *
     * @mbggenerated
     */
    private Date createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_content.modifield_by
     *
     * @mbggenerated
     */
    private Date modifieldBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_article_content.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_content.id
     *
     * @return the value of tbl_article_content.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_content.id
     *
     * @param id the value for tbl_article_content.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_content.article_id
     *
     * @return the value of tbl_article_content.article_id
     *
     * @mbggenerated
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_content.article_id
     *
     * @param articleId the value for tbl_article_content.article_id
     *
     * @mbggenerated
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_content.create_by
     *
     * @return the value of tbl_article_content.create_by
     *
     * @mbggenerated
     */
    public Date getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_content.create_by
     *
     * @param createBy the value for tbl_article_content.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_content.modifield_by
     *
     * @return the value of tbl_article_content.modifield_by
     *
     * @mbggenerated
     */
    public Date getModifieldBy() {
        return modifieldBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_content.modifield_by
     *
     * @param modifieldBy the value for tbl_article_content.modifield_by
     *
     * @mbggenerated
     */
    public void setModifieldBy(Date modifieldBy) {
        this.modifieldBy = modifieldBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_article_content.content
     *
     * @return the value of tbl_article_content.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_article_content.content
     *
     * @param content the value for tbl_article_content.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}