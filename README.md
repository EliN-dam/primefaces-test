![PrimeFaces icon](https://www.primefaces.org/wp-content/uploads/2016/10/prime_logo_new.png)

# PrimeFaces Test

This is a sample maven project that uses <strong>Latest PrimeFaces Release</strong> version. If you have a PrimeFaces issue, please download or fork this project. Then, you should change these files by yourself so that PrimeFaces Team can see your problem. Finally, you can send a link or attach the project. <strong>Please make sure that project is runnable with the command below.</strong>

You can execute the sample with <strong>mvn jetty:run</strong> command and hit <strong>http://localhost:8080/primefaces-test</strong> to run the page.

### Use case
***

To reproduce the issue follow the steps bellow:
1. Shrink the windows until navbar change toa toggle button
2. Check the button: expand and collapse the menu
3. Navigate to page 2 by pressing "Page 2" button
4. Check the navbar button again: expand and collapse
5. The button only works once

This problem only happens if navigate between the views using forward method, if you made a redirect the button works fine.

### JSF Versions
***

Per default the application uses Mojarra 2.2.x. 
You can also use other versions with the available maven profiles: myfaces22, myfaces23, myfaces23next, mojarra23

`mvn clean jetty:run -Pmyfaces22`

`mvn clean jetty:run -Pmyfaces23`

`mvn clean jetty:run -Pmyfaces23next`

`mvn clean jetty:run -Pmojarra22`

`mvn clean jetty:run -Pmojarra23`

### Server Port
***

By default the application runs on port 8080 but if you would like to use a different port you can pass `-Djetty.port=5000` like:

`mvn clean jetty:run -Djetty.port=5000`
