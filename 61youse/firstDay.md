1, alfre

https://www.alfredapp.com/




2，homebrew安装

https://zhuanlan.zhihu.com/p/111014448

https://www.zhihu.com/question/35928898/answer/1102381049

PS: 使用苹果芯片的电脑不能按下面的步骤安装 （苹果芯片和intel芯片对应的prefix路径不同）, tui

sudo mkdir /usr/local/Homebrew

sudo git clone https://mirrors.tuna.tsinghua.edu.cn/git/homebrew/brew.git /usr/local/Homebrew


sudo rm -r -f /usr/local/bin/brew

sudo ln -s /usr/local/Homebrew/bin/brew /usr/local/bin/brew


sudo mkdir -p /usr/local/Homebrew/Library/Taps/homebrew/homebrew-core

sudo git clone https://mirrors.tuna.tsinghua.edu.cn/git/homebrew/homebrew-core.git /usr/local/Homebrew/Library/Taps/homebrew/homebrew-core


sudo mkdir -p /usr/local/Homebrew/Library/Taps/homebrew/homebrew-cask
sudo git clone https://mirrors.tuna.tsinghua.edu.cn/git/homebrew/homebrew-cask.git /usr/local/Homebrew/Library/Taps/homebrew/homebrew-cask

# 如果tsinghua.edu.cn比较慢，可以考虑git://mirrors.ustc.edu.cn/homebrew-core.git和git://mirrors.ustc.edu.cn/homebrew-cask.git


##授权
sudo chown -R $(whoami) /usr/local/Cellar






3，搜狗输入法

https://pinyin.sogou.com/mac/




4，sublime

https://www.sublimetext.com/




5，item2

https://iterm2.com/

6，安装wget

brew install wget

7，oh-my-zsh国内镜像安装

1) 方法一：https://www.jianshu.com/p/6b47198fd430

2)方法二：手动安装：

1.先从git下载源代码：git clone git://github.com/robbyrussell/oh-my-zsh.git ~/.oh-my-zsh
2.复制配置文件： cp ~/.oh-my-zsh/templates/zshrc.zsh-template ~/.zshrc
3.最后再生效配置文件： source ~/.zshrc




8，jdk 17
brew install java17




9，maven 3


brew install maven

如果装maven的时候；报 runtimeerror: /usr/local/opt/openjdk not present or broken；Please reinstall openjdk. Sorry :(

输入命令witch java /usr/local/opt/openjdk@11/bin/java

需要把openjdk@11 改成 openjdk；注意对应的环境变量也要改；

10，docker




brew install --cask --appdir=/Applications docker




11，Intellij IDEA 激活码

步骤：

1)插件仓库中添加 https://plugins.zhile.io(如下图所示)

2)marketplace里面搜索IDE Eval Reset插件

3)在菜单栏中找到Help→Eval Reset

4)如下图所示

http:/2/vrg123.com/

插件：

eclipse code formatter




11,vim 配色




vim ~/.vimrc


set nu 
colorscheme desert 
syntax on







12, nodejs

使用   Node Version Manager 来安装，以后升级node版本会更容易




13, vscode

https://code.visualstudio.com/




14, popclip

https://pilotmoon.com/popclip/ 快速 url encode, decode, json string converter




15, Dash

https://kapeli.com/dash  API Documentation Browser and Code Snippet Manager




16, postman

https://www.postman.com/ test API call

17,  Xcode

https://developer.apple.com/download/more/ 




18,  Gliffy Diagrams

https://chrome.google.com/webstore/detail/gliffy-diagrams/bhmicilclplefnflapjmnngmkkkkpfad?utm_source=chrome-ntp-launcher




19,  plantuml

 https://plantuml.com/sequence-diagram

There are plantuml plugins  for VSCode and IDEA




20, draw.io

https://app.diagrams.net/