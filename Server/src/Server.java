void main() {
    try {
        ServerConnection.startServer(1234);
    } catch (Exception e) {
        IO.println("deu erro no servidor ó: " + e);
    }
}
