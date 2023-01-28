package coffee.order;

public class Order {

        private static long counter;

        private long orderId;
        private String name;


        public Order(String name) {
            this.orderId = counter++;
            this.name = name;
        }

        public long getOrderId() {
            return this.orderId;
        }

        public String getName() {
            return this.name;
        }
    }
