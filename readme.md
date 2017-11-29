1——>先在项目中（比如webapp-spring）执行mvn命令

    archetype:create-from-project

2——>切换目录到target\generated-sources\archetype

    记录pom中的 groupId groupId version
      <groupId>com.liqw.maven.archetypes</groupId>
      <artifactId>webapp-archetype</artifactId>
      <version>1.0-SNAPSHOT</version>
    执行mvn命令
    install
    
    记录日志中的地址，比如：
    [INFO] Installing D:\lqw\工作\测试\mycode\mine-arche-type\webapp-spring\target\generated-sources\archetype\target\webapp-archetype-1.0-SNAPSHOT.jar to D:\Maven\repo\m2\com\liqw\maven\archetypes\webapp-archetype\1.0-SNAPSHOT\webapp-archetype-1.0-SNAPSHOT.jar
    [INFO] Installing D:\lqw\工作\测试\mycode\mine-arche-type\webapp-spring\target\generated-sources\archetype\pom.xml to D:\Maven\repo\m2\com\liqw\maven\archetypes\webapp-archetype\1.0-SNAPSHOT\webapp-archetype-1.0-SNAPSHOT.pom
    那么本地安装的地址是 D:\Maven\repo\m2\com\liqw\maven\archetypes\webapp-archetype
    如果是远程的话这里会显示远程的地址
    
3——> 如何使用（IDEA版本）

    第一次需要添加到IDEA 的maven archetypes中
    new module/project -> Maven-> Create from archetype-> Add ArcheType
    在弹出的框中输入步骤2获取的 groupId artifactId version 
    和地址（可以是本地库中的地址 也可以是远程地址，如果上传到远程仓库的话）
    点击ok，就添加好了
    以后选择刚刚添加的ArcheType 就可以了
    
    删除需要在文件中删并重启
    C:\Users\liqw\.IntelliJIdea2017.1\system\Maven\Indices\UserArchetypes.xml
