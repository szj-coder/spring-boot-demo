package com.test.demo.kafkaTest;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaProducerNew {


    private final KafkaProducer<String, String> producer;

    public final static String TOPIC = "event_topic";

    private KafkaProducerNew() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "10.16.18.213:9093,10.16.18.213:9094,10.16.18.214:9093,10.16.18.214:9094");
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        // 重试
        props.put(ProducerConfig.RETRIES_CONFIG, Integer.MAX_VALUE);
        // 最大未确认请求数
        props.put(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, 1);

        // 延迟
        props.put(ProducerConfig.LINGER_MS_CONFIG, 5);
        // 批量发送大小（以字节为单位）
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 0);

        // 缓存区大小(字节)
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 1000);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        producer = new KafkaProducer<>(props);
    }

    public void produce() {
        int messageNo = 1;
        final int COUNT = 10;

        while (messageNo < COUNT) {
            String key = String.valueOf(messageNo);
            String data = String.format("hello KafkaProducer message %s", key);

            try {
                // get() 可以同步发送，不调用get 为异步发送
                producer.send(new ProducerRecord<>(TOPIC, key, data)).get();
                System.out.println("send: " + data);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            messageNo++;
        }

        producer.close();
    }

    public static void main(String[] args) {
        new KafkaProducerNew().produce();
    }

}
