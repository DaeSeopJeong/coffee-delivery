
package coffeedelivery;

public class PaymentApproved extends AbstractEvent {

    private Long id;
    private String OrderID;
    private Double Amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getOrderId() {
        return OrderID;
    }

    public void setOrderId(String OrderID) {
        this.OrderID = OrderID;
    }
    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }
}
