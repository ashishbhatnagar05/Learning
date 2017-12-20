package model;

public class CustomerDetail {

	public CustomerDetail(String customerId, String groupId) {
		super();
		this.customerId = customerId;
		this.groupId = groupId;
	}

	public CustomerDetail() {
		// TODO Auto-generated constructor stub
	}

	private String customerId;
	private String groupId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
