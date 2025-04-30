package MultilevelInheritance;

class Order {
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                "}";
    }
}

// Subclass representing a shipped order
class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public String toString() {
        return "ShippedOrder{" +
                "trackingNumber='" + trackingNumber + '\'' +
                "} " + super.toString();
    }
}

// Subclass representing a delivered order
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public String toString() {
        return "DeliveredOrder{" +
                "deliveryDate='" + deliveryDate + '\'' +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        // Create instances of each class
        Order order = new Order(101, "2024-07-28");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2024-07-28", "1Z12345E0505678903");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2024-07-28", "1Z98765E0505678907", "2024-08-02");

        // Display order information and status
        System.out.println(order);
        System.out.println("Order Status: " + order.getOrderStatus());

        System.out.println(shippedOrder);
        System.out.println("Order Status: " + shippedOrder.getOrderStatus());

        System.out.println(deliveredOrder);
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }
}

