package com.sdey.api.vo;

public class SDEY_News {
	private String newsTitle;
	private String jieshao;
	private String newsHref;

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getJieshao() {
		return jieshao;
	}

	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}

	public String getNewsHref() {
		return newsHref;
	}

	public void setNewsHref(String newsHref) {
		this.newsHref = newsHref;
	}

	@Override
	public String toString() {
		return "SDEY_News [newsTitle=" + newsTitle + ", jieshao=" + jieshao + ", newsHref=" + newsHref + "]";
	}

}
