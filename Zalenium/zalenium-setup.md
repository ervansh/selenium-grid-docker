# Zalenium

Zalenium is a flexible and scalable container based Selenium Grid solution.

- Starts a Selenium Grid in seconds, a grid that scales up and down dynamically with this solution based on docker-selenium
- Can run tests in Chrome and Firefox
- For other browsers, Zalenium can redirect the tests to a cloud testing provider (Sauce Labs, BrowserStack, TestingBot, CrossBrowserTesting, LambdaTest)
- Works out of the box in Docker and Kubernetes
- 100% open-source project
- With In built features such as
    1. Video recording
    2. Live preview
    3. Basic auth
    4. Dashboard

### Installation and setup

- Pull docker-selenium

```
$ docker pull elgalu/selenium
```

- Pull Zalenium
```
$ docker pull dosel/zalenium
```

- Run it!
```
$ docker run --rm -ti --name zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v /tmp/videos:/home/seluser/videos --privileged dosel/zalenium start
```

- Point your tests at

```
http://localhost:4444/wd/hub
```

- Once the tests are completed, stop the container

```
$ docker stop zalenium
```

- Live preview while test execution

```
http://localhost:4444/grid/admin/live
```

- Live preview with an auto page refresh

```
http://localhost:4444/grid/admin/live?refresh=20
```

- Execution dashboard

```
http://localhost:4444/dashboard/
```

- Check the grid status

```
http://localhost:4444/status
```

### References

- [Zalenium](https://opensource.zalando.com/zalenium/)
- [Zalenium Github page](https://github.com/zalando/zalenium)