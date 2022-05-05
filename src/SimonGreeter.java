class SimonGreeter extends Greeter {

    public SimonGreeter(String greeting) {
        super(greeting);
    }

    @Override
    public String toString() {
        return "SimonGreeter";
    }

    @Override
    public String greet(String name) {
        return String.format("Simon says, %s", super.greet(name));
    }
}
