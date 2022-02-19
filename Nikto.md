```
Scan your web server for vulnerabilities. 

Nikto is an Open Source (GPL) free vulnerability scanner software that scans web servers for over 6700 potentially dangerous files/programs

If you are looking to test Intranet applications or in-house applications, then you can use the Nikto web scanner. It will test a web server in 
the quickest time possible. Nikto is included in Kali Linux.
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
```
$ nikto -h <IP or hostname>
For Example : $ nikto -h thewebchecker.com
```
![image](https://user-images.githubusercontent.com/59710234/154804141-0769a334-23dc-4774-977f-c699aeb8d6bd.png)
```
$ nikto
```
![image](https://user-images.githubusercontent.com/59710234/154814147-d423ffcc-594c-4e3a-8e12-dcaf4c2cfc80.png)
