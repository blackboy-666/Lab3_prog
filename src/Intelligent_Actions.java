public interface Intelligent_Actions extends Actions{
    //сообщили, приняли меры, арестован, клялся, проверить, удирали, включилось
    void report();
    void take_measures();
    void arrested();
    void swear();
    void ransack();
    void check();
    String got_away();
    void turned_on();
}
