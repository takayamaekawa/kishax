# kishax

[![Visit Website](https://img.shields.io/badge/Visit_Website-007BFF?style=for-the-badge)](https://kishax.net/)  

## Feature
This is able to use in both Velocity and Spigot.  
But this is created for myself for my server.  
So this plugin is maybe good for plugin developers.  
Freely to Edit!

## Spigot Command list

### `/kishax create <url> <title> <comment>`
You can create image map from url like this:
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/spigot/imagemap/choose_map.png)  
If you choose 0 or 1, you can 1×1 imageMap or QR-Code  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/spigot/imagemap/example_small_maps.png)  
If you choose 2, you can large size imageMap  
You can specified that ratio and background-color like this.  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/spigot/imagemap/choose_size.png)  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/spigot/imagemap/choose_color.png)  
The image is generated accordingly, preserving the aspect ratio of the image  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/spigot/imagemap/result.png)  
Here is complete large map:  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/spigot/imagemap/example_large_map.png)  
When images are at your disposal, you can do things like this!  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/spigot/imagemap/arrow_move.gif)  

### `/kishax menu <server|get|image>`
You can get this when you visit kishax server. For example, you can get imageMap created like above.  
Not only that but, there are server menu that can start or stop server or read online status, players, and teleport requesting menu that you teleport player or invite player by choosing online-player-head.  

### `/kishax fv <player> <proxy_cmd>`
Forwarding Velocity's command in Spigot

### `/kishax reload`
Reloading config

## Linkage to Discord
For Velocity Server, Velocity Server notifys Embed's message or plain-text-message under each events.  
When server switching, joining, disconnecting like this.  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/event_message.png)  
When chatting like this.  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/chat_message2.png)

## Convert Romaji to Kanji
This brings an automatic chat conversion Romaji to Kanji like this.  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/chat_conv.png)

## Velocity Command list

### `/hub`

### `/kishaxp hub`
Moving to hub server  

### `/kishaxp cend`
After executing, Velocity will be shutdown!  
Before being shutdown, discord's embed editing like this.
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/proxy_shutdown.png)

### `/kishaxp maintenance <status | switch> discord <true | false>`
This enable server to be maintenance mode, which is that for example, it is openable for only Admin who has permission:group.super-admin, others disconnecting.  
If arg5 sets "true", server can notify to Discord whether maintenance mode is true or not.  

### `/kishaxp perm <add | remove | list> [Short:permission] [target:player]`
Adding or removing permission written in config.yml by adding or removing permission in mysql database for luckperm MySQL mode.

### `/kishaxp ss <server>`
Getting server status and checking whether you have Kishax account from MySQL.  

### `/kishaxp stp <server>`
Moving to specific server as server command

### `/kishaxp req <server>`
Requesting to let server start-up to Admin through discord like this.  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/req_button.png)  
If someone presses `YES` button, here will be like this.  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/reqsul_notification.png)  
Here is minecraft's player chat area.  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/req_minecraft_chat.png)  

### `/kishaxp start <server>`
Let server start by bat file of windows

### `/kishaxp cancel`
Only sending "canceled event"

### `/kishaxp conv <add | remove | reload | switch> [<add | remove>:key] [<add>:value] [<add>:<true | false>]`
Switching converting type of Romaji to Kanji, reloading romaji.csv from `plugins/kishax/romaji.csv`, or adding/removing a theirself word into the csv file that has a lot of maps of conversion romaji to kana.

### `/kishaxp chat <switch | status>`
Switching the way of sending chating message to Discord.  
There are Embed editing type or Plane text message type.  

* Embed editing type (Using Bot)  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/embed_editing_type.png)  

* Plane text message type (Using Webhook)  
![alt text](https://raw.githubusercontent.com/takayamaekawa/branding/refs/heads/master/repo/kishax/velocity/plain_text_message_type.png)  

### `/kishaxp debug`
Switching debug mode. In details, this is only replacing config value each other. For example, Discord.ChannelId and Debug.ChannelId.

### `/kishaxp reload`
Reloading configuration.

## Socket Server
Sockets are enable us to communicate between Velocity and Spigot Servers.

### Reason
* Communication Available even when players are offline  
* Not Java, for example, PHP can be access to it.  

#### Here is PHP example code
```php
<?php
  // server address & port
  $serverAddress = '127.0.0.1';
  $serverPort = 8766;

  // create socket and connect
  $socket = socket_create(AF_INET, SOCK_STREAM, SOL_TCP);
  socket_connect($socket, $serverAddress, $serverPort);

  // send message
  socket_write($socket, $message, strlen($message));

  // close
  socket_close($socket);
```

## Dependancy
* [Luckperms](https://github.com/LuckPerms/LuckPerms)

## Lisence
[MIT](LICENSE)
