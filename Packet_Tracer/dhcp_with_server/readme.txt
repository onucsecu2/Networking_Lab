Devices(Devices Type)-Name
Laptop-PT(End-Devices-Generic) -User
Router-PT(Router-Generic)-Router
Switch-PT(Switch-Generic)-Switch0
Switch-PT(Switch-GEneric)-Switch1
Server-PT(Server-Generic)-HTTP
Server-PT(Server-Generic)-DNS
Server-PT(Server-Generic)-DHCP

Connections-> "Automatically choose Connection Type"


Configure Router:
Router>CLI
**Then follow the CLI.txt provided here




Configure HTTP:
HTTP(Click on it)>Desktop>IP configuaration 

                 >Services>HTTP> [HTTP and HTTPS turn ON]
                          >DNS > [ DNS service Turn OFF as we wont use it as DNS.]
                          >DHCP> Service OFF
DNS(Click on it)>Desktop>IP configuaration 

                 >Services>HTTP> [HTTP and HTTPS turn OFF]
                          >DNS > [ DNS service Turn ON][Give a 'Name'=> 'web er nam ekta dibi','Type'=>'A record','Address'=> 'web server tar Ip',then Add]
                          >DHCP> Service OFF
DHCP(Click on it)->Desktop>IP configuaration 
                  >Services>HTTP> [HTTP and HTTPS turn OFF]
                           >DNS> [ DNS service Turn OFF as we wont use it as DNS.]
                           >DHCP> Turn ON
                                        >DNS Server [...]
                                        >Default gateway [Important :eta Router e DHukte fastEthernet IP ta hobe.Be careful!]
                                        >Start IP: 10 ta badhe kora safe.
TEST::

>>>Add some User..

Configure User:
User(click on it)>Desktop>IP Configuaration>DHCP [jodi automatic  DHCP request kore IP gateway bosai dey then 50% kaj sesh]



User>Web Browser> 'www.test.com'[ DNS e j name ta assign orci oita ekhane hobe][page jodi ashe then OK, na ashle mara!! :3]

Showing ping or packet loss
User>Command Prompt> write 'ping [server er ip] i.e 'ping 192.168.2.2'
