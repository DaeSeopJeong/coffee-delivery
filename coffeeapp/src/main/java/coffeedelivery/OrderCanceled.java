package coffeedelivery;

public class OrderCanceled extends AbstractEvent {

    private Long orderId;

    public OrderCanceled(){
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
