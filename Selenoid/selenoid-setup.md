# Selenoid

Selenoid is a powerful Golang implementation of original Selenium hub code. It is using Docker to launch browsers.

### Features

 - One command installation
 - Ready to use browser images
 - Live browser screen and logs
 - Video Recording
 - Lightweight and lightning fast
 
### Installation and usage

Selenoid can be installed many ways. Easiest way is using the configuration manager - `cm` by Selenoid team.

- Download `cm` binary for your OS from [here](https://github.com/aerokube/cm/releases/tag/1.7.2): 

- Navigate to the folder where the `cm` executable is installed and run the below 

```
$ ./cm.exe selenoid start --vnc
```

- Once the browser containers are started, navigate to browser with the URL as below.
```
http://localhost:4444/grid/console
```

- To check the status of the grid
```
http://localhost:4444/status
```

- Use this to stop the `selenoid` process
```
$ ./cm.exe selenoid stop
```

- In order to see the live execution Selenoid team provides another utility called **Selenoid UI**. It is the graphical user interface for Selenoid project.

To start the `selenoid-ui` process use the below
```
$ ./cm.exe selenoid-ui start
```

- Once the `selenoid` and `selenoid-ui` containers are up running - start the tests pointing at the remote URL `http://localhost:4444/wd/hub` 

- Check the live execution on browser
```
http://localhost:8080/#/
```

- Stop the `selenoid-ui` container once the tests are executed
```
$ ./cm.exe selenoid-ui stop
```

- Stop the `selenoid` container once the tests are executed
```
$ ./cm.exe selenoid stop 
```

### Additional References

- [Selenoid Github page](https://github.com/aerokube/selenoid)
- [Selenoid Official documentation](https://aerokube.com/selenoid/latest/)
- [Selenoid UI Github page](https://github.com/aerokube/selenoid-ui)
- [Selenoid UI Official documentation](https://aerokube.com/selenoid-ui/latest/)