package com.fei.entity;

public class Page {
	
	private int pageSize = 15;
	private int pageNum = 1;
	private int pageRow;
	private int pageCount;
		
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageRow() {
		return pageRow;
	}
	public void setPageRow(int pageRow) {
		this.pageRow = pageRow;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageRow = pageCount%pageSize==0?(pageCount/pageSize):(pageCount/pageSize)+1;
		this.pageCount = pageCount;
	}
	
}
