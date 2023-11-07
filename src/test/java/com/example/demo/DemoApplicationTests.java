package com.example.demo;

import com.example.demo.domain.params.SourceParam;
import com.example.demo.domain.vo.TargetVo;
import com.example.demo.struct.SourceTargetMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class DemoApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

    private SourceTargetMapper sourceTargetMapper;

    @Autowired
    public DemoApplicationTests(SourceTargetMapper sourceTargetMapper) {
        this.sourceTargetMapper = sourceTargetMapper;
    }

    /**
     * 测试 MapStruct
     */
    @Test
    public void testMapStruct() {
        SourceParam param = new SourceParam();
        param.setStringProp("123");
        param.setLongProp(123L);
        TargetVo targetVo = sourceTargetMapper.sourceToTarget(param);
        log.info("{}", targetVo);
    }

    @Test
    public void testDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        log.info("当前时间：{}", now.format(formatter));
        log.info("当前时间戳：{} ---- {}", System.currentTimeMillis(), now.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        log.info("第二天时间：{}", now.plusDays(1).format(formatter));
        log.info("第二天时间戳：{}", now.plusDays(1).toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    }

    @Test
    void contextLoads() {
    }

}
