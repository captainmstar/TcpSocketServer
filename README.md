# TcpSocketServer
This test app is for testing tcp socket connection to android emulator running on localhost from localhost

Below tutorial was followed
https://www.codeproject.com/Tips/1222789/How-to-connect-a-client-on-your-host-to-a-server-r

From command line, setup port forwarding to emulator with adb

adb forward tcp:7777 tcp:4545
or
adb forward tcp:4545 tcp:4545

Program Files\nc111nt_safe

From cmd prompt inside Program Files\nc111nt_safe
./nc localhost 4545
