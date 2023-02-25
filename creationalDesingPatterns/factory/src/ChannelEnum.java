public enum ChannelEnum {
    SMS("sms"),
    PUSH("push"),
    EMAIL("email");

    private final String channel;

    ChannelEnum(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }
}
