package scheduler;

public interface Scheduler {

    // public abstract 자동으로 붙는다.
    void getNextCall();
    void sendCallToAgent();

}
