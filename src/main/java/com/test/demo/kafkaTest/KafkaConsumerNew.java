package com.test.demo.kafkaTest;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

public class KafkaConsumerNew {


    private Consumer<String, String> consumer;

    private static String group = "szj-test";

    private static String TOPIC = "event_topic";

    private KafkaConsumerNew() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "10.16.18.213:9093,10.16.18.213:9094,10.16.18.214:9093,10.16.18.214:9094");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, group);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        // 自动commit
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        // 自动commit的间隔
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        consumer = new KafkaConsumer<>(props);

    }

    private void consume() {
        // 可消费多个topic,组成一个list
        consumer.subscribe(Collections.singletonList(TOPIC));
//        TopicPartition partition = new TopicPartition(TOPIC, 0);
//
//        consumer.assign(Collections.singletonList(partition));
//        consumer.seek(partition, consumer.position(partition));

//        TopicPartition topicPartition = new TopicPartition(TOPIC, 0);
//        consumer.seek(topicPartition, 0);
        while (true) {

            ConsumerRecords<String, String> records = consumer.poll(2000);
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("======： offset = %d, key = %s, value = %s \n", record.offset(), record.key(), record.value());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(StringDeserializer.class.getName());
        System.out.println(JSONObject.toJSONString(Collections.singletonList(TOPIC)));
        System.out.println(JSONObject.toJSONString(Arrays.asList(TOPIC)));
        new KafkaConsumerNew().consume();
    }

}
