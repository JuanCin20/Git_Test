const operatingSystem = require("os");

const platform = operatingSystem.platform();
const type = operatingSystem.type();
const uptime = operatingSystem.uptime();
const totalmem = operatingSystem.totalmem();
const arch = operatingSystem.arch();
const cpus = operatingSystem.cpus();
const networkInterfaces = operatingSystem.networkInterfaces();

console.log("platform: " + platform);
console.log("type: " + type);
console.log("uptime: " + uptime);
console.log("totalmem: " + totalmem);
console.log("arch: " + arch);
console.log(cpus);
console.log(networkInterfaces);

const httpProtocol = require("http");
const hostName = "127.0.0.1";
const port = 1337;

httpProtocol
  .createServer((request, response) => {
    response.writeHead(200, { "Content-Type": "text/html" });
    response.end("<h1 style='color: rgb(0, 0, 255)';>Hello World!</h1>");
  })
  .listen(port, hostName, () => {
    console.log(`Server Initialized in: http://${hostName}:${port}/`);
  });

// ? telnet 127.0.0.1 7000
var telnet = require("net");
telnet
  .createServer(function (stream) {
    stream.write("Hello World!");
    stream.on("end", function () {
      stream.end("End Session");
    });
  })
  .listen(7000);