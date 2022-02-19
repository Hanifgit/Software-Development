### Nikto
```
Scan your web server for vulnerabilities. 

Nikto is an Open Source (GPL) free vulnerability scanner software that scans web servers for over 6700 potentially dangerous files
or programs

If you are looking to test Intranet applications or in-house applications, then you can use the Nikto web scanner. It will test
a web server in the quickest time possible. Nikto is included in Kali Linux.
```
### Nikita History
```
Original author: Chris Sullo

Release: 2.1.6 / July 9, 2015

Write: Perl, HTML, roff (software), Dockerfile

Operating system: Unix-like

Available in : English

Type : Vulnerability scanner

Supported Platforms: Windows and Linux
```
### How to install Nikto on Linux
```
If you are using a Kali Linux machine then Nikto is already pre-installed in it. 

Step 1: root@kali:~# git clone https://github.com/sullo/nikto.git
Step 2: root@kali:~# cd nikto/program
Step 3: root@kali:~/nikto/program# perl nikto.pl

```
### Using Nikto on Kali Linux
```
Since it’s inbuilt in Kali, you don’t need to install anything.
```
![image](https://user-images.githubusercontent.com/59710234/154805095-e2fb3bd0-5373-4ffc-a5c8-ec01705119ed.png)
```
It will open the terminal where you can run the scanning against your web server. There is multiple syntaxes you 
can use to run the scan.
```
### Nikto Version
```
$ nikto
```
![image](https://user-images.githubusercontent.com/59710234/154814147-d423ffcc-594c-4e3a-8e12-dcaf4c2cfc80.png)

### Updating Nikto
```
nikto -update
```
### Nikto Help Menu
```
$ nikto -Help or
$ nikto -h

See all the functionality that used in nikto
```
![image](https://user-images.githubusercontent.com/59710234/154814974-8f51234b-b909-4c2d-b144-e74a01ea7501.png)

### Nikto Web Server Scan (Server IP)
```
$ nikto -h <IP or hostname>

For Example : 
$ nikto -h thewebchecker.com
$ nikto -h 45.33.32.156

N.T: scan a host with Nikto. Here -h means the host
```
### Save the Scanning Result a Text File
```
Nikto –h [Server IP Address] –p [port] –o [file name] –F [file type]

For Example :
$ nikto -h 45.33.32.156 -p 80 -o nikto_result -F txt

The default port is 80, so if you did not specify the port it will be 80 by default.
```
![image](https://user-images.githubusercontent.com/59710234/154804141-0769a334-23dc-4774-977f-c699aeb8d6bd.png)

### Scan a Specific Port for Server IP
```
nikto -h serverIp -p port
For Example: 
$ nikto -h 119.18.48.147 -p 80

Here -p means Port
```
### Proxy Server and Scan ServerIp
```
First, we need to go to the Nikto config file. We can find out nikto config file using this command.
$ locate nikto.conf

And uncomment these two lines.
```
![image](https://user-images.githubusercontent.com/59710234/154817466-2e1c6976-c1c6-4586-a3ad-7ffbe9821a01.png)

```
Then save the file. After saving the file go to terminal and enter this command. It will start a scan but this 
time using proxy.

nikto -h serverIp -useproxy

For Example: nikto -h 119.18.48.147 -useproxy
```
### Nikto Multi Domain Scan
```
 IP addresses or domains put them in a text file (domains.txt) separated by newlines. Nikto will know that the scan has to be performed on each domain / IP address.
 
  touch file   — create or update file
  nano file    — file inside some writing
  rm  file    — delete file
  cat > file     — places standard input into file
  cat file    — file inside text show
  
  domains.txt =>
   scanme.nmap.org
   nmap.org.
  
  nikto -h file_name.txt
  
  For Example : 
  $ nikto -h domains.txt
```
![image](https://user-images.githubusercontent.com/59710234/154817223-b3edca82-b05e-49ff-a2be-6ee5561e7962.png)
