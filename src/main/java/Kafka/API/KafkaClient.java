package Kafka.API;

public class KafkaClient {

    public static void main(String[] args) {
        JProducer pro = new JProducer(KafkaProperties.TOPIC);
        pro.start();

        JConsumer con = new JConsumer(KafkaProperties.TOPIC);
        con.start();
    }

}