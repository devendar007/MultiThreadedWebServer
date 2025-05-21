# Multithreaded Web Server with Optimized Thread Pool

A high-performance multithreaded web server implemented in Java. This server uses a thread pool to efficiently handle multiple client requests, ensuring scalability and reduced latency under heavy loads.

## Features

* Concurrently handles multiple client connections using a fixed thread pool.
* Optimized for high throughput and resource efficiency.
* Tested with JMeter to handle 1,000,000 requests.
* Provides consistent performance with minimal response time deviation.

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/username/multithreaded-web-server.git
   ```
2. Navigate to the project directory:

   ```bash
   cd multithreaded-web-server
   ```
3. Compile the Java files:

   ```bash
   javac Server.java
   ```
4. Run the server:

   ```bash
   java Server
   ```

## Usage

1. Start the server:

   ```bash
   java Server
   ```
2. Use a tool like Postman, a browser, or a custom client to connect to the server:

   * Default port: `8010`
   * Server responds with a simple message upon connection.
3. To stress-test the server, use JMeter:

   * Configure JMeter to send up to 1,000,000 requests.
   * Analyze the results to evaluate performance.

## Performance Testing

The server was stress-tested using JMeter with the following results:

* **Test Configuration**: 1,000,000 requests, varying concurrency levels.
* **Performance Observations**:

  * Single-threaded Server: High response time and poor scalability.
  * Traditional Multithreaded Server: Resource exhaustion under high load.
  * Thread Pool Implementation:

    * Consistent response times.
    * Minimal deviation in latency.
    * Efficient CPU and memory usage.

### Performance Comparison

| Model                     | Throughput (requests/sec) | Avg. Latency (ms) | Max Threads Used |
| ------------------------- | ------------------------- | ----------------- | ---------------- |
| Single-threaded Server    | 500                       | 1200              | 1                |
| Traditional Multithreaded | 1500                      | 800               | 1000+            |
| Thread Pool               | 3000                      | 200               | 10               |

## Technologies Used

* **Languages**: Java
* **Tools**: ExecutorService, Thread Pool, Apache JMeter
* **Testing Framework**: JMeter

## Contributing

Contributions are welcome! To contribute:

1. Fork this repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request for review.

