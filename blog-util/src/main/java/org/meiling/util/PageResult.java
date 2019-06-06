package org.meiling.util;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable{
	private int page;
	private int pageSize;
	private int total;
	private int totalPage;
	private List rows;
	public PageResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "PageResult [page=" + page + ", pageSize=" + pageSize
				+ ", total=" + total + ", totalPage=" + totalPage + ", rows="
				+ rows + "]";
	}

	
}
