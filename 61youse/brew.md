export PATH="/usr/local/opt/openjdk@11/bin:$PATH"
export PATH="/usr/local/opt/maven@3.2/bin:$PATH"

/usr/local/Cellar/openjdk/17.0.1_1/libexec/openjdk.jdk/Contents/Home

~/.zshrc

 which java
 截取bin目录前一节路径作为java_home

 vim ~/.bash_profile

 export JAVA_HOME=/usr/local/opt/openjdk@11
export PATH=$JAVA_HOME/bin:$PATH

source ~/.bash_profile

set JAVA_HOME=/usr/local/opt/openjdk@11

#### 
vi ~/.mavenrc  
export JAVA_HOME=/usr/local/opt/openjdk@11