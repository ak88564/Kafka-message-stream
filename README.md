# Simple kafka stream
## A complete working of a kafka messaging system implemented through spring boot

- ### In this spring boot application, complete stream of messages are shown
- ### Messages are produced through main function
- ### Messages are produced through business logic
- ### Used kafka listener to read all the messages which are being produced
- ### To produce the msg go to messageController file then copy the url and paste to any browser or postman. Pass the exact msg in value

### All the commands which will be needed while running this app
zookeeper-server-start.bat ..\..\config\zookeeper.properties

kafka-server-start.bat ..\..\config\server.properties

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my-topic --from-beginning

.\bin\windows\kafka-topics.bat --create --topic topic-example --bootstrap-server localhost:9092

To produce msgs:
".\bin\windows\kafka-console-producer.bat --topic topic-example --bootstrap-server localhost:9092"
 after writing the msg press ctrl+C to save the msg

### Note: 
- #### Before running this application, first start the zookeeper
- #### Then start the kafka server
- #### The command given above is for the windows
- #### For macOS, the exact command is in this page, https://kafka.apache.org/quickstart
