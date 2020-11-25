package com.poc.bem.demo.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
class MongoConfigTest {
    private MongoConfig config;

    @BeforeEach
    void setup() {
        config = new MongoConfig();
        ReflectionTestUtils.setField(config, "connectionString", "localhost");
        ReflectionTestUtils.setField(config, "databaseName", "test");
    }

    @Test
    void test() {
        assertNotNull(config);
    }
}
