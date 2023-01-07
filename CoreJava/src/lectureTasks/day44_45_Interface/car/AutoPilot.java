package lectureTasks.day44_45_Interface.car;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true; // static & final by default

    void selfDrive();    // abstract by default

}
