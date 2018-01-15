Devices(Devices Type)-Name
Laptop-PT(End-Devices-Generic) -User
Router-PT(Router-Generic)-Router
Switch-PT(Switch-Generic)-Switch0
Server-PT(Server-Generic)-HTTP
Server-PT(Server-Generic)-DNS

Connections-> "Automatically choose Connection Type"


Configure Router:


Configure HTTP:
HTTP(Click on it)>Desktop>IP configuaration 

                 >Services>HTTP> [HTTP and HTTPS turn ON]
                          >DNS > [ DNS service Turn OFF as we wont use it as DNS.]
                          >DHCP> Service OFF
DNS(Click on it)>Desktop>IP configuaration 

                 >Services>HTTP> [HTTP and HTTPS turn OFF]
                          >DNS > [ DNS service Turn ON][Give a 'Name'=> 'web er nam ekta dibi','Type'=>'A record','Address'=> 'web server tar Ip',then Add]
                          >DHCP> Service OFF
Router>CLI
[NOTE:In generic Router, there will be only two fastethernet port. But I have used 3 port on the router. so click on the router>Zoom in>uppe-right corner of the Router, a switch will be seen.Turn it off>select PT-ROUTER-NM-1CFE from left panel>A black port is seen in the lower right corner of the window.Drag it to the router's Blank Port. DONT REMEMBER TO TURN ON THE SWITCH U have TURNED OFF]
**Then follow the CLI.txt provided in the Folder




TEST::

>>>Add some User..

Configure User:
User(click on it)>Desktop>IP Configuaration>DHCP [jodi automatic  DHCP request kore IP gateway bosai dey then 50% kaj sesh]



User>Web Browser> 'www.test.com'[ DNS e j name ta assign orci oita ekhane hobe][page jodi ashe then OK, na ashle mara!! :3]

Showing ping or packet loss
User>Command Prompt> write 'ping [server er ip] i.e 'ping 192.168.2.2'
