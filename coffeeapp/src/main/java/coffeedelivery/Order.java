package coffeedelivery;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Order_table")
public class Order {

    private String item;
    private Integer qty;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;

    @PrePersist
    public void onPrePersist(){
        Ordered ordered = new Ordered();
        BeanUtils.copyProperties(this, ordered);
        ordered.publish();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        coffeedelivery.external.PaymentHistory paymentHistory = new coffeedelivery.external.PaymentHistory();
        // mappings goes here
        Application.applicationContext.getBean(coffeedelivery.external.PaymentHistoryService.class);
        /*    .결제(paymentHistory);*/


        OrderCanceled orderCanceled = new OrderCanceled();
        BeanUtils.copyProperties(this, orderCanceled);
        orderCanceled.publish();


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
