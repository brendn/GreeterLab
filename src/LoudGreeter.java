import java.util.Locale;

class LoudGreeter extends Greeter {

    private String extra = "!";

    public LoudGreeter(String greeting) {
        super(greeting);
    }

    @Override
    public String greet(String name) {
        return super.greet(name).toUpperCase(Locale.ROOT) + extra;
    }

    public void addVolume() {
        extra += "!";
    }
}
