dockerId: liubin915249126

#### etcd 
sudo docker run -p 4001:4001 -v /etc/ssl/certs/:/etc/ssl/certs/ quay.io/coreos/etcd:v2.0.0_rc.1
docker-compose -f /Users/sh22053ml/Desktop/github/java-study/61youse/docker-compose-etcd.yml up -d

#### radis
docker-compose -f /Users/sh22053ml/Desktop/github/java-study/61youse/docker-compose-radis.yml up -d