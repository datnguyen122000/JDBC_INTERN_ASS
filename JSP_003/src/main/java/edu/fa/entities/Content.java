package edu.fa.entities;

import java.util.Date;

public class Content {
	private int id;
	private String title;
	private String brief;
	private String content;
	private Date createdDate;
	private int accountId;
	private String timeView;
	public Content() {
	}
	
	public Content(int id, String title, String brief, String content, Date createdDate, int accountId,
			String timeView) {
		this.id = id;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.createdDate = createdDate;
		this.accountId = accountId;
		this.timeView = timeView;
	}

	public Content(String title, String brief, String content, Date createdDate, int accountId) {
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.createdDate = createdDate;
		this.accountId = accountId;
	}

	public Content(int id, String title, String brief, String content, Date createdDate, int accountId) {
		this.id = id;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.createdDate = createdDate;
		this.accountId = accountId;
	}

	public String getTimeView() {
		return timeView;
	}

	public void setTimeView(String timeView) {
		this.timeView = timeView;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Content [id=" + id + ", title=" + title + ", brief=" + brief + ", content=" + content + ", createdDate="
				+ createdDate + ", accountId=" + accountId + "]";
	}

	
	
}
