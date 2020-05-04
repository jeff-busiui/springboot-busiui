#busi-java
## 环境准备
* docker安装postgresql数据库，成功
* 测试数据库连接，成功
##初始化表结构
```sql
drop table user_info;
CREATE TABLE user_info(
   ID bigserial   PRIMARY KEY     NOT NULL,
   user_NAME           TEXT    NOT NULL,
   user_email            TEXT     NOT NULL
);


INSERT INTO public.user_info
(user_name, user_email)
VALUES('zhang1', 'zhang1@126.com');

INSERT INTO public.user_info
(user_name, user_email)
VALUES('zhang2', 'zhang2@126.com');


INSERT INTO public.user_info
(user_name, user_email)
VALUES('zhang3', 'zhang3@126.com');


INSERT INTO public.user_info
(user_name, user_email)
VALUES('zhang4', 'zhang4@126.com');


INSERT INTO public.user_info
(user_name, user_email)
VALUES('zhang5', 'zhang5@126.com');

```
## 创建busi-ui-service工程
已完成如下步骤：
* 主工程搭建,端口9001
  hutool工具包
  lombok工具
* 集成mybatis-plus
* 集成druid连接池
   druid地址：http://localhost:9001/druid
* 集成postgresql
* 集成redis
* 集成swagger2
  api地址：http://localhost:9001/swagger-ui.html
* 查询接口调试
* 插入接口调试