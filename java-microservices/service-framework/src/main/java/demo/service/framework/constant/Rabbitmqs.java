package demo.service.framework.constant;

/**
 * RabbitMQ.
 */
public final class Rabbitmqs {

    /** Private constructor. */
    private Rabbitmqs() {}

    /** Exchange. */
    public static final String EXCHANGE = "service";

    /**
     * Queue.
     */
    public static class Queue {

        /** Private constructor. */
        private Queue() {}

        /** service-registration. */
        public static final String RE = "service.registration";
    }

    /**
     * Routing.
     */
    public static class Routing {

        /** Private constructor. */
        private Routing() {}

        /** service-registration. */
        public static final String RE = "routing.registration";
    }
}
