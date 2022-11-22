package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCollections {
    @Test
    void testArray()
    {
        String stringArr[] = new String[2];

        ArrayProducer producer = new ArrayProducer(stringArr);
        ArrayConsumer consumer = new ArrayConsumer(stringArr);

        producer.produce(0, "1st");
        producer.produce(0, "3rd");
        producer.produce(1, "2nd");

        assertEquals("3rd", consumer.consume());

        producer.produce(1, "4th");

        assertEquals("4th", consumer.consume());
    }

    @Test
    void testArrayList()
    {
        ArrayList<String> list = new ArrayList<>();

        ArrayListProducer producer = new ArrayListProducer(list);
        ArrayListConsumer consumer = new ArrayListConsumer(list);

        producer.produce(0, "1st");
        producer.produce(1, "3rd");
        producer.produce(1, "2nd");

        assertEquals("1st", consumer.consume());

        producer.produce(1, "4th");

        assertEquals("2nd", consumer.consume());
        assertEquals("4th", consumer.consume());
        assertEquals("3rd", consumer.consume());
    }

    @Test
    void testHashMap()
    {
        HashMap<String, String> map = new HashMap<>();

        HashMapProducer producer = new HashMapProducer(map);
        HashMapConsumer consumer = new HashMapConsumer(map);

        producer.produce("Java", ".java");
        producer.produce("C", ".c");
        producer.produce("C++", ".cpp");

        assertEquals(".java", consumer.consume("Java"));

        producer.produce("Python", ".pyc");
        producer.produce("Python", ".py");

        assertEquals(".py", consumer.consume("Python"));
    }

    @Test
    void testHashSet()
    {
        HashSet<String> set = new HashSet<>();

        HashSetProducer producer = new HashSetProducer(set);
        HashSetConsumer consumer = new HashSetConsumer(set);

        producer.produce(".java");
        producer.produce(".c");
        producer.produce(".cpp");

        assertEquals(3, set.size());
        assertTrue(consumer.consume(".java"));
        assertEquals(2, set.size());

        producer.produce(".py");
        assertFalse(producer.produce(".py"));
        assertEquals(3, set.size());
    }
}