#### mysqldump
[referer](https://blog.csdn.net/helloxiaozhe/article/details/77680255)

mysqldump -h 链接 ip -P(大写)端口 -u 用户名 -p 密码数据库名>d:XX.sql(路径)

1、导出数据和表结构——将特定数据库特定表中的数据和表格结构和数据全部返回

mysqldump --u b_user -h 101.3.20.33 -p'H_password' -P3306 database_di up_subjects > 0101_0630_up_subjects.sql

2、导出表结构却不导出表数据——只返回特定数据库特定表格的表格结构，不返回数据,添加“-d”命令参数

mysqldump --u b_user -h 101.3.20.33 -p'H_password' -P3306 -d database_di up_subjects > 0101_0630_up_subjects.sql

3、导出表结构和满足挑顶条件的表数据——只返回特定数据库中特定表的表格结构和满足特定条件的数据

mysqldump --u b_user -h 101.3.20.33 -p'H_password' -P3306 database_di up_subjects --where=" ctime>'2017-01-01' and ctime<'2017-06-30'" > 0101_0630_up_subjects.sql

4、导出数据却不导出表结构——只返回特定数据库中特定表格的数据，不返回表格结构，添加“-t”命令参数

mysqldump --u b_user -h 101.3.20.33 -p'H_password' -t -P3306 database_di up_subjects >0101_0630_up_subjects.sql

5、导出特定数据库的所有表格的表结构及其数据，添加“--databases ”命令参数

mysqldump --u b_user -h 101.3.20.33 -p'H_password' -P3306 --databases test > all_database.sql

#### 导入
mysql -h 链接 ip -P(大写)端口 -u 用户名 -p 密码 数据库名 < d:XX.sql(路劲)
将导出的本地文件导入到指定数据库

1、系统命令行

格式：mysql -h链接ip -P(大写)端口 -u用户名 -p密码 数据库名 < d:XX.sql(路劲) 

mysql -uusername -ppassword db1 <tb1tb2.sql

2、或mysql命令行

mysql>

user db1;

source tb1_tb2.sql;

3、恢复整个数据库的方法：

mysql -u  b_user -h 101.3.20.33 -p'H_password' -P3306   < all_database.sql
