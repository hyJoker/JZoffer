# 基于 java8 镜像构建
FROM java:8
# 由于 Spring Boot 运行时需要 tmp 目录，这里数据卷配置一个 /tmp 目录出来
VOLUME /tmp
# 将本地 target 目录中打包好的 .jar 文件复制一份新的 到 /app.jar。
ADD target/docker-0.0.1-SNAPSHOT.jar app.jar
# 配置启动命令
ENTRYPOINT ["java","-jar","/app.jar"]