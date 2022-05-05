class HtmlGreeter extends Greeter {

    private String tagName;

    public HtmlGreeter(String greeting) {
        super(greeting);
        this.tagName = "h1";
    }

    public HtmlGreeter(String greeting, String tagName) {
        super(greeting);
        setTagName(tagName);
    }

    public void setTagName(String tagName) {
        if (tagName.startsWith("</")) {
            tagName = tagName.substring(2);
        } else if (tagName.startsWith("<")) {
            tagName = tagName.substring(1);
        }
        if (tagName.endsWith(">")) {
            tagName = tagName.substring(0, tagName.length() - 1);
        }
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "HtmlGreeter";
    }

    @Override
    public String greet(String name) {
        return String.format("<%s>%s</%s>", tagName, super.greet(name), tagName);
    }
}
