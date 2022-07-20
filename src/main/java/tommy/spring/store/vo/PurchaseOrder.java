package tommy.spring.store.vo;

public class PurchaseOrder {
	private Integer id;
	private Integer itemId;
	private String address;
	private Integer paymentInfold;
	public PurchaseOrder() {
	}
	public PurchaseOrder(Integer itemId, String address, Integer paymentInfold) {
		this.itemId = itemId;
		this.address = address;
		this.paymentInfold = paymentInfold;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPaymentInfold() {
		return paymentInfold;
	}
	public void setPaymentInfold(Integer paymentInfold) {
		this.paymentInfold = paymentInfold;
	}
	
}
