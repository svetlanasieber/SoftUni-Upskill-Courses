#include <WiFi.h>
#include <WebServer.h>

// Replace with your network credentials
const char* ssid = "Wokwi-GUEST";
const char* password = "";

WebServer server(80);  // Create a web server object that listens for HTTP request on port 80

// This function handles all incoming requests
void handleAllRequests() {
  String message = "URI Requested: ";
  message += server.uri();  // Get the requested URI

  // You can implement different behaviors based on the URI
  // For example:
  if (server.uri() == "/") {
    server.send(200, "text/html", "<h1>Welcome to the ESP32 Web Server</h1>");
  } else if (server.uri() == "/info") {
    server.send(200, "text/html", "<h1>Information Page</h1>");
  } else {
    message += "\nHandled in generic function";
    server.send(200, "text/plain", message);
  }
}

void setup() {
  Serial.begin(115200);
  WiFi.begin(ssid, password);  // Connect to your WiFi network

  while (WiFi.status() != WL_CONNECTED) {  // Wait until the connection has been established
    delay(500);
    Serial.print(".");
  }

  Serial.println("");
  Serial.print("Web server is running at http://");
  Serial.print(WiFi.localIP());
  Serial.println("/");

  // Setup a catch-all route
  server.onNotFound(handleAllRequests);

  server.begin();  // Start the server
}

void loop() {
  server.handleClient();  // Handle client requests
}
