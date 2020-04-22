
package coffeedelivery;

public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String CookingType;
    private String Address;
    private String orderid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCookingType() {
        return CookingType;
    }

    public void setCookingType(String CookingType) {
        this.CookingType = CookingType;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
}
