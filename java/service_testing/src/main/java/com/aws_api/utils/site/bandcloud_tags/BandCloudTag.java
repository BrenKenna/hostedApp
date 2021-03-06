package com.aws_api.utils.site.bandcloud_tags;


/**
 * 
 * @author kenna
 *
 */
public abstract class BandCloudTag {

	private String key;
	
	public BandCloudTag() {}
	
	
	public BandCloudTag(String key) {
		this.key = key;
	}


	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	
	public abstract BandCloudTags whichTag();


	@Override
	public String toString() {
		return "BandCloudTag [key=" + key + "]";
	}
}
