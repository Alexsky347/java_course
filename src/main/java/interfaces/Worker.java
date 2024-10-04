package interfaces;

public interface Worker {
    void doWork();
    void lunchBreak();
    void clockOut();
    String getSomeValue();

    default String getWorkerType(){
        return "Worker Type default";
    };
}
