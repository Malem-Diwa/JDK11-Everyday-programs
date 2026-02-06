Ini adalah program yang memprint isi konten di situs
terspesifikasi. Desainnya sangat simple. Pastikan skemanya selalu
ditulis sebelum host dan path. (http/https/file)
Input structure must be: scheme://host/path
---------------------------------------------------
**How it works**
java.util.Scanner will scan your Input by *nextLine()*,
then, it passes the string to java.net.URI, then java.net.URL converts URI to URL.
After that, it opens InputStream and then read the entire response
by another Scanner that functions as NetworkScanner.
After all of that, it then does A while loop while NetworkScanner *hasNextLine()* while also *println(NETWORKSCANNER.nextLine())*.
After all of that, it then closes NetworkScanner and the regular scanner.
