package com.bjp.bam_xupumanagement.vo;

import java.util.Date;

public class ArticleInfo {

	private Integer id;
	/** 标题*/
    private String title;
    
    /** 摘要*/
    private String articalAbstract;
    
    /** 关键词*/
    private String keyword;
    
    /** 缩略图*/
    private String imageUrl;
    
    private String content;

    private Date articleTime;
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getArticleTime() {
		return articleTime;
	}

	public void setArticleTime(Date articleTime) {
		this.articleTime = articleTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArticalAbstract() {
		return articalAbstract;
	}

	public void setArticalAbstract(String articalAbstract) {
		this.articalAbstract = articalAbstract;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
