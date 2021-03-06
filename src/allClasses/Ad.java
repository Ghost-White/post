package allClasses;

public class Ad {
	private int adId;
	private int adTypeId;
	private String upLoadTime;
	private int userId;
	private int postId;
	private String firstPicAddr;
	private int money;
	private long sortValue;
	private int checked;
	private String remark;
	private int height;
	private int width;

	public Ad() {
		super();
	}	
	public Ad(int adId, int adTypeId, String upLoadTime, int userId,
			int postId, String firstPicAddr, int money, long sortValue,
			int checked, String remark, int height, int width) {
		super();
		this.adId = adId;
		this.adTypeId = adTypeId;
		this.upLoadTime = upLoadTime;
		this.userId = userId;
		this.postId = postId;
		this.firstPicAddr = firstPicAddr;
		this.money = money;
		this.sortValue = sortValue;
		this.checked = checked;
		this.remark = remark;
		this.height = height;
		this.width = width;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getAdId() {
		return adId;
	}
	public void setAdId(int adId) {
		this.adId = adId;
	}
	public int getAdTypeId() {
		return adTypeId;
	}
	public void setAdTypeId(int adTypeId) {
		this.adTypeId = adTypeId;
	}
	public String getUpLoadTime() {
		return upLoadTime;
	}
	public void setUpLoadTime(String upLoadTime) {
		this.upLoadTime = upLoadTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getFirstPicAddr() {
		return firstPicAddr;
	}
	public void setFirstPicAddr(String firstPicAddr) {
		this.firstPicAddr = firstPicAddr;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public long getSortValue() {
		return sortValue;
	}
	public void setSortValue(long sortValue) {
		this.sortValue = sortValue;
	}
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	
	
}
