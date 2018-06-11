package com.symantec.eloqua.assetMigrator.CustomDataObject;

import java.util.List;

public class DestCDOField {

	private String hasMore;

	private String limit;

	private String count;

	private String totalResults;

	private List<Items> items;

	private String offset;

	public String getHasMore() {
		return hasMore;
	}

	public void setHasMore(String hasMore) {
		this.hasMore = hasMore;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "ClassPojo [hasMore = " + hasMore + ", limit = " + limit + ", count = " + count + ", totalResults = "
				+ totalResults + ", items = " + items + ", offset = " + offset + "]";
	}
}
