```Scan your web server for vulnerabilities. 

If you are looking to test Intranet applications or in-house applications, then you can use the Nikto web scanner. It is capable 
of scanning for over 6700 items to detect misconfiguration, risky files, etc. and some of the features include.
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
![image](https://user-images.githubusercontent.com/59710234/154803045-2009dc12-5e99-4321-99da-ea02ce580d8e.png)
```
It will open the terminal where you can run the scanning against your web server. There is multiple syntaxes you 
can use to run the scan.
```
```
$ nikto –h $webserver_url      [Don’t forget to change $webserverurl with your web server actual IP or FQDN.]
For Example : $ nikto -h thewebchecker.com
```
![image](https://user-images.githubusercontent.com/59710234/154804141-0769a334-23dc-4774-977f-c699aeb8d6bd.png)
