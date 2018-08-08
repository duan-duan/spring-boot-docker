# spring-boot-docker
运用docker 发布项目

```shell
# 打包
mvn clean package -Ddockerfile.skip
# 打镜像
mvn dockerfile:build

# 启动命令
docker run --name discovery -p 8800:8080 -d -it harry21/spring-boot-docker

```


# docker-compose

```
# 启动 -d  后台运行
docker-compose up -d 

# 停止
docker-compose stop

```
