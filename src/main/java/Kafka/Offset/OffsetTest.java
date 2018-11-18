package Kafka.Offset;

import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.message.MessageAndMetadata;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author dz on 2018/11/17.
 */
public class OffsetTest {

    /*private static synchronized void startOffsetListener(ConsumerConnector consumerConnector) {
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(consumerOffsetTopic, new Integer(1));
        KafkaStream<byte[], byte[]> offsetMsgStream = consumerConnector.createMessageStreams(topicCountMap).get(consumerOffsetTopic).get(0);

        ConsumerIterator<byte[], byte[]> it = offsetMsgStream.iterator();
        while (true) {
            MessageAndMetadata<byte[], byte[]> offsetMsg = it.next();
            if (ByteBuffer.wrap(offsetMsg.key()).getShort() < 2) {
                try {
                    GroupTopicPartition commitKey = readMessageKey(ByteBuffer.wrap(offsetMsg.key()));
                    if (offsetMsg.message() == null) {
                        continue;
                    }
                    OffsetAndMetadata commitValue = readMessageValue(ByteBuffer.wrap(offsetMsg.message()));
                    offsetMap.put(commitKey, commitValue);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
}
