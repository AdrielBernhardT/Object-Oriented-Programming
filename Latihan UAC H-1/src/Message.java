public abstract class Message {
    public ILogin Login;
    public String sender;
    public String recipient;
    public String content;

    public Message(ILogin Login, String sender, String recipient, String content) {
        this.Login = Login;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public abstract void send(String username, String password);
}
