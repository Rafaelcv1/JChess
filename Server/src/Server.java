void main() {
    try {
        ServerConnection.startServer(1234);
    } catch (Exception e) {
        IO.println("Error to start the server: " + e);
    }
}
