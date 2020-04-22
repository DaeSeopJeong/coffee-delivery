package coffeedelivery;

public class Ordered extends AbstractEvent {

    private String item;
    private Integer qty;
    private Long orderId;

    public Ordered(){
        super();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
