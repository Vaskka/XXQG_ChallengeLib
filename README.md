# XXQG_ChallengeLib

> xxqg 挑战答题专用搜索引擎

# 使用

~~请点击[这里](http://129.204.216.249:4000/main)进入xxqg-挑战答题搜索引擎的web页面。

项目开发较早，上面服务器续不起了。如有使用需求请自己安装环境部署运行。

## 环境依赖

> 项目基于springboot和mongodb，前端是react-dom + thymeleaf。happy hacking ;)

1. jdk 8

oracle jdk: [oracle jdk download page](https://www.oracle.com/cn/java/technologies/javase/javase-jdk8-downloads.html)

根据系统配置`JAVA_HOME`环境变量。

2. maven

apache maven: [maven download page](https://maven.apache.org/download.cgi)

3. mongodb

mongodb: [mongodb download page](https://www.mongodb.com/try/download/community)

安装好后，启动mongod进程，修改代码中的 `//QGSearchBackend/src/main/resources/application.properties` 中关于mongodb的配置为本地的配置。
mongodb 环境配置复杂的话推荐直接云服务商上面买。（如果必要的话）

mongodb就绪后我们需要导入数据，在`//data/xxqg`中项目已经准备了整理好的可以直接导入的bson数据（来自百度搜索）。数据较老（2019年找的），可以根据bson中的结构自己找新数据。

4. git（可选）

git: [git download page](https://git-scm.com/downloads)

## 部署 & 运行

> 确保JAVA_HOME环境变量配置正确，jdk & maven环境配置完成，mongodb已启动并在`application.properties`已经修改相应配置。

1. clone 代码到本地，没有git可以直接download zip

`git clone git@github.com:Vaskka/XXQG_ChallengeLib.git`

2. 打包部署

2.1 打包jar
  
打开 **终端** / **powershell** / **cmd**： 

`cd QGSearchBackend`
`mvn clean package -DskipTests`

等待maven下载依赖并打包，如果连接apache central过慢请配置相应的maven镜像解决，这里不赘述方法。
出现build success的字样后，在 **终端** / **powershell** / **cmd**： 

`cd target`
`java -jar *.jar`
运行刚刚打包好的jar文件。
web服务会启动在在localhost的`4000`端口，可以在`application.properties`中进行配置。

## 使用

浏览器打开web服务，在输入框中输入每道题的题干关键字，系统会自动显示题库中含有关键字的题目和答案。

为了保证数据的快速响应，返回的结果仅包含前10条匹配的数据，因此请选择题干中**比较有代表性**的关键字。关键字的字数可以不是很多，经过测试一般2-3个字的词语即可匹配到想要的题目。

# 限制

由于官方题库的快速更新，本题库不能保证您查询的每道题在题库中都有记录。2019年8月初，经过作者的测试，题目覆盖率在70%左右。

网络并非法外之地，窃取官方题库和逆向xxqgAPP是**违法行为**！因此本项目的题库数据来源全部来自[百度搜索](https://www.baidu.com/s?wd=%E6%8C%91%E6%88%98%E7%AD%94%E9%A2%98%E9%A2%98%E5%BA%93)中收集整理的数据。

本项目的初衷在于帮助大家学习挑战答题中的知识，并非破坏挑战答题的文化环境。如果出现负面影响请务必联系作者，邮箱：1139851358@qq.com，或者以issue的方式，作者会第一时间删除并配合有关部门工作。请以学习为目的！
