<configuration scan="true">
  <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
    <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
      <pattern>%date [%thread] %-5level %logger{35} - %msg%n</pattern>
    </encoder>
    <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
      <level>OFF</level> <!-- change to DEBUG to mimic '-consolelog' behaviour -->
    </filter>
  </appender>

  <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
    <File>${org.eclipse.m2e.log.dir}/0.log</File>
    <rollingPolicy class="ch.qos.logback.core.rolling.FixedWindowRollingPolicy">
      <FileNamePattern>${org.eclipse.m2e.log.dir}/%i.log</FileNamePattern>
      <MinIndex>1</MinIndex>
      <MaxIndex>10</MaxIndex>
    </rollingPolicy>
    <triggeringPolicy class="ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy">
      <MaxFileSize>100M