package com.symantec.eloqua.assetMigrator.CustomDataObject;

import java.util.List;

public class CDO {

	private String total;

	private String page;

	private String pageSize;

	private List<Elements> elements;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<Elements> getElements() {
		return elements;
	}

	public void setElements(List<Elements> elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "ClassPojo [total = " + total + ", page = " + page + ", pageSize = " + pageSize + ", elements = "
				+ elements + "]";
	}

}
