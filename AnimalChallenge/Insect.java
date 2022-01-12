package com.qa.day4;

public class Insect extends Animal{
	
	private boolean crawls = true;
	
	public boolean getCrawls() {
		return crawls;
	}
	
	public void setCrawls(boolean doesItCrawl) {
		this.crawls = doesItCrawl;
	}

}
